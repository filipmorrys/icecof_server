package com.indra.davinci.icecofsim.topology;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
		entityManagerFactoryRef = "topologyEntityManagerFactory", 
		basePackages = {"com.indra.davinci.icecofsim.topology.repo" }, 
		transactionManagerRef = "topologyTransactionManager"
	)
public class TopologyConfiguration {

	public TopologyConfiguration() {
	}

	@Primary
	@Bean(name = "topologyDataSource")
	@ConfigurationProperties(prefix = "topology.datasource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}

	@Primary
	@Bean(name = "topologyEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder,
			@Qualifier("topologyDataSource") DataSource dataSource) {
		return builder
				.dataSource(dataSource)
				.packages("com.indra.davinci.icecofsim.topology.domain")
				.persistenceUnit("topology")
				.build();
	}

	@Primary
	@Bean(name = "topologyTransactionManager")
	public PlatformTransactionManager transactionManager(
			@Qualifier("topologyEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
		return new JpaTransactionManager(entityManagerFactory);
	}
	
}

package com.indra.davinci.icecofsim.topology;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactory", basePackages = {
		"com.indra.davinci.icecofsim.topology.repo" })

public class TopologyConfiguration {

	public TopologyConfiguration() {
	}

	@Primary
	@Bean(name = "topologyDataSource")
	@ConfigurationProperties(prefix = "topology.datasource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}

	// @Primary
	// @Bean
	// public LocalContainerEntityManagerFactoryBean
	// topologyEntityManagerFactory(EntityManagerFactoryBuilder builder,
	// @Qualifier("topologyDataSource") DataSource dataSource) {
	// return builder
	// .dataSource(dataSource())
	// .packages("com.indra.davinci.icecofsim.topology")
	// .persistenceUnit("topology")
	// .build();
	// }

}

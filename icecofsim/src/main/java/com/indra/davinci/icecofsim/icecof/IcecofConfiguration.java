package com.indra.davinci.icecofsim.icecof;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
		entityManagerFactoryRef = "icecofEntityManagerFactory", 
		basePackages = {"com.indra.davinci.icecofsim.icecof.repo" },
		transactionManagerRef = "icecofTransactionManager"
	)
public class IcecofConfiguration {

	public IcecofConfiguration() {
	}

	@Bean(name = "icecofDataSource")
	@ConfigurationProperties(prefix = "icecof.datasource")
	public DataSource icecofDataSource() {
		return DataSourceBuilder.create().build();
	}
		
	@Bean(name = "icecofEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder,
			@Qualifier("icecofDataSource") DataSource dataSource) {
		return builder
				.dataSource(dataSource)
				.packages("com.indra.davinci.icecofsim.icecof.domain")
				.persistenceUnit("icecof")
				.build();
	}
	
	@Bean(name = "icecofTransactionManager")
	public PlatformTransactionManager transactionManager(
			@Qualifier("icecofEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
		return new JpaTransactionManager(entityManagerFactory);
	}
	
}

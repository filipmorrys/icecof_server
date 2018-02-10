package com.indra.davinci.icecofsim.icecof;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactory", basePackages = {
		"com.indra.davinci.icecofsim.icecof.issues.repo",
		"com.indra.davinci.icecofsim.icecof.workontracks.repo"})

public class IcecofConfiguration {

	public IcecofConfiguration() {
	}


	@Bean(name = "icecofDataSource")
	@ConfigurationProperties(prefix = "icecof.datasource")
	public DataSource icecofDataSource() {
		return DataSourceBuilder.create().build();
	}
		



//	@Bean(name = "entityManagerFactory")
//	public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder,
//			@Qualifier("wotDataSource") DataSource dataSource) {
//		return builder.dataSource(dataSource).packages("com.indra.davinci.icecofsim.workontracks.data")
//				.persistenceUnit("wot").build();
//	}
	
//	@Primary
//	@Bean
//	public LocalContainerEntityManagerFactoryBean wotEntityManagerFactory(EntityManagerFactoryBuilder builder,
//			@Qualifier("wotDataSource") DataSource dataSource) {
//		return builder.dataSource(dataSource()).packages(WorkOnTrack.class).persistenceUnit("wot").build();
//	}
//
//	@Primary
//	@Bean(name = "transactionManager")
//	public PlatformTransactionManager transactionManager(
//			@Qualifier("entityManagerFactory") EntityManagerFactory entityManagerFactory) {
//		return new JpaTransactionManager(entityManagerFactory);
//	}
}

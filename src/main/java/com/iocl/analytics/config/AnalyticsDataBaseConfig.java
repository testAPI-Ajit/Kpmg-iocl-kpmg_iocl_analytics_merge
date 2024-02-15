package com.iocl.analytics.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;

@Configuration
@EnableTransactionManagement

@EnableJpaRepositories(entityManagerFactoryRef = "analyticsEntityManagerFactory", basePackages = {
		"com.iocl.analytics.dest.repo" })
public class AnalyticsDataBaseConfig {

	@Bean(name = "destinationDataSource")
	@ConfigurationProperties(prefix = "spring.datasource.destination")
	DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "analyticsEntityManagerFactory")
	LocalContainerEntityManagerFactoryBean entityManagerFactoryMaterial(EntityManagerFactoryBuilder builder, @Qualifier("destinationDataSource") DataSource dataSource) {
		return builder.dataSource(dataSource).packages("com.iocl.analytics.dest.entity").persistenceUnit("analytics_db")
				.build();
	}

	@Bean(name = "transactionManager")
	PlatformTransactionManager transactionManager(
			@Qualifier("analyticsEntityManagerFactory") EntityManagerFactory entityManagerFactory) {

		return new JpaTransactionManager(entityManagerFactory);
	}

}
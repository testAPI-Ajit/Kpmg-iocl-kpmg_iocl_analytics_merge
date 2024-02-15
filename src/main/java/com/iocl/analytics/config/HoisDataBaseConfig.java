
package com.iocl.analytics.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration

@EnableTransactionManagement

@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactory", basePackages = { "com.iocl.analytics.repo" })

public class HoisDataBaseConfig {
	@Primary
	@Bean(name = "hois")
	@ConfigurationProperties(prefix = "spring.datasource")
	DataSource customerDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Primary
	@Bean(name = "entityManagerFactory")
	LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder,

			@Qualifier("hois") DataSource dataSource) {
		return builder.dataSource(dataSource).packages("com.iocl.analytics.source.entity")
				.persistenceUnit("genplsqldev").build();
	}

}

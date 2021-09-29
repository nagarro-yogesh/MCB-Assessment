package com.mcb.studentservice.configuration;

import javax.sql.DataSource;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.configuration.FluentConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;

@Configuration
public class CommonConfiguration {

	@Bean
	public FluentConfiguration atflywayConfiguration(DataSource dataSource) {
		FluentConfiguration configuration = Flyway.configure().dataSource(dataSource).locations("db/mysql");
		configuration.cleanDisabled(Boolean.TRUE);
		configuration.placeholderReplacement(Boolean.FALSE);
		configuration.ignoreFutureMigrations(Boolean.TRUE);
		configuration.outOfOrder(Boolean.TRUE);
		configuration.ignorePendingMigrations(Boolean.TRUE);
		configuration.ignoreMissingMigrations(Boolean.TRUE);
		configuration.baselineOnMigrate(Boolean.TRUE);
		configuration.baselineVersion("0");
		return configuration;
	}

	@Bean
	public Flyway atmigrateScripts(DataSource dataSource) {
		Flyway flyway = new Flyway(atflywayConfiguration(dataSource));
		flyway.migrate();
		return flyway;
	}

	@ConditionalOnMissingBean
	@Bean
	public DispatcherServlet dispatcherServlet() {
		DispatcherServlet dispatcherServlet = new DispatcherServlet();
		dispatcherServlet.setThrowExceptionIfNoHandlerFound(Boolean.TRUE);
		return dispatcherServlet;
	}

}

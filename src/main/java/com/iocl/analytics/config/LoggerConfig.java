package com.iocl.analytics.config;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.appender.ConsoleAppender;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.core.config.builder.api.AppenderComponentBuilder;
import org.apache.logging.log4j.core.config.builder.api.ComponentBuilder;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilder;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilderFactory;
import org.apache.logging.log4j.core.config.builder.api.LayoutComponentBuilder;
import org.apache.logging.log4j.core.config.builder.api.RootLoggerComponentBuilder;
import org.apache.logging.log4j.core.config.builder.impl.BuiltConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.iocl.analytics.util.CreateLogDirectory;

@Configuration
public class LoggerConfig {
	@Value("${log.file.path}") // Inject path from properties file
	private String logFilePath;// = "D:\\IOCL\\producer\\iocl_soap_log"

	@Value("${log.file.name}") // Inject path from properties file
	private String logFileName;

	@Bean
	public void initializeLogger() {

		CreateLogDirectory cd = new CreateLogDirectory();
		String destination_path = cd.createFolderIfNotExists(logFilePath, logFileName);

		ConfigurationBuilder<BuiltConfiguration> builder = ConfigurationBuilderFactory.newConfigurationBuilder();

		builder.setStatusLevel(Level.DEBUG);
		builder.setConfigurationName("DefaultLogger");

		// create a console appender
		AppenderComponentBuilder appenderBuilder = builder.newAppender("Console", "CONSOLE").addAttribute("target",
				ConsoleAppender.Target.SYSTEM_OUT);
		appenderBuilder.add(builder.newLayout("PatternLayout").addAttribute("pattern",
				"%d{HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n"));
		RootLoggerComponentBuilder rootLogger = builder.newRootLogger(Level.INFO);
		rootLogger.add(builder.newAppenderRef("Console"));

		builder.add(appenderBuilder);

		// create a rolling file appender
		LayoutComponentBuilder layoutBuilder = builder.newLayout("PatternLayout").addAttribute("pattern",
				"%d{HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n");
		ComponentBuilder triggeringPolicy = builder.newComponent("Policies")
				.addComponent(builder.newComponent("SizeBasedTriggeringPolicy").addAttribute("size", "100KB"));
		appenderBuilder = builder.newAppender("LogToRollingFile", "RollingFile")
				.addAttribute("fileName", logFileName)
				.addAttribute("filePattern", logFileName + "-%d{MM-dd-yy-HH-mm-ss}.log.").add(layoutBuilder)
				.addComponent(triggeringPolicy);
		builder.add(appenderBuilder);
		rootLogger.add(builder.newAppenderRef("LogToRollingFile"));
		builder.add(rootLogger);
		Configurator.reconfigure(builder.build());
	}
}

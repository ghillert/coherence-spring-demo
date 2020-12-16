/*
 * Copyright (c) 2020, Oracle and/or its affiliates.
 *
 * Licensed under the Universal Permissive License v 1.0 as shown at
 * http://oss.oracle.com/licenses/upl.
 */
package com.oracle.coherence.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Profiles;

import com.oracle.coherence.spring.boot.autoconfigure.CachingEnabledCondition;

/**
 * Entry point to the Coherence Spring Demo Application.
 *
 * By default, the application will use Java Configuration classes in order to
 * configure the Spring Application Context. However, by activating the {@code XML}
 * profile ({@link Profiles}), the XML based configuration defined in
 * {@code spring-applicationContext.xml} is used instead.
 *
 * @author Gunnar Hillert
 *
 */
@SpringBootApplication
@EnableCaching
public class CoherenceSpringBootDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(CoherenceSpringBootDemoApplication.class, args);
		new CachingEnabledCondition();
	}

}

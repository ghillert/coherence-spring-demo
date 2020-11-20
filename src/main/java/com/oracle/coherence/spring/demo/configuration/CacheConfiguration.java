/*
 * Copyright (c) 2020, Oracle and/or its affiliates.
 *
 * Licensed under the Universal Permissive License v 1.0 as shown at
 * http://oss.oracle.com/licenses/upl.
 */
package com.oracle.coherence.spring.demo.configuration;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.oracle.coherence.spring.CoherenceInstance;
import com.oracle.coherence.spring.cache.CoherenceCacheManager;

@Configuration
@Profile("!xml")
@EnableCaching
public class CacheConfiguration {

	@Bean
	public CoherenceInstance coherenceInstance() {
		return new CoherenceInstance();
	}

	@Bean
	public CacheManager cacheManager(CoherenceInstance coherenceInstance) {
		return new CoherenceCacheManager(coherenceInstance);
	}
}

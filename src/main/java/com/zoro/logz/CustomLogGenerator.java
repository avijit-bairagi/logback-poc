package com.zoro.logz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class CustomLogGenerator {

    private static final Logger log = LoggerFactory.getLogger(CustomLogGenerator.class);

    @Scheduled(fixedDelay = 5000)
    public void log() {

        for (int i = 0; i < 100; i++) {
            log.info("Custom log {}", i);
        }
    }
}

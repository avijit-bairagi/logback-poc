package com.zoro.logz;

import ch.qos.logback.core.rolling.RolloverFailure;
import ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomLogRollingPolicy<E> extends SizeAndTimeBasedRollingPolicy<E> {

    private final Logger logger = LoggerFactory.getLogger(CustomLogRollingPolicy.class);

    @Override
    public void rollover() throws RolloverFailure {
        var fileName = super.getTimeBasedFileNamingAndTriggeringPolicy().getElapsedPeriodsFileName();
        super.rollover();
        logger.info("Settlement rolling file name: {}", fileName);
        // here we can add custom logic for that file
    }
}

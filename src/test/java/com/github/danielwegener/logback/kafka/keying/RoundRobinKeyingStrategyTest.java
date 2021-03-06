package com.github.danielwegener.logback.kafka.keying;

import ch.qos.logback.classic.spi.ILoggingEvent;
import org.junit.Test;
import org.mockito.Mockito;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;


public class RoundRobinKeyingStrategyTest {

    private final RoundRobinKeyingStrategy unit = new RoundRobinKeyingStrategy();

    @Test
    public void shouldAlwaysReturnNull() {
        assertThat(unit.createKey(Mockito.mock(ILoggingEvent.class)), is(nullValue()));
    }

}
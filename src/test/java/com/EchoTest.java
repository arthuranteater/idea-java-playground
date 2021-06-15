package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EchoTest {

    @Test
    void name() {
    }

    @Test
    public void echo_shout_returns_uppercase() {
        //setup - given
        Echo echo = new Echo();
        //exec - when
        String result = echo.shout("hello");
        //assert - then
        assertEquals("HELLO!", result);
    }
}

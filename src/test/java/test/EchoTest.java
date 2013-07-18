package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class EchoTest {

    @Test
    public void test() {
        assertEquals("hello", new Echo().echo("hello"));
    }
}

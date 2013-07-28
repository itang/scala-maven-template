package example;

import static org.junit.Assert.*;

import org.junit.Test;

import example.Echo;

public class EchoTest {

    @Test
    public void test() {
        assertEquals("hello", new Echo().echo("hello"));
    }
}

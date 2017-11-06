package com.per.swing.hello;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class GreeterTest {

    private Greeter greeter = new Greeter();

    @Test
    public void greeterSaysHelloTest() {
        assertThat(greeter.getHello(), containsString("Hello"));
    }

}

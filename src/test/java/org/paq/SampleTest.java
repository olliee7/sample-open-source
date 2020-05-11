package org.paq;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class SampleTest {
	@Test
    public void testGetMessage() {
        assertEquals("Hello World!", MyCode.returnSame("Hello World!"));
    }

    @Test
    public void testGetMessage2() {
        assertEquals("Hello Universe!", MyCode.returnDifferent("Hello World!"));
    }
}

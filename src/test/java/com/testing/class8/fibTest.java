package com.testing.class8;

import junit.framework.TestCase;

public class fibTest extends TestCase {
    fib ft=new fib();

    public void testFib() {
        assertEquals(33,ft.fib(12));
    }
}
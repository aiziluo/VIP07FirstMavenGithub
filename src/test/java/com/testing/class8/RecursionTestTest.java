package com.testing.class8;

import junit.framework.TestCase;

import static org.junit.Assert.assertEquals;

public class RecursionTestTest extends TestCase {

    RecursionTest rt=new RecursionTest();

    public void testJiecheng() {
        assertEquals(120, RecursionTest.jiecheng(5));
        assertEquals(130,rt.jiecheng(6));
    }

}
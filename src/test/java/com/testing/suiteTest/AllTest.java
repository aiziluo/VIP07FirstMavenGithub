package com.testing.suiteTest;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//多个测试类同时测试，
//RecursionTestTest和LoginParamTest
@RunWith(Suite.class)
@Suite.SuiteClasses({com.testing.class8.RecursionTestTest.class,com.testing.class11.LoginSampleParamTest.class})
public class AllTest {
}

package com.testing.class11;

import junit.framework.TestCase;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginSampleTest {

    static LoginSample ls;

    @BeforeClass
    public static void classSetUp() {
        System.out.println("---------测试类开始执行前，执行的方法");
        //在测试方法执行前的准备工作，完成对象的实例化
        ls = new LoginSample();
    }

    @AfterClass
    public static void classTd() {
        System.out.println("---------测试类开始执行结束后，执行的方法");
    }


    public void setUp() throws Exception {
        System.out.println("---------每个测试方法，执行前执行的方法");
    }

    public void tearDown() throws Exception {
        System.out.println("---------每个测试方法，执行结束后，执行的方法");
    }

    @Test
    public void testLogin() {
        ls.login("Roy", "123456");
        //预期结果，登录成功
//        fail("也不知道执行了啥，没有结果，所以失败了");
        //断言，结果为“恭喜您，登录成”，是否与预期相符
        assertEquals("恭喜您，登录成", ls.getMsg());
    }

    @Test
    public void testGetMsg() {
        System.out.println("测试的结果是：" + ls.getMsg());
    }

    //预期结果，用户名不能为空
    @Test
    public void errorLogin(){
        ls.login(null,"123456");
//        System.out.println("测试结果是："+ls.getMsg());
        //断言，测试结果是是否包含“为空”字符串
        assertTrue(ls.getMsg().contains("为空"));
    }
}
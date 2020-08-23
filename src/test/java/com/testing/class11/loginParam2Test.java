package com.testing.class11;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class loginParam2Test {
    static LoginSample ls=new LoginSample();
//    static LoginSample ls;
    //定义成员变量
    String user;
    String pwd;
    String expectMsg;

    @Parameterized.Parameters(name="用户名是{0}，密码是{1}，执行结果是{2}")
    public static Object[][] loginData(){
        return new Object[][]{
                {"Roy","123456","登录成功"},
                {null,"123456","不能为空"},
                {"","123456","3-16位"},
                {"   ","123456","错误"},
                {"Ro","123456","3-16位"},
                {"Roy12345678912345","123456","3-16位"},
                {"Roy",null,"不能为空"},
                {"Roy","","3-16位"},
                {"Roy","   ","错误"},
                {"Roy","12","3-16位"},
                {"Roy","12345678912345678","3-16位"},
        };
    }

//    @BeforeClass
//    public static void setUp(){
//        ls=new LoginSample();
//    }

    //构造方法，给成员变量赋值，值为参数列表,所以参数与参数方法一致
    public loginParam2Test(String userParam,String pwdParam,String expectParam){
        user=userParam;
        pwd=pwdParam;
        expectMsg=expectParam;
    }

    //进行单元测试，使用参数
    @Test
    public void testLoginParam(){
        ls.login(user,pwd);
        System.out.println(ls.getMsg());
        Assert.assertTrue(ls.getMsg().contains(expectMsg));
    }

    public static class LoginSampleTestMsg {
        static LoginSample ls;

        @BeforeClass
        public static void setUp(){
            ls=new LoginSample();
        }

        @Test
        public void getMsg(){
            ls.login("Roy","12345");
            System.out.println("测试结果是："+ls.getMsg());
        }
    }
}

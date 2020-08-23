package com.testing.class11;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LoginSampleParamTest {
    static LoginSample ls;
    //创建成员变量，用于接收参数化的每一行数据
    String user;
    String pwd;
    String expectMsg;

    //生成参数
    //注解标注一个返回类型为二维数组，用于生成测试数据
    @Parameterized.Parameters(name="用户名是{0}时，执行结果应该是{2}")
    public static Object[][] loginData(){
//        Object[][] loginData=new Object[][]{};
        return new Object[][]{
                {"Roy","123456","登录成功"},
                {null,"123456","为空"},
                {"ro","123456","4-16位"},
                {"","123456","3-17位"},
                {"Royy","123456","错误"}
        };
    }

    @BeforeClass
    public static void classSetUp(){
        System.out.println("---------测试类开始执行前，执行的方法");
        //在测试方法执行前的准备工作，完成对象的实例化
        ls=new LoginSample();
    }

    //构造方法，用于将参数化返回的二维数组的数据，给成员变量赋值
    //构造方法的参数列表与二维数组每一行数据的类型和个数匹配
    public LoginSampleParamTest(String userParam, String pwdParam, String expectedParam){
        user=userParam;
        pwd=pwdParam;
        expectMsg=expectedParam;
    }

    @Test
    public void testLogin(){
        ls.login(user,pwd);
        System.out.println(ls.getMsg());
        Assert.assertTrue(ls.getMsg().contains(expectMsg));
    }

}
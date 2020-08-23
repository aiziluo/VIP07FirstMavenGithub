package com.testing.class10;

public class Tester implements Employer {
    //只有本类可以使用
    private String env="测试环境";
    @Override
    public void work() {
        System.out.println("测试的工作是找BUG跟开发讨论这是不是一个BUG");
    }

    @Override
    public String moyu(int time) {
        System.out.println("测试通过喝很多次水摸鱼");
        return "happy";
    }

    public void jiaban(){
        System.out.println("测试加班的时候总是陪着开发");
    }

    void dafaultWork(){
        System.out.println("这是一个默认级别default权限的方法，允许在同一个包（package)中调用或继承");
    }

    public void opEnv(){
        System.out.println("部署"+env);
    }


    protected void caseModule(){
        System.out.println("祖传的测试用模板");
    }

    protected static void manSpirit(){
        System.out.println("xx将男子气概遗传给儿子");
        System.out.println("不会遗传给儿媳妇");
    }

    public static void main(String[] args) {
        Tester hh=new Tester();
        System.out.println(hh.env);
        hh.manSpirit();
    }



}

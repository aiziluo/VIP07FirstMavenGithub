package com.testing.class10;

public class Developer implements Employer {

    @Override
    public void work() {
        System.out.println("开发的工作是写BUG和改BUG");
    }

    @Override
    public String moyu(int time) {
        System.out.println("开发今天通过带薪摸鱼" + time + "个小时");
        String mood = "";
        if (time >= 3) {
            System.out.println("摸鱼超过3小时，这才给自己赚了钱");
            mood = "happy";
        } else {
            System.out.println("摸鱼时间不够，开发不怎么高兴");
            mood="sad";
        }
        return mood;
    }

    public void writeBug(){
        System.out.println("开发今天又写了BUG");
    }
}

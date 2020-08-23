package com.testing.class10_HomeWork;

public class bicycle implements lunTai {

    @Override
    public void ganghua() {
        System.out.println("自行车   轮胎需要有钢材料");
    }

    @Override
    public void suliao() {
        System.out.println("自行车   轮胎需要有塑料用品");
    }
}

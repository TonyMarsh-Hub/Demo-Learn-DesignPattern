package factory.v1.Bread.Impl;

import factory.v1.Bread.Bread;

public class BrownBearBread implements Bread {
    @Override
    public void getColor() {
        System.out.println("烤的时间刚刚好的-----布朗熊面包！！！");
    }
}
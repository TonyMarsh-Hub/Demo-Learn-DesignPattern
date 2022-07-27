package factory.v1.Bread.Impl;

import factory.v1.Bread.Bread;

public class PolarBearBread implements Bread {
    @Override
    public void getColor() {
        System.out.println("烤的时间有点短的-----北极熊面包！！！");
    }
}

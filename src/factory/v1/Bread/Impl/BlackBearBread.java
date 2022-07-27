package factory.v1.Bread.Impl;

import factory.v1.Bread.Bread;

public class BlackBearBread implements Bread {
    @Override
    public void getColor() {
        System.out.println("烤的时间有点长的-----黑熊面包！！！");
    }
}

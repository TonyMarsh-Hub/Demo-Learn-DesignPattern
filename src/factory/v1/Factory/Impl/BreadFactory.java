package factory.v1.Factory.Impl;

import factory.v1.Bread.Bread;
import factory.v1.Factory.AbstractBreadFactory;

public class BreadFactory extends AbstractBreadFactory {
    @Override
    public Bread createBread(Class cls) {
        //定义一个生产的面包
        Bread bread = null;
        try {
            //产生一个面包
            bread = (Bread) Class.forName(cls.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("烤面包出错了？！");
        }
        return bread;
    }
}


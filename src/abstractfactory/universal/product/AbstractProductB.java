package abstractfactory.universal.product;

/**
 * 抽象产品类B
 */
public abstract class AbstractProductB {
    //每个方法的共有方法
    public void shardMethod() {
    }

    //每个产品相同的方法，不同实现
    public abstract void doSomething();

}

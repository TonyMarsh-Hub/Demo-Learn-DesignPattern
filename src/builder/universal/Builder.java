package builder.universal;

/**
 * 抽象建造者 包含创建产品各个子部件的抽象方法。
 */
public abstract class Builder {
    //创建产品的不同部分，以获取不同产品
    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    //返回产品对象
    public abstract Product buildProduct();
}

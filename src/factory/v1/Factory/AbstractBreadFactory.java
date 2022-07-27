package factory.v1.Factory;

import factory.v1.Bread.Bread;

public abstract class AbstractBreadFactory {
    public abstract Bread createBread(Class cls);
}

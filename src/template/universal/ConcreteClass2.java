package template.universal;

public class ConcreteClass2 extends AbstractClass {
    @Override
    protected void doSomething() {
        System.out.println("ConcreteClass2 doSomething");
    }

    @Override
    protected void doAnything() {
        System.out.println("ConcreteClass2 doAnything");
    }

    @Override
    protected void specificMethod() {
        System.out.println("ConcreteClass2 specificMethod");
    }
}

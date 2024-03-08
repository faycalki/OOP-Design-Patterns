package StructuralDesignPatterns.Decorator;

public class DecoratorClient {

    public DecoratorClient(){
        Component c = new ConcreteComponent();
        c.operation();

        Component baseDecorator = new BaseDecorator(c);

        Component concreteDecorator = new ConcreteDecorator(baseDecorator);
        concreteDecorator.operation();


        Component otherConcreteDecorator =  new OtherConcreteDecorator(concreteDecorator);
        otherConcreteDecorator.operation();

    }
}

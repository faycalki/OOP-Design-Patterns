package StructuralDesignPatterns.Decorator;

public class ConcreteDecorator extends BaseDecorator {
    public ConcreteDecorator(Component c){
        super(c);
    }

    @Override
    public void operation() {
        System.out.println ("Concrete Wrapper 1");
        super.operation();
    }
}

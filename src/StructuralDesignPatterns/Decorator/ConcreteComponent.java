package StructuralDesignPatterns.Decorator;

public class ConcreteComponent implements Component {

    public ConcreteComponent(){
    }

    @Override
    public void operation() {
        System.out.println("Concrete component!");
    }
}

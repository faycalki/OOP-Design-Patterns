package StructuralDesignPatterns.Decorator;

public class OtherConcreteDecorator extends BaseDecorator{

    public OtherConcreteDecorator(Component c){
        super(c);
    }

    @Override
    public void operation(){
        System.out.println("Other Concrete Wrapper!");
        super.operation();
    }

}

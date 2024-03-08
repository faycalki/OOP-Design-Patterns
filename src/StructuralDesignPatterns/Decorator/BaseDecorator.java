package StructuralDesignPatterns.Decorator;

public class BaseDecorator implements Component{
    protected  Component wrappee;

    public BaseDecorator(Component c){
        this.wrappee = c;
    }

    public BaseDecorator(){

    }

    public void operation(){
        wrappee.operation();
    }
}

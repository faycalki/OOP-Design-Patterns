package ConstructionalDesignPatterns.Factory;

public class ProductBFactory implements  AbstractFactory {
    @Override
    public IProduct produce() {
        return new ProductB();

    }
}

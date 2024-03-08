package ConstructionalDesignPatterns.Factory;

public class ProductAFactory implements AbstractFactory {
    @Override
    public IProduct produce() {
        return new ProductA();

    }
}

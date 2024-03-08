package ConstructionalDesignPatterns.Factory;

public class FactoryClient {
    private AbstractFactory factory;

    public FactoryClient(){
        factory = new ProductAFactory();
        IProduct productA = factory.produce();
        productA.dosomething();
    }

}

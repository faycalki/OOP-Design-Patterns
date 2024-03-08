package ConstructionalDesignPatterns.Builder;

public class BuilderClient {
    private ComplexClass complexObject;
    public BuilderClient() {
    ConcreteBuilder concreteBuilder = new ConcreteBuilder();
    concreteBuilder.withComplexityOne(true).withComplexityTwo("Second Complexity").withComplexityThree(null);
    complexObject = concreteBuilder.build();
    System.out.println(complexObject.getComplexityOne());
    System.out.println(complexObject.getComplexityTwo());
    System.out.println(complexObject.getComplexityThree());
    }
}

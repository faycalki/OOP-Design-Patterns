package ConstructionalDesignPatterns.Builder;

import ConstructionalDesignPatterns.Builder.*;

public class ConcreteBuilder implements Builder<ComplexClass> {
    public ComplexClass built;
    private boolean complexityOne;
    private String complexityTwo;
    private Object complexityThree;

    public  ConcreteBuilder(){
        built = new ComplexClass();
        complexityOne = false;
        complexityTwo = null;
        complexityThree = null;
    }

    @Override
    public ComplexClass build() {
        withComplexityOne(true); // If we want this to always be this value
        return built;
    }



    public ConcreteBuilder withComplexityOne(boolean inComplexityOne){
        built.setComplexityOne(inComplexityOne);
        return this;
    }
    public ConcreteBuilder withComplexityTwo(String inComplexityTwo){
        built.setComplexityTwo(inComplexityTwo);
        return this;
    }

    public ConcreteBuilder withComplexityThree(Object inComplexityThree){
        built.setComplexityThree(inComplexityThree);
        return this;
    }
}
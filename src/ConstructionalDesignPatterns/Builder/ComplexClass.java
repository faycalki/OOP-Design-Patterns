package ConstructionalDesignPatterns.Builder;

public class ComplexClass {
    boolean complexityOne;
    String complexityTwo;
    Object complexityThree;

    protected ComplexClass(){
        // prevents creation from outside packages
    }

    public void setComplexityOne(boolean complexityOne) {
        this.complexityOne = complexityOne;
    }



    public void setComplexityTwo(String complexityTwo) {
        this.complexityTwo = complexityTwo;
    }

    public void setComplexityThree(Object complexityThree) {
        this.complexityThree = complexityThree;
    }

    public boolean getComplexityOne() {
        return complexityOne;
    }

    public String getComplexityTwo() {
        return complexityTwo;
    }

    public Object getComplexityThree() {
        return complexityThree;
    }


}

package StructuralDesignPatterns.Composite;

public class Leaf implements Component{


    @Override
    public void operation() {
        System.out.println("Hello, I'm a leaf!");
    }

    @Override
    public void add(Component child) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Component child) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Component getChild(int index) {
        throw new UnsupportedOperationException();
    }
}

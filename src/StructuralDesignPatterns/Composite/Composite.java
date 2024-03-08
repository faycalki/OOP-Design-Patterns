package StructuralDesignPatterns.Composite;

import java.util.ArrayList;

public class Composite implements Component {
    private ArrayList<Component> children = new ArrayList<Component>();



    /**
     * Tells children to commit operation and performs some additional operation
     */
    @Override
    public void operation() {

        // Perform some operation about this object before continuing
        System.out.println("Hello, I'm a Composite!");

        // Recurse
        for (Component c: children){
            c.operation();
        }

    }

    @Override
    public void add(Component child) {
        children.add(child);
    }

    @Override
    public void remove(Component child) {
        children.remove(child);
    }

    @Override
    public Component getChild(int index) {
        return children.get(index);
    }
}



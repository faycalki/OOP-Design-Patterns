package StructuralDesignPatterns.Composite;

public class ComponentClient {

    public ComponentClient(){
        Component rootNode = new Composite();
        Component c1 = new Composite();
        rootNode.add(c1);
        rootNode.add(new Composite());
        Component c2 = new Composite();
        rootNode.add(c2);
        rootNode.add(new Leaf());
        rootNode.add(new Leaf());

        c2.add(new Leaf());
        c2.add(new Leaf());
        c2.add(new Leaf());
        rootNode.operation();
    }

}

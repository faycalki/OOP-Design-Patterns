package StructuralDesignPatterns.Composite;

public interface Component {
    public void operation();

    public void add(Component child);
    public void remove(Component child);

    public Component getChild(int index);
}

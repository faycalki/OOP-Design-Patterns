import ConstructionalDesignPatterns.Builder.BuilderClient;
import ConstructionalDesignPatterns.Factory.FactoryClient;
import ConstructionalDesignPatterns.Singleton.SingletonClient;
import StructuralDesignPatterns.Composite.ComponentClient;
import StructuralDesignPatterns.Decorator.DecoratorClient;

public class main {

    public static void main(String[] args) {
        SingletonClient singletonClient = new SingletonClient();

        FactoryClient factory = new FactoryClient();

        BuilderClient bclient = new BuilderClient();

        ComponentClient componentClient = new ComponentClient();

        DecoratorClient decoratorClient = new DecoratorClient();


    }
}
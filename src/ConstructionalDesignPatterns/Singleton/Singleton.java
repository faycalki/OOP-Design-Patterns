package ConstructionalDesignPatterns.Singleton;

public class Singleton{
    private volatile static Singleton self;
    private Singleton(){
    }

    /**
     * the Synchronized keyword is not necessary but makes the implementation thread-safe so that only a single instance is created if accessed simultaneously by multiple threads when the object isn't created.
     * @return the Singleton object
     */
    public static synchronized Singleton getInstance() {
        if (self == null){
            self = new Singleton();
        }
        return self;
    }

    public void SingletonOperation(){
        // ...
    }

}

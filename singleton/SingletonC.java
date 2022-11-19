package singleton;

public class SingletonC {

    private static SingletonC singletonC;

    private SingletonC() {

    }

    public static SingletonC getSingletonC() {
        if (singletonC == null) {
            singletonC = new SingletonC();
        }
        return singletonC;
    }

}

// singleton property break by Reflection ------------ resolve by creating Enum rather class
// singleton property break by Serialization ------------ resolve by overriding readResolver() method
// singleton property break by Cloning ------------ resolve by implementing clone() method and throw exception.
package SystemDesign.LLD.DesingPatterns.Creational.Singleton;

import java.util.Objects;

public class SingletonClass {

    private static SingletonClass instance;

    private SingletonClass() {
        System.out.println("instance in initialized");
    }

    public static SingletonClass getInstance() {
        if (Objects.isNull(instance)) {
            synchronized (SingletonClass.class) {
                if(Objects.isNull(instance)) {
                    instance = new SingletonClass();
                }
            }
        }
        return instance;
    }
}

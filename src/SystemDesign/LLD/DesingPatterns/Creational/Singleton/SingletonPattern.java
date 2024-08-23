package SystemDesign.LLD.DesingPatterns.Creational.Singleton;

public class SingletonPattern {
    public static void main(String[] args) {
//        SingletonClass singletonClass = SingletonClass.getInstance();
//        System.out.println(singletonClass);
//        SingletonClass singletonClass2 = SingletonClass.getInstance();
//        System.out.println(singletonClass2);

        Thread t1 = new Thread(SingletonClass::getInstance);
        Thread t2 = new Thread(SingletonClass::getInstance);
        t1.start();
        t2.start();
    }
}

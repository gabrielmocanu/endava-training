package exemplu;

public class Singleton1 {

    private static Singleton1 singleton;

    public static Singleton1 getInstance(){
        if(singleton == null)
            singleton = new Singleton1();

        return singleton;
    }

    private Singleton1(){

    }
}

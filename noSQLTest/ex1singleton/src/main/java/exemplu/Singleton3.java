package exemplu;

public class Singleton3 {

    private Singleton3(){
    }

    private static class SingletonHolder {
        private static final Singleton3 singleton = new Singleton3();
    }

    public static Singleton3 getInstance(){
        return SingletonHolder.singleton;
    }
}

package exemplu;

public class Singleton2 {

    private static Singleton2 singleton;

    public static Singleton2 getInstance(){
        if(singleton == null){
            synchronized (Singleton2.class){
                    if(singleton == null){
                        singleton = new Singleton2();
                    }
            }
        }


        return singleton;
    }

    private Singleton2(){

    }
}

import java.util.ArrayList;
import java.util.List;

public class Subject {

    List<MyListener> list = new ArrayList<MyListener>();

    public void addListener(MyListener myListener){
        list.add(myListener);
    }

    public void event(){
        list.forEach(MyListener::somethingHappened);
    }

}

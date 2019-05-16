package API;

import impl.HelloSp;

public interface Hello {

    public String hello(String name);

    public static Hello build(){
        return new HelloSp();
    }
}

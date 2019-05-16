package impl;

import API.Hello;

public class HelloSp implements Hello {

    public String hello(String name){
        return "Olla, " + name + "!";
    }
}

package impl;

import API.Hello;

public class HelloEn implements Hello {

    public String hello(String name){
        return "Hello, " + name + "!";
    }
}

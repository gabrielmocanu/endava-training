package main;

import API.Hello;

public class Person {

    private Hello hello;

    public Person() {
        this.hello = Hello.build();
    }

    public void sayHello(String name){
        String out = hello.hello(name);
        System.out.println(out);
    }
}

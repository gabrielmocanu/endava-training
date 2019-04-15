package com.endava.java.demo.controller;

import com.endava.java.demo.model.BankAccount;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {

    //@RequestMapping(path = "/myresource/{name}", method = RequestMethod.GET)
    @GetMapping(path = "/myresource/{name}")
    public ResponseEntity<String> firstGet(@PathVariable String name) {
        String value = "Welcome! "+ name + "This is my first get !";

        ResponseEntity<String> responseEntity = new ResponseEntity<>(value, HttpStatus.OK);
        return responseEntity;
    }

    @PostMapping(path = "/mypost")
    public ResponseEntity<BankAccount> myPost(@RequestBody BankAccount bankAccount) {
        bankAccount.setBalance(bankAccount.getBalance()+50);
        ResponseEntity<BankAccount> responseEntity = new ResponseEntity<>(bankAccount,HttpStatus.OK);

        return responseEntity;
    }
}

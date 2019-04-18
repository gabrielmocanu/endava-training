package com.endava.java.demo.controller;

import com.endava.java.demo.model.BankAccount;
import com.endava.java.demo.model.Card;
import com.endava.java.demo.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
public class CardController {

    private CardService cardService;

    @Autowired
    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @PostMapping(path = "/cards")
    public ResponseEntity<Card> addCard(@RequestBody Card card, HttpServletResponse response){
        cardService.addCardRepository(card,response);
        ResponseEntity<Card> responseEntity = new ResponseEntity<>(card,HttpStatus.OK);
        System.out.println(card);
        return responseEntity;
    }

    @GetMapping(path = "/mycards")
    public ResponseEntity<String> firstGet() {
        Card c = new Card("Ana",1,2);
        ResponseEntity<String> responseEntity = new ResponseEntity<>(c.toString(), HttpStatus.OK);
        return responseEntity;
    }
}


// Lista tranzactii + Card REPE/SERV/CONTROLLER = { getTransaction, Adaugare, }

// Pentru Tranzactie Repo, Server, Controller => List

// 4 ENDPOINT
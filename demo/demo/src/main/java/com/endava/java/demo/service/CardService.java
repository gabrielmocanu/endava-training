package com.endava.java.demo.service;

import com.endava.java.demo.model.Card;
import com.endava.java.demo.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;

@Service
public class CardService {

    private CardRepository cardRepository;

    @Autowired
    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public void addCardRepository(Card card, HttpServletResponse response){
        cardRepository.addCard(card);
    }

    public Card returnCard(){
        return new Card("ana",1,3);
    }
}

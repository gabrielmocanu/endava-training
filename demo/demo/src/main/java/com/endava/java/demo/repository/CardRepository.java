package com.endava.java.demo.repository;

import com.endava.java.demo.model.Card;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CardRepository {
    List<Card> cardList = new ArrayList<>();


    public CardRepository(List<Card> cardList) {
        this.cardList = cardList;
    }

    public void addCard(Card c){
        cardList.add(c);
    }

    public List<Card> getCardList(){
        return cardList;
    }
}

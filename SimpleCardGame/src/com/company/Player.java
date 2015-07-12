package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by zhoujihao on 15-7-12.
 */
public class Player {
    private int id;
    private String name;
    private List<Card> cardInHand = new ArrayList<Card>();

    Player() {}

    Player(int id_, String name_) {
        this.id = id_;
        this.name = name_;
    }

    public void addCard(Card card_) {
        cardInHand.add(card_);
        System.out.println(getName() + " get the card: " + card_.getType() + ":" + card_.getValue());
    }

    public List<Card> getCardInHand() {
        return cardInHand;
    }

    public Card getTheMaxCard() {
        Card max;
        Iterator<Card> it = cardInHand.iterator();
        max = it.next();
        while (it.hasNext()) {
            Card temp = it.next();
            if (temp.getValue() > max.getValue()) {
                max = temp;
            }
        }
        return max;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

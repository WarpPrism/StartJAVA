package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

/**
 * Created by zhoujihao on 15-7-12.
 */
public class Poker {
    private HashSet<Card> cards;
    private Vector<String> types;

    Poker() {
        cards = new HashSet<Card>();
        types = new Vector<String>(4);
    }

    public void generateThePoker() {
        types.add("Heart");
        types.add("Diamond");
        types.add("Club");
        types.add("Spade");

        for (String type:types) {
            int i = 1;
            while (i < 14) {
                cards.add(new Card(type, i));
                i++;
            }
        }
        int flag = 0;
        System.out.println("\n****************************************");
        for (Card c:cards) {
            System.out.print(c.getType() + ":" + c.getValue() + " ");
            flag++;
            if (flag == 4) {
                System.out.println();
                flag = 0;
            }
        }
        System.out.println("****************************************");
        System.out.println("Succeed in generating the poker.");
    }

    public Card distributeCard() {
        Iterator<Card> it = cards.iterator();
        Card temp;
        Card destroy = it.next();
        temp = destroy;
        cards.remove(destroy);
        //System.out.println(temp.getType() + ":" + temp.getValue());
        return temp;
    }
}

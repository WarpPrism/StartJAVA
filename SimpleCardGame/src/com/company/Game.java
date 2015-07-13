package com.company;

import java.util.Scanner;

/**
 * Created by zhoujihao on 15-7-13.
 */
public class Game {
    private Poker apoker;
    private Player player1, player2;

    Game() {}

    public void gameInit() {
        // Game Main
        // Game Start
        apoker = new Poker();
        player1 = new Player();
        player2 = new Player();
    }

    public void getPlayerInformation() {
        Scanner scan = new Scanner(System.in);
        // Player Information
        // player 1
        System.out.println("Please input the id of player1:");
        int id = scan.nextInt();
        System.out.println("Please input the name of player1:");
        String name = scan.next();
        player1.setId(id);
        player1.setName(name);
        // player 2
        System.out.println("Please input the id of player2:");
        id = scan.nextInt();
        System.out.println("Please input the name of player2:");
        name = scan.next();
        player2.setId(id);
        player2.setName(name);

        // List player information
        System.out.println("\n****************************************");
        System.out.println("Please confirm the information of 2 players.");
        System.out.println(player1.getId() + ":" + player1.getName());
        System.out.println(player2.getId() + ":" + player2.getName());
        System.out.println("****************************************");
    }

    public void generateAndDistributeThePoker() {
        apoker.generateThePoker();

        // distribute the cards to 2 players
        System.out.println("\n****************************************");
        int count = 0;
        while (count < 4) {
            Card card1 = apoker.distributeCard();
            player1.addCard(card1);
            Card card2 = apoker.distributeCard();
            player2.addCard(card2);
            count++;
        }
        System.out.println("****************************************");
        System.out.println("Succeed in distributing the cards.");
    }

    public void decideTheWinner() {
        // compete and decide the winner
        Card max1 = player1.getTheMaxCard();
        Card max2 = player2.getTheMaxCard();
        if (max1.getValue() > max2.getValue()) {
            System.out.println(player1.getName() + " Win!");
            System.out.println("His/Her max card is " + max1.getType() + " " + max1.getValue());
        } else if (max1.getValue() < max2.getValue()) {
            System.out.println(player2.getName() + " Win!");
            System.out.println("His/Her max card is " + max1.getType() + " " + max1.getValue());
        } else if (max1.getValue() == max2.getValue()) {
            System.out.println("Same!");
        }
    }
}

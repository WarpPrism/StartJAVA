package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Game Main
        // Game Start
        Poker apoker = new Poker();
        Player player1 = new Player();
        Player player2 = new Player();
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

        // compete and decide the winner
        Card max1 = player1.getTheMaxCard();
        Card max2 = player2.getTheMaxCard();
        if (max1.getValue() > max2.getValue()) {
            System.out.println(player1.getName() + " Win!");
        } else if (max1.getValue() < max2.getValue()) {
            System.out.println(player2.getName() + " Win!");
        } else if (max1.getValue() == max2.getValue()) {
            System.out.println("Same!");
        }
    }
}

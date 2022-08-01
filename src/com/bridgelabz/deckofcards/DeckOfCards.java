package com.bridgelabz.deckofcards;

import java.util.Arrays;
import java.util.Scanner;

public class DeckOfCards {

    String[]  suits;
    String[] ranks;
    String[][] deckOfCards;

    int numOfPlayers;

    Scanner scanner = new Scanner(System.in);


    public DeckOfCards() {
        suits = new String[] { "Clubs", "Hearts", "Diamond", "Spades" };
        ranks = new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
        deckOfCards = new String[4][13];
    }

    public void initialiseCards(){
        for(int i=0;i<suits.length;i++){
            for(int j=0;j<ranks.length;j++){
                deckOfCards[i][j] = suits[i]+' '+ranks[j];
            }
        }
    }

    void addPlayers(){

        do {
            System.out.println("Enter number of players (2 to 4): ");
            numOfPlayers = scanner.nextInt();
        } while (numOfPlayers < 2 || numOfPlayers > 4);
        for (int i = 0; i < numOfPlayers; i++) {
            System.out.println("Enter player name");
            String playerName=scanner.next();
            Player.addPlayer(new Player(playerName));
        }
    }


    void printCards(String[][] cards){
        for (String[] card : cards) {
            System.out.print(Arrays.toString(card));
        }
    }



    public void printAllPlayerCards(){
        for (int i = 0; i < Player.playerList.size(); i++) {
            System.out.print("Player-" + (i+1) +" ");
            printCards(Player.playerList.get(i).playerCards);
            System.out.println();
        }
    }


    public void distributeCards() {
        Shuffle shuffle = new Shuffle();
        shuffle.shuffleCards(deckOfCards);
        int i = 0;
        for (Player player : Player.playerList) {
            for (int j = 0; j < 9; j++) {
                shuffle.shuffleCards(deckOfCards);
                player.playerCards[i][j] = deckOfCards[i][j];
            }

        }
    }

    @Override
    public String toString() {
        return "DeckOfCards{" +
                "suits=" + Arrays.toString(suits) +
                ", ranks=" + Arrays.toString(ranks) +
                '}';
    }
}
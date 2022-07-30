package com.bridgelabz.deckofcards;

public class DeckOfCards {

        String[]  suits = new String[] { "Clubs", "Hearts", "Diamond", "Spades" };
        String[] ranks = new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
        String[][] deckOfCards = new String[4][13];

        public void initialiseCards(){
            for(int i=0;i<suits.length;i++){
                for(int j=0;j<ranks.length;j++){
                    deckOfCards[i][j] = suits[i]+' '+ranks[j];
                }
            }
        }

        public void print(){
            for(int i=0;i<suits.length;i++){
                for(int j=0;j<ranks.length;j++){
                    System.out.println(deckOfCards[i][j]);
                }
            }
        }
}

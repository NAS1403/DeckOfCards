package com.bridgelabz.deckofcards;

public class DeckOfCards {

    String[]  suits;
    String[] ranks;
    String[][] deckOfCards;


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


    public void distributeCards() {
        Shuffle shuffle = new Shuffle();
        shuffle.shuffleCards(deckOfCards);
        for (int i = 0; i < 4; i++) {
            System.out.println();
            System.out.println("Cards for player " + (i + 1));
            System.out.println();
            for (int j = 0; j < 9; j++) {
                System.out.println(deckOfCards[i][j]);
            }
        }
    }
}

package com.bridgelabz.deckofcards;

public class MainClass {
    public static void main(String[] args) {
        DeckOfCards deckOfCards=new DeckOfCards();
        deckOfCards.initialiseCards();

        deckOfCards.addPlayers();




        deckOfCards.distributeCards();


        deckOfCards.printAllPlayerCards();
    }
}

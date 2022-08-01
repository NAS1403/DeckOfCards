package com.bridgelabz.deckofcards;

public class Shuffle {
    public void shuffleCards(String[][] arr){
        String temp;
        for (int i =0;i<4;i++) {
            for (int j = 0;j<13;j++) {
                int a = (int)(Math.random()*10)%4;
                int b = (int)(Math.random()*10)%13;
                temp = arr[i][j];
                arr[i][j] = arr[a][b];
                arr[a][b] = temp;
            }
        }
    }
}

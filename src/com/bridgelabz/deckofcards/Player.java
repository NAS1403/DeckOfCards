package com.bridgelabz.deckofcards;

import java.util.ArrayList;
import java.util.Arrays;

public class Player {

    String name;
   String[][] playerCards = new String[1][9];
    public static ArrayList<Player> playerList=new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public Player() {
    }

    public static void addPlayer(Player player){
        playerList.add(player);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", playerCards=" + Arrays.toString(playerCards) +
                '}';
    }
}
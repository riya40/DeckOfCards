/*
*Deck Of Cards
* Showing the Unique Cards
 */
package com.datastructures;
import java.util.Scanner;
public class DeckOfCards {
    int i,j,k;

    //Showing the initilizing
    public void start(){
        System.out.println("initlizing the cards");
    }
    //showing cards
    public void cards(){
        String suits[]={"Clubs", "Diamonds", "Hearts", "Spades"};
        String Rank[]={"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        for(i=0;i<suits.length;i++){
            for(j=0;j<Rank.length;j++){
                System.out.println("cards:"+suits[i]+""+Rank[j]);
            }
        }
    }
    //performing random function
    public void unique(){
        String cards="Clubs"+"Diamonds"+"Hearts"+"Spades";
        for(k=0;k<13;k++) {
            int ch = (int) (cards.length() * Math.random());
            System.out.println(cards.charAt(ch));
        }
    }

    public static void main(String[] args) {
        DeckOfCards dc=new  DeckOfCards();
        dc.start();
        dc.cards();
        dc.unique();

    }
}

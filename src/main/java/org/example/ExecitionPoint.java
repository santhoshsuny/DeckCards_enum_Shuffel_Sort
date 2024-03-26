package org.example;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ExecitionPoint {


    public static void main(String[] args) {

        ArrayList<Card> deck = getDeck(14);
        System.out.println("Initial");
        System.out.println(deck);
        Collections.shuffle(deck);
        System.out.println("Shuffled");
        System.out.println(deck);
        deck.sort((c1,c2)->{
            if(c1.rank.getCardRank() < c2.rank.getCardRank())
                return 1;
            else if(c1.rank.getCardRank() == c2.rank.getCardRank())
                return 0;
            else
                return -1;
        });
        System.out.println("Sorted");
        System.out.println(deck);


       /* for (int i =0 ; i< 18 ; i++) {
            System.out.println(i+1);
            System.out.println(Suit.getRandomSymbol());
            Suit.getIssuesCardSymbols();
            System.out.println();

        }*/
    }

    private static ArrayList<Card> getDeck(int n) {
        ArrayList<Card> cards = new ArrayList<Card>();
        Random random = new Random();
        for(int i=0; i < n; i++){
            cards.add(new Card(CardValue.values()[random.nextInt(13)],Suit.getRandomSymbol()));
        }
        return cards;
    }

    private static void mergeArrays(int[] nums1, int[] nums2) {

        int[] outPut = new int[10];
        int k=0;

        for(int i =0 ; i<nums1.length ;){
            for(int j =0 ; j<nums2.length ;){
                System.out.println( nums1[i] +" " + nums2[j] );
                if (nums1[i] <= nums2[j]) {
                    outPut[k++]=nums1[i++];
                }else{
                    outPut[k++]=nums1[j++];
                }
            }
        }

    }

}


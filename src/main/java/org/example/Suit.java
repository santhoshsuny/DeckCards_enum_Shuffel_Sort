package org.example;

import java.util.Random;

public enum Suit {

    CLUB ,DIAMOND, HEART, SPADE;
        private static int clubCount = 0;
        private static int diamondCount = 0;
        private static int heartCount = 0 ;
        private static int spadeCount = 0 ;

        private static final int maxSymbolAllowed = 4;

        public static void getIssuesCardSymbols(){
            System.out.print("clubCount "+ clubCount +" diamondCount "+diamondCount+" heartCount "+  heartCount + " spadeCount " + spadeCount);
        }

        static Suit getRandomSymbol(){
            Random random = new Random();
            int i = random.nextInt(4);
            switch(i){
                case 0 : if(clubCount < maxSymbolAllowed){
                    clubCount ++ ;
                    return CLUB; }
                case 1 : if(diamondCount < maxSymbolAllowed) {
                    diamondCount++;
                    return DIAMOND;
                }
                case 2 : if(heartCount < maxSymbolAllowed) {
                    heartCount++;
                    return HEART;
                }
                case 3 : if(spadeCount < maxSymbolAllowed){
                    spadeCount++;
                    return SPADE;
                }
                default:  if((spadeCount + heartCount + diamondCount + clubCount) < maxSymbolAllowed*4 ){
                    return getRandomSymbol();
                }
                    System.out.println("all cards issued.");
            }
            return null;
        }

        int getSymbolRank(Suit symbol){
            switch (symbol){
                case CLUB : return 1;
                case DIAMOND: return 2;
                case HEART:return 3;
                case SPADE: return 4;
            }
            return 0;
        }
}

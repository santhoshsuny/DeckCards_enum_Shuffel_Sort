package org.example;

public enum CardValue {

        TWO(2),
        Three(3),
        four(4),
        Five(5),
        Six(6),
        Seven(7),
        Eight(8),
        Nine(9),
        Ten(10),
        Jack(11),
        Queen(12),
        Kind(13),
        Ace(14);

        private int rank;
        CardValue(int i) {
            this.rank = i;
        }

        int getCardRank(){
            return this.rank;
        }

}

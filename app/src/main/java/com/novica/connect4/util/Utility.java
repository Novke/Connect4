package com.novica.connect4.util;

import java.util.Random;

public class Utility {

    public static int setFirstPlayer(int numberOfPlayers){
        return numberOfPlayers == 1 ? 1 : new Random().nextInt(2) + 1;
    }

}

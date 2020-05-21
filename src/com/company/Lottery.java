package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Lottery {
    // Random generate four base numbers
    private ArrayList<Integer> baseNumbersGenerated = new ArrayList<>(Arrays.asList(3,67,23,12));
    // Random generated a lucky number
    private int luckyNumberGenerated = 56;
    private int luckyNumberHit = 0;
    private int baseNumberHit = 0;
    private int hitsPoints = 0;


    public int checkBaseNumber(ArrayList basePickNumbers){
        for(int i=0; i<basePickNumbers.size(); i++){
            if(baseNumbersGenerated.contains(basePickNumbers.get(i))){
                baseNumberHit++;
            }
        }
        return baseNumberHit;
    }
    public boolean checkLuckyNumber(int pickedLuckyNumber){
        if(pickedLuckyNumber == luckyNumberGenerated){
            return true;
        }
        return false;
    }

}

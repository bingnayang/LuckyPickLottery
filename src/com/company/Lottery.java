package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Lottery {
    // Random generate four base numbers
    private ArrayList<Integer> baseNumbersGenerated = new ArrayList<>(Arrays.asList(3,67,23,12));
    // Random generated a lucky number
    private int luckyNumberGenerated = 56;
    private boolean luckyNumberHit;
    private int baseNumberHit = 0;

    public void calculateCoinsWin(){
        if(luckyNumberHit == false){
            if(baseNumberHit  != 4){
                System.out.println("Sorry No Luck This Time");
            }else{
                System.out.println("Earn: 5,000 Coins");
            }
        }
        if(luckyNumberHit == true){
            if(baseNumberHit == 0){
                System.out.println("Earn: 500 Coins");
            }else if(baseNumberHit == 4){
                System.out.println("Earn: 100,000 Coins");
            }else{
                System.out.println("Earn: 5,000 Coins");
            }
        }

    }

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
            luckyNumberHit = true;
            return luckyNumberHit;
        }
        return luckyNumberHit;
    }

}

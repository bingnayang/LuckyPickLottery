package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Lottery {
    // Random generate four base numbers
    private ArrayList<Integer> baseNumbersGenerated;
    // Random generated a lucky number
    private int luckyNumberGenerated;
    private boolean luckyNumberHit;
    private int baseNumberHit;
    private int rewardCoins;

    public Lottery() {
//        this.baseNumbersGenerated = new ArrayList<>(Arrays.asList(3,67,23,12));
        this.baseNumbersGenerated = new ArrayList<>();
        setBaseGenerated();
        this.luckyNumberGenerated = 1 + (int)(Math.random()*((100-1+1)+1));
        this.rewardCoins = 0;
    }

    public void setBaseGenerated() {
        Random rand = new Random();
        int picked;

        for(int i=0; i<4; i++){
            picked = rand.nextInt(100);
            baseNumbersGenerated.add(picked);
        }
    }

    public void calculateCoinsWin(){
        switch (rewardCoins){
            case 50:
                System.out.println("Nice!! Earn: 500 Coins");
                break;
            case 80:
                System.out.println("Good Job!! Earn: 5,000 Coins");
                break;
            case 90:
                System.out.println("Great !! Earn: 25,000 Coins");
                break;
            case 110:
                System.out.println("Awesome!! Earn: 50,000 Coins");
                break;
            case 130:
                System.out.println("BINGO!! Earn: 100,000 Coins");
                break;
            default:
                System.out.println("No Luck This Time");
                break;
        }
        // For Testing
        System.out.println(rewardCoins);
    }

    public int checkBaseNumber(ArrayList basePickNumbers){
        for(int i=0; i<basePickNumbers.size(); i++){
            if(baseNumbersGenerated.contains(basePickNumbers.get(i))){
                rewardCoins += 20;
                baseNumberHit++;
            }
        }
        return baseNumberHit;
    }
    public boolean checkLuckyNumber(int pickedLuckyNumber){
        if(pickedLuckyNumber == luckyNumberGenerated){
            rewardCoins += 50;
            luckyNumberHit = true;
            return luckyNumberHit;
        }
        return luckyNumberHit;
    }

    public void printWinningNumbers(){
        System.out.println("=========Lucky Lottery Winning Number=========");
        System.out.println("Base number: "+Arrays.toString(baseNumbersGenerated.toArray())+" Lucky number: "+luckyNumberGenerated);
    }

}

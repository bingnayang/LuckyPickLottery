package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> basePick = new ArrayList<>();
        Lottery lottery = new Lottery();
        int numberInput;
        int baseNumber = 1;

        gameIntro();
        gameRewards();

        // Ask to input the four base numbers and the lucky number.
        while (true){
            System.out.println("Enter the lucky *base["+baseNumber+"]* number: ");
            numberInput = scanner.nextInt();
            if(basePick.contains(numberInput)){
                System.out.println("It a duplicate number, enter another new *base* number :");
            }else{
                basePick.add(numberInput);
                baseNumber++;
            }
            if(basePick.size() == 4){
                break;
            }
        }
        System.out.println("Enter the lucky *lucky* number: ");
        int luckyPick = scanner.nextInt();

        // Print out player lucky picked numbers
        System.out.println("=========Customer Lucky Lottery Ticket=========");
        System.out.println("Base number: "+Arrays.toString(basePick.toArray())+" Lucky number: "+luckyPick);

        // For Testing
        // Checking how many base numbers match
        int baseNumberMatch = lottery.checkBaseNumber(basePick);
        System.out.println("Base Number Match Hits: "+baseNumberMatch);
        // Checking if the lottery number match
        boolean luckyNumberMatch = lottery.checkLuckyNumber(luckyPick);
        System.out.println("Lucky Number Match: "+luckyNumberMatch);


        // Print out customer lottery ticket and rewards
        lottery.calculateCoinsWin();
        // Print out lottery winning numbers
        lottery.printWinningNumbers();

    }
    public static void gameIntro(){
        System.out.println("=====================================================================");
        System.out.println("= Welcome to Lucky Pick Lottery!!!");
        System.out.println("= Number range are from 1 to 100");
        System.out.println("= Pick 4 base number and one lucky number");
        System.out.println("= Four Base Number Cannot Be Same");
        System.out.println("=====================================================================");

    }
    public static void gameRewards(){
        System.out.println("=====================================================================");
        System.out.println("= Match All: \t\t\t\t\t\t\t\t 100,000 Lucky Coins");
        System.out.println("= Match Lucky Number and Three Base Numbers: \t 50,000 Lucky Coins");
        System.out.println("= Match Lucky Number and Two Base Numbers: \t 25,000 Lucky Coins");
        System.out.println("= Match All Base Numbers : \t\t\t\t\t 5,000 Lucky Coins ");
        System.out.println("= Match Only Lucky Number: \t\t\t\t\t 500 Lucky Coins ");
        System.out.println("=====================================================================");
    }

}

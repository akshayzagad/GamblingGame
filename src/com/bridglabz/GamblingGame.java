package com.bridglabz;
import java.util.Random;
public class GamblingGame {
    public static void main(String[] args) {
        int money = 100;
        int playCount = 0;
        int wonCount = 0;
        int month = 12;
        int lossCount = 0;
        int perMonthWon = 0;
        int perMonthLoss = 0;
        int perMonthPlayCount=0;
        Random random = new Random();
        int day = 0;
        int forDay = 20;
        for (int j = 1; j <= month; j++) {
            for (int i = 0; i < forDay; i++) {
                day++;
                int bet = random.nextInt(3);
                switch (bet) {
                    case 1:
                        money = money + 1;
                        wonCount++;
                        perMonthWon++;
                        playCount++;
                        perMonthPlayCount++;
                        System.out.println("player is win so current money is " + money);
                        break;
                    case 2:
                        money = money - 1;
                        lossCount++;
                        perMonthLoss++;
                        playCount++;
                        perMonthPlayCount++;
                        System.out.println("player loss bet so current money is " + money);
                        break;
                    default:
                        System.out.println("player stop Gambling for a day");
                }
                System.out.println("current day " + day);
                if (day == forDay) {
                    System.out.println("********* Monthly Report *************");
                    System.out.println("current Month " + j);
                    System.out.println("No of times Played:" + perMonthPlayCount);
                    System.out.println("No Of Times Lost:" + perMonthLoss);
                    System.out.println("No Of Times Won:" + perMonthWon);
                    System.out.println("No Of Times skiped:" + (day - perMonthPlayCount));
                    System.out.println("**************************************");
                    perMonthPlayCount = 0;
                    perMonthWon = 0;
                    perMonthLoss = 0;
                    day = 0;
                }
            }
        }
            System.out.println("********* Yearly Report *************");
            System.out.println("No of times Played:" + playCount);
            System.out.println("No Of Times Won:" + wonCount);
            System.out.println("No Of Times Lost:" + lossCount);
            System.out.println("**************************************");
        }

    }




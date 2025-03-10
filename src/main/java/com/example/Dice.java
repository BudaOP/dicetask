package com.example;

import java.util.Random;

public class Dice {
    private int die1;
    private int die2;
    private Random random;

    public Dice() {
        random = new Random();
        roll();
    }

    public void roll() {
        die1 = random.nextInt(6) + 1;
        die2 = random.nextInt(6) + 1;
    }

    public boolean isDouble() {
        return die1 == die2;
    }

    public int getDie1() {
        return die1;
    }

    public int getDie2() {
        return die2;
    }

    public int rollUntilDouble() {
        int count = 0;
        do {
            roll();
            count++;
        } while (!isDouble());
        return count;
    }

    public static void main(String[] args) {
        Dice dice = new Dice();
        int attempts = dice.rollUntilDouble();
        System.out.println("Rolling the dice...");
        System.out.println("Die 1: " + dice.getDie1());
        System.out.println("Die 2: " + dice.getDie2());
        if (dice.isDouble()) {
            System.out.println("You rolled a double!");
        } else {
            System.out.println("Try again.");
        }
        System.out.println("After " + attempts + " try both reach the same value");
    }
}

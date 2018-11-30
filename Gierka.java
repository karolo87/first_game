package com.javagda22.instrukcjesterujace.gierka;

import java.util.Random;
import java.util.Scanner;

public class Gierka {
    public static void main(String[] args) {
        Random generator = new Random();

        //wylosuj liczbę
        int x = generator.nextInt(100);


        Scanner scanner = new Scanner(System.in);

        //podaj swoją liczbę
        System.out.println("Podaj liczbę:");
        int podanaLiczba = scanner.nextInt();


        while (x != podanaLiczba) {
            if (x > podanaLiczba) {
                System.out.println("Podałeś za małą liczbę. Podaj większą liczbę: ");
            } else {
                System.out.println("Podałeś za dużą liczbę. Podaj mniejszą liczbę: ");
            }
            podanaLiczba = scanner.nextInt();

        }
        System.out.println("Wygrałeś!");

    }
}

package com.company;

import java.util.Scanner;

public class cwiczenie4 {

    public static void main(String[] args) {
        int silniaz5 = silnia.silniaIteracyjnie(5);
        System.out.println(silniaz5);
        silniaz5 = silnia.silniaRekurencyjnie(5);
        System.out.println(silniaz5);
        int silniaz6 = silnia.silniaIteracyjnie(6);
        System.out.println(silniaz6);
        silniaz6 = silnia.silniaRekurencyjnie(6);
        System.out.println(silniaz6);
        ///skomitowane
    Scanner scan = new Scanner(System.in);
        int wartosc = scan.nextInt();
        System.out.print("podaj liczbę dla której obliczysz silnię: ");
        int silniazwart = silnia.silniaIteracyjnie(wartosc);
        System.out.println("silnia dla podanej liczby to: " + silniazwart);
    }


}
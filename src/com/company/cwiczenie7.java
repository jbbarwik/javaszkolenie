package com.company;

public class cwiczenie7 {

    public static void main(String[] args) {
        byte a = 120;
        a += 20;   ///skończył się zakres Java zaczęła liczyć od końca od -128
        System.out.println("a " + a);
        short s = -32000;
        s -= 1000; //licznik przekręcił się i wskoczył w zakres dodatni
        System.out.println("s " + s);
        int i = 2000000000;
        i = 2 * i; //wynik działania jest zbyt wysoki nie mieści się w zakresie dodatnim licznik zowu startuje od liczb ujemnych
        System.out.println("i " + i);
        char c = 50; //5o w systemie unicode daje 2
        System.out.println("c " + c);
        int j = '9'; // doszło do konwersji z int do char (rzutowanie) 9 w unicode daje 57
        System.out.println("j " + j);
    }
    }


}

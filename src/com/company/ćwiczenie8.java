package com.company;

import java.math.BigDecimal;

public class ćwiczenie8 {
public static void main(String[] args){
    float f = 1.0000001F; float g = f;
    boolean c = f == g;
    System.out.println(f+" == "+g+c);
    double d = f;
    System.out.println(d);
BigDecimal d3 = new BigDecimal("0.1"); //zakres bigdecimal został ustawiony za pomocą stringa("")
    System.out.println(d3);
}
}

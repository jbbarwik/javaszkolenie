package com.company;

public class cwiczenie9 {
    public static void main(String[] args){
        int a, x, y, z;
        a = 1; a = a++ + ++a;
        System.out.println(a);
        x = 1; x += x;
        System.out.println(x);
        y = 1; y += 1 + y++;
        //y = 1; y = y + 1 +y++;
        System.out.println(y);
        //z = 1; z += 1 + z ++ + ++z;
        z = 1;
        int etap1 = 1 + z;
        z++;
        int etap2 = z;
        int wyrazenie = etap1 + etap2;
        z =1;
        z += wyrazenie;
        System.out.println(z);
    }
}

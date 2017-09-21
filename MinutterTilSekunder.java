package com.company;
import java.util.Scanner;

public class MinutterTilSekunder {

    public static void main(String[] args) {
/* Pseudokode
-Deklarer antalSekunder, minutterRes, sekunderRes variabler
-Scanner, som indlæser antal sekunder
-minutter = antalSekunder/60
-Sekunder = antalSekunder % 60
-Udskriver en hel sætning
 */
        Scanner input = new Scanner(System.in);
        System.out.print("Indtast antal sekunder ");

int antalSekunder= (int) input.nextDouble();
int minutterRes;
int sekunderRes;



minutterRes=antalSekunder/60;
sekunderRes=antalSekunder%60;
        System.out.print(+minutterRes+" minut(ter) og "+sekunderRes+" sekunder");

    }
}

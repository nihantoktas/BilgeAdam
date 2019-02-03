package IfElsseYapisi;

import java.util.Scanner;

public class IfElseYapisisApp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int sayi1=input.nextInt();
        System.out.println("ikinci sayiyi giriniz:");
        int sayi2=input.nextInt();
        if (sayi1==sayi2) {
            System.out.println("sayi1 ve sayı2 eşittir.");
        }
        else  {
            System.out.println("sayi1 ve sayi2 eşit değildir.");
        }
        System.out.println("güle güle...");

    }
}

package Odev;

import java.util.Scanner;

public class AsalSayiApp {
    public static void main(String[] args) {
        int sayi,x=0;
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz.");
        sayi = input.nextInt();
        for (int i=2;i<=sayi/2;i++) {
            if (sayi % 1 == 0)
                x++;
                break;

        }

    }
}



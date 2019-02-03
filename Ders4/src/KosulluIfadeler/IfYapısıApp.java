package KosulluIfadeler;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IfYapısıApp {
    public static void main(String[] args) {
        int a=5;
        //if parantezleri ,çerisisndeki değer true ise blok içerisine girer
        if (a==5) {
            System.out.println("a değişkeni 5'e eşittir.");
        }
        //System.out.println("good bye..");
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir sayi giriniz:");
        int sayi=scanner.nextInt();
        if (sayi<10){
            System.out.println("girilen sayı 102dan küçüktür.");
        }

    }
}

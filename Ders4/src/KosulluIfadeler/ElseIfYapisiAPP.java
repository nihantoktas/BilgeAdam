package KosulluIfadeler;

import java.util.Scanner;

public class ElseIfYapisiAPP {
    public static void main(String[] args) {
        int sayi1,sayi2;
        Scanner input=new Scanner(System.in);
        System.out.println("birinci sayiyi giriniz:");
       sayi1=input.nextInt();
        System.out.println("ikinci sayiyi giriniz:");
        sayi2=input.nextInt();
        if (sayi1>sayi2){
            System.out.println("sayi1 büyüktür sayi2'den.");
        }
        else if (sayi1<10) {
            System.out.println("sayi1 10'dan küçüktür");
            if(sayi1==5){
                System.out.println("sayi1 5'e eşittir.");
            }

        }
        else{
            System.out.println("sayi1 küçüktür sayi2'den.");
        }
        System.out.println("güle güle..");
    }
}

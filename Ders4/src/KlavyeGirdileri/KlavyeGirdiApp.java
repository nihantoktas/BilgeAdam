package KlavyeGirdileri;

import java.util.Scanner;


public class KlavyeGirdiApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //scanner.nextInt();Integer değer okuyacağım zaman bu methodu kullan
        //scanner.nextDouble();Double değer okuyacağı zaman
        //Scanner.next();//String değerleri okumak için
        //scanner.nextLine();//string değerleri okumak için
        int sayi1,sayi2,sonuc;
        System.out.print("birinci sayiyi giriniz:");
        sayi1=scanner.nextInt();
        System.out.println("ikinci sayiyi giriniz:");
        sayi2=scanner.nextInt();
        sonuc=sayi1+sayi2;
        System.out.println("toplama işlemimizin sonucu:" +sonuc);
        //System.out.println("girdiğiniz sayı:" +sayi1);
    }
}

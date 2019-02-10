package Ornerkler;

import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class DortIslem {
    public static void main(String[] args) {
        Scanner İnput = new Scanner(System.in);
        int secenek, sayi1, sayi2;
        double sonuc;
        boolean devamEdilsinmi = false;
        do {
            System.out.println("hoşgeldiniz..");
            System.out.println("hangi işlemi yapmak istiyodunuz?");
            System.out.println("1-)toplama işlemi");
            System.out.println("2-)çıkarma işlemi");
            System.out.println("3-)bölme işlemi");
            System.out.println("4-carpmaişlemi");
            System.out.println("0-)çıkış");
            System.out.println();
            System.out.println("seçiniz:");
            secenek = İnput.nextInt();
            switch (secenek) {
                case 1:
                    System.out.println("1,sayiyi giriniz:");
                    sayi1 = İnput.nextInt();
                    System.out.println("2.sayiyi giriniz.");
                    sayi2 = İnput.nextInt();
                    sonuc = toplamaIslemi(sayi1, sayi2);
                    System.out.println("toplama işleminizin sonucu: " + sonuc);
                    devamEdilsinmi = true;
                    break;
                case 2:
                    System.out.println("1,sayiyi giriniz:");
                    sayi1 = İnput.nextInt();
                    System.out.println("2.sayiyi giriniz.");
                    sayi2 = İnput.nextInt();
                    sonuc = cıkarmaıslemi(sayi1, sayi2);
                    System.out.println("çıkarma işleminizin sonucu: " + sonuc);
                    devamEdilsinmi = true;
                    break;
                    case 3:
                    System.out.println("1.sayiyi giriniz:");
                    sayi1=İnput.nextInt();
                System.out.println("2.sayiyi giriniz.");
                sayi2=İnput.nextInt();
                sonuc=bolmeIslemi(sayi1,sayi2);
                System.out.println("bölme işlemimizin sonucu: "+sonuc);
                devamEdilsinmi=true;
                break;
                case 4:
                    System.out.println("1.sayıyı giriniz:");
                    sayi1=İnput.nextInt();
                    System.out.println("2.sayiyi giriniz:");
                    sayi2=İnput.nextInt();
                    sonuc=carpmaIslemi(sayi1,sayi2);
                    System.out.println("carpma işleminin sonucu: "+sonuc);
                    devamEdilsinmi=true;


                case 0:
                    devamEdilsinmi = false;
                    System.out.println();
                    break;
                default:
                    System.out.println("yanlış giriş yaptınız!");
                    devamEdilsinmi = true;
            }

        } while (devamEdilsinmi);

    }
        public static double toplamaIslemi(double sayi1,double sayi2) {
            /*double sonuc;
            sonuc=sayi1+sayi2;*/
            return sayi1+sayi2;
        }
        public static double cıkarmaıslemi(double sayi1,double sayi2){
            return sayi1-sayi2;
        }
        public static double bolmeIslemi(double sayi1,double sayi2) {
        return sayi1/sayi2;
        }
        public static double carpmaIslemi(double sayi1,double sayi2){
        return sayi1*sayi2;
        }

}

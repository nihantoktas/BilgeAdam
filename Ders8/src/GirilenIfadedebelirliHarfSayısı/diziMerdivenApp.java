package GirilenIfadedebelirliHarfSayısı;

import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

public class diziMerdivenApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir string ifade giriniz:");
        String ifade = scanner.nextLine();
        ifade = ifade.toLowerCase();
        System.out.println("sayısı bulunacak harfi giriniz");
        String harf = scanner.next();
        harf = harf.toLowerCase();
        if (ifade.length() > 0) {
            char[] karakterler = ifade.toCharArray();
            int sayac = 0;
            for (char karakter : karakterler) {
                String a = String.valueOf(karakter);
                if (a.equals(harf)){
                    sayac++;
                }
            }
            System.out.println("girilen harf sayısı:" +sayac);

        } else {
            System.out.println("bir string ifade girmeniz gerekmektedir.");
        }

    }
}


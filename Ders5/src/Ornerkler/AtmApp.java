package Ornerkler;
/*int a=1000000;
        int b=1000;
        double c=1_0_0;*/


import java.util.Scanner;

public class AtmApp {
    public static void main(String[] args) {
        int secenek = 0;
        String sifre = "1234";
        String girilenSifre = "";
        int bakiye = 1_000_000;
        int cekilecekMiktar = 0;
        boolean devamEdisinMİ = false;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("hoşgeldiniz..");
            System.out.println("şifrenizi giriniz:");
            girilenSifre = input.next();
            if (girilenSifre.equals(sifre)) {
                System.out.println("hangi işemi yapmak istiyorsunuz..");
                System.out.println("1-)Para çek");
                System.out.println("0-)çıkış");
                System.out.println("seçiniz:");
                secenek = input.nextInt();
                if (secenek >= 0 && secenek <= 1) {
                    switch (secenek) {
                        case 0:
                            devamEdisinMİ = false;
                            break;
                        case 1:
                            System.out.println("çekmek istediğiniz miktarı giriniz:");
                            cekilecekMiktar = input.nextInt();
                            if (cekilecekMiktar <= bakiye) {
                                bakiye = bakiye - cekilecekMiktar;
                                System.out.println("paranız çekiliyor..");
                                System.out.println("çekilen Miktar: " + bakiye + "TL");
                                System.out.println("Güle güle :)");
                                devamEdisinMİ = true;

                            } else {
                                System.out.println("yetersiz bakiye..");
                                devamEdisinMİ = false;
                            }
                    }
                } else {
                    System.out.println("yanlış seçenek..");
                }

            } else {
                System.out.println("yanlış şifre girdiniz..");
            }

        } while (devamEdisinMİ);


    }
}

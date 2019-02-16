

import java.util.Scanner;

public class SayiTahminOyunuApp {
    // kullanıcının 1 ile 10 arasında girdiği sayıyı
    //programın belirlediği rastgele sayı ile eleştiren
    //sayının 2 eksiğine ve 2 fazlasına yaklaştığında
    //yaklaştınız uyarısı veren
    //yaklaşmadığında kullanıcıya yaklaşamadınız diye uyarı veren
    //sayıyı bulduğun da kazandınız yazan
    //bir uygulama yazınız
    public static void main(String[] args) {

        boolean flag=true;
        do {
            int sayi;
            int gelensayi = (int) Math.random() * 20;
            System.out.println("hoşgeldiniz..");
            System.out.println("sayınız.." + (int) (Math.random() * 20));
            Scanner input = new Scanner(System.in);
            System.out.println("sayı giriniz");

            sayi = input.nextInt();



            if ( sayi == gelensayi) {
                int gelenSayi = input.nextInt();
            } else if (sayi == gelensayi - 1) {

                System.out.println("yaklaştınız");

            } else if (sayi == gelensayi + 1) {
                System.out.println("biraz daha deneyin");
            } else {
                System.out.println("tekrar deneyiniz");
            }

        } while(flag);



    }
}


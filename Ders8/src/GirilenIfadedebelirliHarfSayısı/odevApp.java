package GirilenIfadedebelirliHarfSayısı;

import java.util.Scanner;

public class odevApp {
    public static void main(String[] args) {
        //kullanıcı ilk olarak string ifade girecek sonrasında haraf girecek program girdiğ harf saysına o ifade içerisinde buylacak.
        //sonrasında da bir harf girecek
        //program girilen harf sayısını o ifade içerisinde bhulacak.
        Scanner input=new Scanner(System.in);
        System.out.println("bir string ifade giriniz:");
        String ifade=input.nextLine();//ard arda bir string ifade girilirken ilk
        ifade=ifade.toLowerCase();
        System.out.println("sayısı bulacak harfi giriniz:");
        String harf=input.next() ;

        /*

    }

}
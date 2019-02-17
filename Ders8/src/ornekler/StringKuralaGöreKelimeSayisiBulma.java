package ornekler;

import java.util.Scanner;

public class StringKuralaGöreKelimeSayisiBulma {

    public static void main(String[] args) {
        //Camel Case girilen string bir cümledeki kelime sayısı bulma
        //camel case string kullanıcı tarafından girilecek.

        String deger ="";


        char[] dizi = deger.toCharArray();

        int i= 0;
        String kelimesayısı="";
        for (i=0; i<dizi.length;i++) {
            if (Character.isUpperCase(dizi[i]))
                kelimesayısı += dizi[i];
        }
        System.out.println("kelime sayısı" + i);



    }


}



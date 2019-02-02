package aritmatikoperatorler;

import java.sql.SQLOutput;

public class IliskiselKarsılastirmaApp {
    public static void main(String[] args) {
        int a=5,b=10;
        //<,<=,>,>=,==.!=
        boolean sonuc;
        sonuc=a<b ;
        System.out.println("A'nın B'den küçük olma durumu: "+sonuc);
        System.out.println(a<b);
        sonuc=a>b;
        System.out.println("A'nın c'den büyük olma durumu: "+sonuc);
        sonuc=a<=b;
        System.out.println("A'nın B'den küçük eşit olma durumu: "+sonuc);
        sonuc=a>=b;
        System.out.println("A'nın B'den büyük eşit olma durumu: "+sonuc);
        sonuc=a==b;
        System.out.println("A'nın B'den eşit olma durumu: "+sonuc);
        sonuc=a!=b;
    }
}

package Stringler;

public class StringMethodlarıApp {
    public static void main(String[] args) {
        String deger="Merhaba java";
        System.out.println(deger.toUpperCase());
        deger.toLowerCase();
        System.out.println(deger);
        deger=deger.toLowerCase();
        System.out.println(deger);
        System.out.println(deger.charAt(8));
        System.out.println(deger.indexOf('j'));
        System.out.println(deger.lastIndexOf('a'));
        System.out.println(deger.substring(1));
        //verilen indis numarasından başlayıp
        //geriye kalan tüm ifadeyi getirir
        //verilen indis numarası da dahil
        System.out.println(deger.substring(0,3));
        System.out.println(deger.substring(3,7));
        System.out.println(deger.concat("naber"));
        System.out.println(deger+ "naber");
        System.out.println(deger.replace('a','o' ));
        System.out.println(deger.replaceAll(" ",""));
        String bosluk="Merhaba ";
        System.out.println(bosluk);
        System.out.println(bosluk.trim());
        String adSoyad="nihan toktaş";
        String ad="";
        String soyad="";
        int boslukDeger=adSoyad.indexOf(" ");
        System.out.println("bosluk deger: "+boslukDeger) ;
        ad=adSoyad.substring(0,boslukDeger);
        soyad=adSoyad.substring(boslukDeger+1);
        System.out.println("ad:" +ad);
        System.out.println("soyad: "+soyad);
        char [] dizi = deger.toCharArray();
        for (char c:dizi) {
            System.out.println(c);
        }
        String a="12";
        //ilkel tipe dönüştürmek için parseInt() methodu kullanılır.
        int sayi=Integer.parseInt(a);
        System.out.println(sayi);
        // primitive tipleri String veri tipine dönüştürmek için valueof methodu kullanılır
        Integer Sayi2=Integer.valueOf(a);
        String stringSayi=String.valueOf(sayi);
        String stringSayi2= Sayi2.toString();
        //(wrapper) nesne tipindeki bir değeri string çevirmek için
        // Valueof kullanılabilir.
        //string.valueof methodu objeckt türünden nesne alındığı için.
        //java da tüm nesneler objeckt tarafından türer.
        String asa=String.valueOf(stringSayi2);

    }
}

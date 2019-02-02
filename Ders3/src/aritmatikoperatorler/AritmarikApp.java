package aritmatikoperatorler;

public class AritmarikApp {
    //değişken isimleri farklı olmalıdır.

    public static void main (String [] args) {
        System.out.println("merhaba ilk branch");
        int a=7,c=3,d;
        int b=3;
        int sonuc;
        double bolmesonucu,x=7;
        sonuc=a+b;
        System.out.println("toplama işlemi: "+sonuc);
        sonuc=a-b;
        System.out.println("çıkarma işlemi. "+sonuc);
        sonuc=a*b;
        System.out.println("çarpma işlemi: "+sonuc);
        sonuc=a/b;
        System.out.println(" Integer bölme islemi: "+sonuc);
        bolmesonucu=x/b;
        System.out.println("double bölme işlemi: "+bolmesonucu);
sonuc=a%b;
        System.out.println("(mod alma)sayının kalanını bulma işlemi: "+sonuc);
        a=a+b;
        System.out.println("normal atama: +a" ) ;
        a=7;
        System.out.println("Aritmatik atama" +a);


    }
}

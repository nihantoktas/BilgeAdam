package ErisismBelirtecleri2;

import ErisimBelirtecleri.Dikdortgen;
//private ile sadece sınıf üzerinden erişebilirim.
//public ile tüm paketlerden erişim sağlayabilirim.
//protected ile sadece aynı paketten
//ve protected tanımlı methodu olan sınıfın alt sınıflarından
//erisebilirim
//default erişim belirteci ile sadece
//o paket içerisinden erişebilirim
public class StarApp {
    public static void main(String[] args) {
        Dikdortgen dikdortgen=new Dikdortgen();
        dikdortgen.setEn(10);
    }

}

package Methodlar;

public class OrneklerApp {
    public static void main(String[] args) {
        helloMethod();
        saiYaz(12);
        int sonuc=10+20;
        saiYaz(sonuc);
        saiYaz(13+14+5);
        int gelenDeger=


    }
    //return tipi olmayan ve parametre alamayan method
    //static olmasının sebebi static method'tan çağırabilmek için.
    public static void helloMethod() {
        System.out.println("hello method..");
    }
    // dönüş tipi olmayan parametre alan method
    public static void saiYaz(int sayi) {
        System.out.println("Sayınız: "+sayi);
        public static void toplamaIslemi(int sayi1,int sayi2) {
            int sonuc=sayi1+sayi2;
            System.out.println("toplama işlemi sonucu "+sonuc);
        }
        public static int donusTipiOlanToplamaIslemi(int sayi1,int sayi2) {
            int sonuc=sayi1+sayi2;
            System.out.println("donus tipi olan toplama işlemi");
            return sonuc;
        }

}

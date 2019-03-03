package cokbicimlilik;

public class StartApp2 {
    public static void main(String[] args) {
        Sekiller sekiller=new Sekiller();
        Dikdortgen dikdortgen=new Dikdortgen();
        dikdortgen.setBoy(6);
        dikdortgen.setEn(5);
        Kare kare=new Kare();


    }

    public static void sekillerinAlaniniHesapla(Object nesne){
        if (nesne instanceof Sekiller ){
            Sekiller sekiller=(Sekiller) nesne;
            System.out.println("sekiller nesnenesin alanı:");
        }
    }
}

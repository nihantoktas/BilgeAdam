package cokbicimlilik;
//bir nesnenein başka bir nesne gibi davranış sergilemesi

public class StartApp {
    public static void main(String[] args) {
        Sekiller sekiller=new Sekiller();

        Dikdortgen dikdortgen=new Dikdortgen();
        dikdortgen.setEn(5);
        dikdortgen.setBoy(6);
        System.out.println("dikdörtgen alanı:"
        +dikdortgen.getAlanHesapla());
        Kare kare=new Kare();



    }


}

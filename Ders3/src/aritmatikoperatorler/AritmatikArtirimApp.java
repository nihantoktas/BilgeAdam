package aritmatikoperatorler;

public class AritmatikArtirimApp {
    public static void main(String[] args) {
        int a = 2,b = 7,c = 40,d = 50;
        a++;//Değişkenimi ata sonra artır.
        System.out.println("değişkenimi ata sonra bir kere artır. ");
        ++b;//değişkenimi birkere artır sonra ata.
        System.out.println("değişkenimi birkere artır sonra ata. ");
        c--;//Değişkenimi ata sonra birkere azalt.
        System.out.println("değişkenimi ata sonra birkere azalt. ");
        --d;//Değişkenimi birkere azalt sonra ata.
        System.out.println("değişkenimi birkere azalt sonra ata. ");
        int x=7,y=7,sonuc1,sonuc2;
        sonuc1=++x;
        sonuc2=y++;
        System.out.println("sonuç 1: "+sonuc1);
        System.out.println("artırımdan sonraki x değeri: "+x);
        System.out.println("sonuç 2: "+sonuc2);
        System.out.println("artırımdan sonraki y değeri: ");
    }
}

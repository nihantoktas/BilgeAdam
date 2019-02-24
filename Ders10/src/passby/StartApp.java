package passby;

public class StartApp {
    public static void main(String[] args) {
        Dikdortgen dikdortgen=new Dikdortgen();
        dikdortgen.en=5;
        passByValue(dikdortgen,10);
        System.out.println(dikdortgen.en==5);
    }
    public static void passByValue(Dikdortgen dikdortgen,int a){
       a=5;
        dikdortgen=new Dikdortgen();
        dikdortgen.en=6;
        System.out.println(dikdortgen.en==5);
    }
    public static void passByReferance(Dikdortgen dikdortgen){
        dikdortgen.en=10;
    }
}

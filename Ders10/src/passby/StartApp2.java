package passby;

public class StartApp2 {
    public static void main(String[] args) {
        Dikdortgen dikdortgen=new Dikdortgen();
        dikdortgen.en=5;


        System.out.println(dikdortgen.en==5);
    }

    public static void passByRefarence(Dikdortgen dikdortgen){
        dikdortgen=new Dikdortgen();
        dikdortgen.en=6;
    }



    }

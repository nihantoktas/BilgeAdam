package Kodbloklari;

public class KodBloklariApp {

    public static void main(String[] args) {
        int a=5;
        System.out.println("kademe1 a degeri "+a);
        {
            b = 5;
            a = 3;
            System.out.println("kademe 2 a değeri: " + a);
            {
                int b = 10;
                a = 2;

                System.out.println("kademe 3 " + " a degeri: " + a + "b değeri");
            } b=7;
            System.out.println("kademe 4 "+"a degeri:"+a+" b degeri); " }

    }
}

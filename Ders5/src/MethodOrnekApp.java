import java.util.Scanner;

public class MethodOrnekApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2;
        System.out.println("+");
        System.out.println("-");
        System.out.println("/");
        System.out.println("*");
        System.out.println("yapılacak işlem.");
        int secenek = input.nextInt();
        switch (secenek) {
            case 1:
                System.out.println("birinci sayi:");
                sayi1 = input.nextInt();
                System.out.println("ikinci sayi");
                sayi1 = input.nextInt();
                //genelmethod(sayi1 + sayi2);
                break;
            case 2:
                System.out.println("birinci sayi:");
                sayi1=input.nextInt();
                System.out.println("ikinci sayi");
                sayi2=input.nextInt();
                        //genelmethod(sayi1-sayi2);
                break;
            case 3:
                System.out.println("birinci sayi:");
                sayi1 = input.nextInt();
                System.out.println("ikinci sayi");
                sayi1 = input.nextInt();
                        //genelmethod(sayi1*sayi2);
                //int carpmaIslemi=carpmaIslemi(sayi1*sayi2);
               // System.out.println(carpmaIslemi);
                break;
            case 4:
                System.out.println("birinci sayi:");
                float sayi3 = input.nextInt();
                System.out.println("ikinci sayi");
                float sayi4 = input.nextInt();

                //float bolmeIslemi(sayi1/sayi2);
                //System.out.println(bolmeIslemi);
                break;


        }
    }


}



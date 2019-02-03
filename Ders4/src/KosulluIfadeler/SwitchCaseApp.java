package KosulluIfadeler;

import java.util.Scanner;

public class SwitchCaseApp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("bir değer giriniz:");
        int ifade=input.nextInt();
        switch (ifade){
            case 1:
                System.out.println("verilen ifade: "+ifade);


            case 2:
                    System.out.println("verilen ifade: "+ifade);
                    break;
            case 3:
                    System.out.println("verilen ifade: "+ifade);
                    break;
            default:

                    System.out.println(" default verilen ifadenin karşılığı yok.");


        }

    }
}

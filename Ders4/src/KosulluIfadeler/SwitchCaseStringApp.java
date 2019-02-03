package KosulluIfadeler;

import java.util.Scanner;

public class SwitchCaseStringApp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("hangi gün haftanın kaçıncı günü");
        String haftaningunu=input.next();
        switch (haftaningunu) {
            case "pazartesi":
                System.out.println("haftanın 1.günüdür.");
                break;
            case "salı":
                System.out.println("haftanın ikinci günüdür.");
                break;
            case "çarşamba":
                System.out.println("haftanın üçüncü günüdür");
                break;
            case "perşembe":
                System.out.println("haftanın dördüncü günüdür.");
                break;
            case "cuma":
                System.out.println("haftanın beşinci günüdür.");
                break;
            case "cumartesi":
                System.out.println("haftanın altıncı günüdür.");
                break;
            case "pazar":
                System.out.println("haftanın yedinci günüdür.");
                break;
            default:
                System.out.println("yanlış ifade girdiniz.");
        }

    }
}

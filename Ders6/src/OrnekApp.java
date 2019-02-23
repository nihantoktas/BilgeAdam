import java.util.Scanner;

public class OrnekApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("dizinin boyutunu giriniz.");
        int diziBoyutu=scanner.nextInt();
        int [][] dizi =new int[diziBoyutu][diziBoyutu];

        for (int i=0;i<dizi.length;i++)
        for (int k=0;k<dizi[0].length;k++){
            System.out.println(dizi[i][k]+ "");

        }
        System.out.println();

    }
}

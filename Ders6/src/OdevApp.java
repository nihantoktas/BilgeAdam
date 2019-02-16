public class OdevApp {
    public static void main(String[] args) {
        int[] dizi = {7, 3, 125, 9, 1, 0, 17, 88, 22, 4};
        System.out.println("Dizinin boyutu: " + dizi.length);
        int i;
        int k;
        int temp=0;
        for (i = 0; i <= dizi.length; i++) {
            System.out.println(dizi[i]);
            for (k = i + 1; k < dizi.length - 1; k++) {
                if (dizi[i] > dizi[k]) {
                    temp=dizi[k];
                    dizi[k]=dizi[i];
                    dizi[i]=temp;
                } String sonuc="";
                for (int diziElemanı:dizi){

                }
            }
        }
    }
}

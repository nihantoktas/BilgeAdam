package IkiBoyutluDizi;

public class IkıBoyutluDizilerApp {
    public static void main(String[] args) {
        /*int satir=3,sutun=4;
        int[][] dizi=new int[satir][sutun];
        System.out.println("Dizinin boyutu: " +dizi.length );
        System.out.println("Dizinin ssutun boyutu" +dizi[0].length);
        int sayac=0;
        for (int i=0;i<dizi.length;i++){
            //her bir satırdaki sütun sayısına erişebilmek için
            //dizi[i].length kullanıyoruz
            for (int k=0;k<dizi.length;k++){

                System.out.print( dizi[i][k]+"");

            }
            System.out.println();
        }*/
        int satir=3, sutun=3;
        int [] dizi={3,4,1,2,5,10,2,4,15}
        int [][] dizi=new int[][]{{3,4,1} , {2,5,10} ,{2,14,15}};
        for (int i=0;i<dizi.length;i++){
            for (int k=0;k<3;k++){
            System.out.println(dizi[i][k] +"");
        }


    }
}

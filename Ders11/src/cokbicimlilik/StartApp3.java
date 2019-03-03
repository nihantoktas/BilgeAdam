package cokbicimlilik;

import java.util.ArrayList;

public class StartApp3 {
    public static void main(String[] args) {
        genisletebilirlilik();
        dinamikDizi();
        //genisletebilirlilikWithArrayList();

    }


    public static void genisletebilirlilik() {
        Sekiller sekillers = new Sekiller();
        Sekiller sekiller2 = new Sekiller();
        Dikdortgen dikdortgen = new Dikdortgen();
        Dikdortgen dikdortgen2 = new Dikdortgen();
        dikdortgen.setEn(2);
        dikdortgen.setBoy(3);
        Kare kare = new Kare(9);
        Kare kare2 = new Kare();

        Sekiller[] sekillerDizisi = new Sekiller[6];
        sekillerDizisi[0] = sekillers;
        sekillerDizisi[1] = sekiller2;
        sekillerDizisi[2] = dikdortgen;
        sekillerDizisi[3] = dikdortgen2;
        sekillerDizisi[4] = kare;
        sekillerDizisi[5] = kare2;
    }

    public static void sekillerAlalnlari(Sekiller[] sekillerDizi) {
        if (sekillerDizi.length > 0) {
            for (Sekiller sekiller : sekillerDizi) {
                System.out.println(sekiller.alanHesapla());
            }
        }
    }

    public static void dinamikDizi() {


        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 1; i < 10; i++)
            arrayList.add(i);
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println("temislemeden önceki boyutu" + arrayList.size());
        arrayList.remove(3);

        for (Integer eleman : arrayList) {
            System.out.println(eleman);
        }
        arrayList.clear();
        System.out.println("temizlendikten sonraki boyutu:" + arrayList.size());

    }
    public static ArrayList<Sekiller> getSifirdanBuyukOlanAlanlar


    public static void getSifirdanBuyukOlanAlanlar(ArrayList<Sekiller> sekillerArrayList) {
        if (sekillerArrayList.size() > 0) {
            for (Sekiller sekil : sekillerArrayList) {
                if (sekil.alanHesapla() == 0) {
                }
            }
            return sekillerArrayList:
        }

        public static void genisletebilirlilikWithArrayList (ArrayList < Sekiller > sekillerArrayList) {


            Sekiller sekiller = new Sekiller();
            Sekiller sekiller1 = new Sekiller();
            Dikdortgen dikdortgen = new Dikdortgen();

        }


    }
}


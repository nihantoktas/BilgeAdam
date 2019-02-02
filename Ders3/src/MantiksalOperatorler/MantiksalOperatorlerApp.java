package MantiksalOperatorler;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class MantiksalOperatorlerApp {


    public static void main(String[] args) {
        /*<var1> && <var2>
         *ve operatörü -> sağındaki ve solundaki değişken değeri true ise true değerini verir

         */
        /** <var1> // </var2> yada operatörü
         * sağındaki ve solundaki değerler false ise false değerini verir
         * sağındaki ve solundaki değerlerden birisi true ise true değerini
         */
        /**
         * ! <var1> değil mi operatörü
         * verilen değişkenin tersini bize verir.
         * verilen değişken true ise false değerini verir.
         * verilen değişken false ise true değerini verir.
         *
         */
        boolean x=true, y=false, z=true, t=false,sonuc;
        sonuc=x&&z;
        System.out.println("x ve z and (&&) ile karşılaştırılması: "+sonuc);
        sonuc=x&&y;
        System.out.println("y ve t yada (||) ile karşılaştırılması: "+sonuc);
        sonuc=x || y;
        System.out.println("x ve y yada (||) ile karşılaştırılması: "+sonuc);
    }
}

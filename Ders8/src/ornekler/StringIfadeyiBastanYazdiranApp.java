package ornekler;

public class StringIfadeyiBastanYazdiranApp {
    public static void main(String[] args) {
        String deger="Merhaba Java"; //avaj abahrem
        char [] dizi = deger.toCharArray();
        String sonuc="";
         for (int i=dizi.length-1;i>=0;i--){
             sonuc+=dizi[i];
         }



        }
    }


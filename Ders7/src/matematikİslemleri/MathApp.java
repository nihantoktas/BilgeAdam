package matematikİslemleri;


import java.util.Random;

public class MathApp {
    public static void main(String[] args) {
        //Math sınıfı java.Lang paketi ile otomatik olarak beraber gelir.
        System.out.println("Sayının kökünü alma: "+Math.sqrt(16));
        System.out.println("sayının mutlak değeri: "+Math.abs(-2));
        System.out.println("ondalıklı sayının bir üst tam sayı değerini alma: "+Math.ceil(2.17));
        System.out.println("ondalıklı sayının bir alt tam sayı değerini alma: "+Math.floor(5.98));
        System.out.println("ondalıklı sayının en yakın tam sayı" +Math.round(2.07));
        System.out.println("bir sayının üssünü alma:"+Math.pow(5,2));
        System.out.println("sayılar arasında büyük olanı bulma" +Math.max(1,6));
        System.out.println("sayılar arasında küçük olanı bulma" +Math.min(1,6));
        System.out.println("pi sayısının değeri:" +Math.PI);
        System.out.println("eular değeri:" +Math.E);
        System.out.println("sıfır ile bir arasında ondalıklı random sayı üretme: "+Math.random());
        System.out.println("Random sayı üretme" +(int)(Math.random()*20));
        Random random=new Random();
        System.out.println(random.nextInt(5));


    }
}

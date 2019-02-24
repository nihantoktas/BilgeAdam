package Kompozisyon;

public class Araba {
    private Motor motor;
    public Araba(){
        motor=new Motor();
    }
    public void hareketZamnı(){
        motor=new Motor();
        motor.motoruCalistir();
        System.out.println("araba harekete geçti...");
    }
    public void durmaZamanı(){
        motor.motoruDurdur();
        System.out.println("arabaa hareketsiz durumda");
    }
}

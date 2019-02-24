package Kompozisyon;

public class Motor {
    private int motorGücü;
    public Motor(){
        this.motorGücü=130;
    }
    public void motoruCalistir(){
        if (motorGücü>0){
            System.out.println("Motor çalışıyor.");
        }
        else {
            System.out.println("motor çalıştırılamadı.");
        }
    }
    public void motoruDurdur(){
        System.out.println("motor durudurldu...");
        this.motorGücü=0;
    }
}

package ErisimBelirtecleri;

public class Dikdortgen {
    private double en;
    private double uzunlugu;

    public double getEn(){
        return  this.en;
    }
    public void setEn(double en){
        this.en=en;
    }
    public double getUzunlugu(){
        return this.uzunlugu;
    }
    public void setUzunlugu(double uzunlugu){
        this.uzunlugu=uzunlugu;
    }
    public String toString(){
        return "Dikdörtgenin eni:" +this.en+"uzunlugu:"+this.uzunlugu;
    }
}

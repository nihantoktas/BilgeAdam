package Kalıtım2;

public class Kisi {
    private String ad;
    private String soyad;
    private int yas;
    public Kisi(String ad,String soyad,int yas){
        this.ad=ad;
        this.soyad=soyad;
        this.yas=yas;

    }
    public String getAd(){
        return this.ad;
    }
    public void setAd(String ad){
        this.ad=ad;
    }
    public String getSoyad(){
        return this.soyad;
    }
    public  void setSoyad(String soyad){
        this.soyad=soyad;
    }
}

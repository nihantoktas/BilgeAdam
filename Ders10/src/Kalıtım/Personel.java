package Kalıtım;

public class Personel {
    private String ad;
    private String soyad;
    private int yas;
    private long sicilNumarasi;
    public Personel(){

    }
    public Personel(String ad,String soyad,int yas,long sicilNumarasi){
        this.ad=ad;
        this.soyad=soyad;
        this.yas=yas;
        this.sicilNumarasi=sicilNumarasi;
    }
    public String getAd(){
        return this.ad;
    }
    public void setAd(String ad){
        this.ad=ad;
    }
    public  String Soyad(){
        return this.soyad;
    }
    public void setSoyad(String soyad){
        this.soyad=soyad;
    }
    public int getYas(){
        return this.yas;
    }

    public void setYas(int yas){
        this.yas=yas;
    }

    public long getSicilNumarasi(){
        return this.sicilNumarasi;
    }



    public void setSicilNumarasi(long sicilNumarasi){
        this.sicilNumarasi=sicilNumarasi;

    }
  }

package Kalıtım;

public class ogrenci {
    private String ad;
    private String soyad;
    private int yas;
    private long okulNumarasi;
    public ogrenci(){

    }
    public ogrenci(String ad,String soyad,int yas,long okulNumarasi){
        this.ad=ad;
        this.soyad=soyad;
        this.yas=yas;
        this.okulNumarasi=okulNumarasi;
    }
    public String kisiBilgileri(){
        return "adi:"+this.ad+"soyadi"
    }
    public String getAd(){
        return this.ad;
    }
    public String getSoyad(){
        return this.soyad;
    }
    public int getyas(){
        return this.yas;
    }
    public void setYas(int yas){
        this.yas=yas;
    }
    public long getOkulNumarasi(){
        return this.okulNumarasi;
    }
    public void setOkulNumarasi(long okulNumarasi){
        this.okulNumarasi=okulNumarasi;
    }
}

package Stringler;

public class StingIfadelerApp {
    public static void main(String[] args) {
        String jv="Merhaba java";
        String a=new String( "Merhaba java");
        //String a="Merhaba java";
        System.out.println(jv);
        System.out.println(a);

            System.out.println("java değişkeninin boyutu "+jv.length());
        System.out.println("a değişkeninin boyutu "+a.length());
        if (jv==a){
            System.out.println("eşit");
        }
        if (jv.equals(a)){
            System.out.println("equals ile eşittir.");
        }

        }
    }


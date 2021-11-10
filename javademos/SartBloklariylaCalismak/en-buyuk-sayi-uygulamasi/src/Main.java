public class Main {
//En büyük sayıyı bulma algoritması
    public static void main(String[] args) {
        int sayi1=20;
        int sayi2=26;
        int sayi3=30;
        int enb=sayi1;


        if (enb<sayi2){
            enb=sayi2;
        }
        if (enb<sayi3) { //tekrar bir if açtım çünkü else if yapıp devam ettirseyim değeri hatalı veriyor
            enb = sayi3;
        }

        System.out.println(enb);

    }
}

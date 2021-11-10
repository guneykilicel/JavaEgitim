public class Main {
    // kendileri hariç pozitif tam bölenleri toplamı birbirine eşit olan sayılara arkadaş sayılar denir.
    //1 den başlayıp 220 yi bölen 220 dahil değil toplamları 284 -------- 284 bölenleri toplamı da 220 ise arkadaşlardır.
    // 220-284 arkadaş sayılardır
    public static void main(String[] args) {
        int sayi1 = 220;
        int sayi2 = 284;
        int sayi1toplam = 0;
        int sayi2toplam = 0;

        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0) {
                sayi1toplam += i;
            }
        }

        for (int i = 1; i < sayi2; i++) {
            if (sayi2 % i == 0) {
                sayi2toplam += i;
            }
        }

        if (sayi1 == sayi2toplam && sayi2==sayi1toplam){
            System.out.println("Arkadas sayilar.");
        }
        else {
            System.out.println("Arkadas degiller.");
        }

    }
}

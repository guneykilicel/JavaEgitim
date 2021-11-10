public class Main {

    public static void main(String[] args) {

        String mesaj = "Bugun hava cok guzel.";

        String yeniMesaj = mesaj.substring(0, 2);
        System.out.println(yeniMesaj);

        int sayi = topla(5, 7); //topla metodu void değil int olduğu ve rreturn ile değer döndürdüğü için bir değişkene atanabilir. Ancal void fonksiyonlar atanamaz çünkü bir değer döndürmezler.
        System.out.println(sayi);

        int toplam = topla2(2, 3, 4, 5, 6, 10); //...sayilara bu şekilde değerler gönderiyoruz.
        System.out.println(toplam);

    }

    public static void ekle() {
        System.out.println("Eklendi.");
    }

    public static void sil() {
        System.out.println("Silindi.");
    }

    public static void guncelle() {
        System.out.println("Guncellendi.");
    }

    public static int topla(int sayi1, int sayi2) {

        return sayi1 + sayi2; //return mantığı int metodu
    }

    public static String sehirVer() {
        return "Ankara";
    }

    public static int topla2(int... sayilar) { //int... dediğimizde sınırsız değer verebiliyoruz
        // şey gibi düşün sayiları dizilere çeviriyor.
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;

    }
}

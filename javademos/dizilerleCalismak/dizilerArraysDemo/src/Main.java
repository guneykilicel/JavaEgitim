public class Main {

    public static void main(String[] args) {

        String[] ogrenciler = new String[3]; //3 elemanlı bir dizi tanımladık
        ogrenciler[0] = "Guney";
        ogrenciler[1] = "Irem";
        ogrenciler[2] = "Kuzey";

        for(int i=0; i<ogrenciler.length; i++){
            System.out.println(ogrenciler[i]);
        }

        //ikinci yöntem bu daha iyi bir kullanım şekli
        for(String ogrenci:ogrenciler){ //ogrenciler dizisindeki elemanları sırayla ogrenciye atayıp yazıyoruz
            System.out.println(ogrenci);

        }


    }
}

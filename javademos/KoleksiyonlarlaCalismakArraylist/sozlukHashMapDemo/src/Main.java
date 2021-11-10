import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String,String> sozluk = new HashMap<String,String>();
        sozluk.put("book","kitap"); //'put' ekleme komutu
        sozluk.put("table","masa");
        sozluk.put("computer","bilgisayar");
        System.out.println(sozluk.size()); //3

        for (String item: sozluk.keySet()){ // keySet=anahtar listesi: book, table, computer elemanlarını bir liste olarak verir
            System.out.println("Eleman:"+item+" Değer:"+sozluk.get(item));//get ile sözlük olmasını kullanıyoruz.
        }

        //sozluk.remove("table");
        //sozluk.clear();
        System.out.println(sozluk.get("table")); //masa
    }

}

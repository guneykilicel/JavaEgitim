public class Main {

    public static void main(String[] args) {

        String mesaj = "Bugun hava cok guzel.";
        //Stringler birer karakter dizileridir. Yani her elemana tek tek ulaşılabilir.
        System.out.println(mesaj);

        //LENGTH (metin uzunluğu bulur)
        System.out.println("Eleman sayısı: " + mesaj.length()); //.length() ile karakter sayısına bakarız


        //CHAR AT (verilen indexe ulaşır)
        System.out.println("5. eleman: " + mesaj.charAt(4)); //5. eleman: n //.charAt ile elemanlara ulaşabiliriz. 4 yazdık 4. index gibi düşün 0 dan başladığı için 5 olmuş oluyor.


        //CONCAT '+' ile aynı
        System.out.println(mesaj.concat(" Merhaba!")); //.concat ile tanımlanmış olan mesajı ekledik (Bugun hava cok guzel. Merhaba!)
        System.out.println(mesaj + (" Merhaba!")); //üstteki ile aynısı


        //STARTS WITH (boolean türde metnin ne ile "başladığını" kontrol eder)
        System.out.println(mesaj.startsWith("B")); //Eğer B ile başlıyorsa True başlamıyorsa False #true //zaten otomatik tamamlamada 'boolean' yazar en sağında
        //ENDS WITH (boolean türde metnin ne ile "bittiğini" kontrol eder)
        System.out.println(mesaj.endsWith(".")); //Eğer . ile bitiyorsa True bitmiyorsa False #true


        //GET CHARS (alıp atama)
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0); //mesaj metininde 0'dan başla 4. index e kadar karakterler dizisine ata(5 eleman atar) karakterler dizisine atarken de 0. indexten dan başla
        // otomatik tamamlamada en sağda void yazar yani bir şey döndürmüyor
        //Bugun
        System.out.println(karakterler);


        //INDEX OF ''(karakter arama) ""(kelime arama)
        System.out.println(mesaj.indexOf('a')); //7 //mesaj Stringi içerisinde a yı arar ilk bulduğu a nın 'indexini' ekranan verir
        System.out.println(mesaj.indexOf("cok")); //11 //mesaj Stringi içerisinde cok kelimesini arar ilk bulduğu cok kelimesinin c HARFİNİN 'indexini' ekranan verir
        //karakter ise ''(tek tırnak) --- String ise ""(çift tırnak) !stringlerde kelimenin ilk harfinin indexini döndürür


        //LAST INDEX OF ''(sondan karakter arama)
        System.out.println(mesaj.lastIndexOf('a')); //9 //indexOf ile aynı mantık ancak sondan başlar bu
        System.out.println(mesaj.lastIndexOf("guzel")); //baştan veriyor bu yine anlamadım


        //REPLACE (değiştirme)
        System.out.println(mesaj.replace(' ', '-')); //boşluk yerine - koyduk //Bugun-hava-cok-guzel.
        System.out.println(mesaj); //Stringimizi adresinden değiştirmez o yüzden tekrara yazdığımızda orijinaline tekrar ulaşabiliriz.
        // bu da demektir ki biz bunu yeni bir stringe de atayabiliriz.
        String yeniMesaj = mesaj.replace(' ', '-'); //mesaj.replace(' ','-')
        System.out.println(yeniMesaj); //Bugun-hava-cok-guzel.


        //SUBSTRING (metinin istediğimiz bölümünü indexler ile alma)
        System.out.println(mesaj.substring(2)); //2. index dahil ve sonrasını ekrana yazar //gun hava cok guzel.
        System.out.println(mesaj.substring(2, 4)); //2. index dahil ancak 4. index dahil değil //gu


        //SPLIT (Python ile aynı yani bölüyor)
        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime); //Ekran çıktısı:
            /*
            Bugun
            hava
            cok
            guzel.
             */
        }


        //TO LOWER CASE (tüm harfleri küçük harf yapar)
        System.out.println(mesaj.toLowerCase()); //tüm harfleri küçük harf yapar //bugun hava cok guzel.
        //TO UPPER CASE (tüm harfleri büyük harf yapar)
        System.out.println(mesaj.toUpperCase()); //tüm harfleri büyük harf yapar //BUGUN HAVA COK GUZEL.


        //TRIM (baştaki ve sondaki boşlukları siler)
        String bosluklumesaj = "           Bugun hava cok guzel.        ";
        System.out.println(bosluklumesaj);
        System.out.println(bosluklumesaj.trim()); //baştaki ve sondaki boşlukları siler
        System.out.println(bosluklumesaj);


    }
}

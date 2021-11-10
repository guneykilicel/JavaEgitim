import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) /*throws IOException*//* ya 'throws' ile bunu yazıcaksın ya da try except açıcaksın*/ {
        BufferedReader reader = null; //normalde try içerisinde null yerine new yazıp devam da edebiliriz ancak öyle yaparsak finally de reader a ulaşamayız try içinde kalır.
        int total=0;
        try {
            reader = new BufferedReader(new FileReader("C:\\javademos\\HataYonetimi\\readingFileDemo\\src\\sayilar.txt"));
            String line=null;
            while ((line = reader.readLine()) !=null){ //bu readLine ın hata vermemesi için bir tane genel Exception yazıp rahat edelim yoksa catchlerden birine IOException yazmamız gerek.
                total += Integer.valueOf(line);//line dan aldığını sayıya çeviriyor. Tabiki sayıysa eğer değilse NumberFormatException verir.
            }
            System.out.println(total);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            // reader.close(); //dosyayı kaptıyoruz. hata vermemesi için ya alttaki gibi try ile yazacağız ya da yukarıda throw vereceğiz.
            try {
                reader.close(); //dosyayı kaptıyoruz.
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

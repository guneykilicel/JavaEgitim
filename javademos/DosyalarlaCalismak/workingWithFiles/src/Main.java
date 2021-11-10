import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        createFile();
        getFileInfo();
        readFile();
        writeFile();
        readFile();

    }

    public static void createFile(){ //bir metoda çıkarttık dosya oluşturmayı
        File file = new File("C:\\javademos\\DosyalarlaCalismak\\files\\students.txt");
        try {
            if (file.createNewFile()) { //dosya üretme komutu üretirse true döndürür üretmezse false
                System.out.println("Dosya oluşturuldu");
            } else{
                System.out.println("Dosya zaten mevcut");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFileInfo(){
        File file = new File("C:\\javademos\\DosyalarlaCalismak\\files\\students.txt");
        if (file.exists()){
            System.out.println("Dosya adı: "+file.getName()); //Dosya adı: students.txt
            System.out.println("Dosya yolu: "+file.getAbsolutePath()); //Dosya yolu: C:\javademos\DosyalarlaCalismak\files\students.txt
            System.out.println("Dosya yazılabilir mi: "+file.canWrite()); //Dosya yazılabilir mi: true
            System.out.println("Dosya okunabilir mi: "+file.canRead()); //Dosya okunabilir mi: true
            System.out.println("Dosya boyutu: "+file.length()); //Dosya boyutu: 8  (byte cinsinden verir)
        }
    }

    public static void readFile(){
        File file = new File("C:\\javademos\\DosyalarlaCalismak\\files\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){ //dosya sonuna kadar satır satır gider bittiğinde false verir döngü durur
                String line = reader.nextLine(); //dosyadaki satır içeriğini alır.
                System.out.println(line);
            }
            reader.close(); //dosya kapama
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(){
        try {
            //diğerlerini silip üstüne yazma
            //BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\javademos\\DosyalarlaCalismak\\files\\students.txt"));
            //append: ekleme diğer verilere bir şey olmaz (path den sonra ,true yapıyoruz.)
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\javademos\\DosyalarlaCalismak\\files\\students.txt",true));
            writer.newLine();
            writer.write("Kuzey");
            System.out.println("Dosyaya yazılldı.");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

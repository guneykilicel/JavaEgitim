import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.add("İzmir");
        sehirler.add("Aydın");

        //sehirler.remove(1); //1. indexi siler ama aşağıda gösterdiğim gibi de silinebilir.
        sehirler.remove("İstanbul"); // İstanbul'u siler.
        Collections.sort(sehirler); //sort ile sıralama yaparız. Mesela Aydın İzmir'in altında ancak sıraladığımız için
        // for ile yazdırırken ondan önce ekrana yazılacak
        for (String sehir: sehirler){
            System.out.println(sehir);
        }

    }
}

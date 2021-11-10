import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Şimdi Arraylistlerin farkını dizilerle karşılaştırıp anlayacağız
        /*
        int[] sayilar = new int[]{1,2,3};
        sayilar = new int[4]; //dizinin boyutunu büyüttüğümüzde tüm değerler gitti hepsi 0 oldu
        System.out.println(sayilar[0]); //0
        */

        //Ama koleksiyonlarda böyle bir şey ile karşılaşmıyoruz.
        ArrayList sayilar = new ArrayList(); //farkettiysen eleman sayısı da belirtmedik tür de
        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");//tür belirtmediğimiz için hem sayı hem de kelime atayabildik
        //System.out.println(sayilar.size()); //3 #kaç eleman olduğunu verir.
        //sayilar.set(0,100); //0. indexi 100 yap.
        //System.out.println(sayilar.get(0)); //0. indexi getir.
        //sayilar.remove(0); //0. indexi sil mesela 0. indeximizde 1 vardı direkt yerini siliyor artık 0. indexte 10 var.
        //sayilar.clear(); // listede eleman hiç yok siliyor tamamen


        for (Object i: sayilar){ //Object i dedik çünkü bak dizimizde sayılar da var kelime de
            System.out.println(i);
        }


    }
}

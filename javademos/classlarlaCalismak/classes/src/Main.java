public class Main {

    public static void main(String[] args) {
        //reference type
        CustomerManager customerManager = new CustomerManager(); //nesnelerle çalışmak işte bu oluyor şimdi biz 'new CustomerManager();' yazdığımızda belleğin stack bölümünden heap bölümüne bir nesne açılır
        //bu yaptığım bu .Add() ve diğerleri bu nesne üzerinde çalışır ve benim elimden geldiğince az new açmam lazım çünkü new bellekte FAZLA YER KAPLAR
        CustomerManager customerManager1 = new CustomerManager();
        customerManager = customerManager1; //bu şekilde bir tanımlama yaparsam bunlar aynı nesnenin adresini referans alıp o nesne içerisinde çalışınak.
        //işte bu yüzden ilk new gereksiz oldu ve IDE bu yüzden onu soldurdu.
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        //value #şimdi yapacağımız şey value ile reference nin farkını gösterecek
        //value işlemlerde belleğin sadece stack bölümünü kullanır ama C den de biliyoruz ki dizilerde adresli işlemler oluyor.
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2); //10 #çünkü stack bölümde sadece değerler konuşur adresler değil

        //reference
        int[] sayilar1 = new int[]{1, 2, 3};
        int[] sayilar2 = {4, 5, 6}; //üstteki tanımlama ile bu aynı
        sayilar2 = sayilar1;
        sayilar1[0] = 147;
        System.out.println(sayilar2[0]); //artık heap bölümüne geçildi dizi olduğu için ve
        //stack bölümündeki sayilar 2 nin adresi sayilar1 in heaptaki adresini gösteren stack bölümündeki değeri verildi bu sayede aynı adreste oldular.


    }
}

//düzenli bir kod yazmamız gerek mesela müşterilerle ilgili kısımları buraya 'metodlar' arayıcılığı ile yazıyoruz.
/*public class CustomerManager{
}*/
//bunu bu şekilde yapmıyoruz 'src' klasörümüz vardı oraya sağ tıklayıp 'new' diyip 'Java Class' a tıkla ve oraya 'CustomerManager' yaz.

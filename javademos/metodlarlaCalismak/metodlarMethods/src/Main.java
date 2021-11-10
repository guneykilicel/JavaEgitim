public class Main {

    public static void main(String[] args) {

        sayiBulmaca();

    }

    public static void sayiBulmaca(){

        int[] sayilar = new int[]{1,2,3,4,5,6,7,8,9};
        int aranacak = 7;
        boolean ctrl = false;

        for (int sayi: sayilar){
            if (sayi == aranacak){
                ctrl = true;
            }
        }
        if (ctrl==true){
            mesajVer(aranacak);
        }
        else {
            mesajiSenVer("Dizide mevcut değil");
        }

    }
    public static void mesajVer(int aranacak){
        System.out.println("Sayı mevcut " +aranacak);
    }

    public static void mesajiSenVer(String mesaj){ // System.out.println(); yerine mesajiSenVer(); kullanabiliriz.
        System.out.println(mesaj);
    }

}

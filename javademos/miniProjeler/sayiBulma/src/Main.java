public class Main {

    public static void main(String[] args) {

        int[] sayilar = new int[]{1, 2, 3, 5, 7, 8, 9, 0};
        int aranacak = 5;
        boolean ctrl = false;

        for (int sayi : sayilar) {
            if (aranacak == sayi) {
                ctrl = true;
            }
        }
        if (ctrl == true) {
            System.out.println("Dizide mevcut");
        } else {
            System.out.println("Mevcut değil");
        }


    }
}

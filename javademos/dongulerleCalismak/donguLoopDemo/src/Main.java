public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Dongu bittikten sonra burası çalışır.");

        for (int i = 1; i <= 10; i += 2) { //2 şer 2 şer arttıracağız
            System.out.println(i);
        }
        System.out.println("Dongu bittikten sonra burası çalışır.");


        int i = 0; // i yi tanımlamıştık ancak for blokları içindi
        /* Sonsuz Döngü
        while (i<10){
            System.out.println(i);
        }
        */
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        System.out.println("While döngüsü bitti.");

    }
}

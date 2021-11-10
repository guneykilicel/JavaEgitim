public class Main {

    public static void main(String[] args) {
        double[] myList = {1.2, 3.4, 5.6, 7.8};
        double total = 0;

        //dizideki elemanları ekrana yazalım
        for (double number : myList) {
            System.out.println(number);
        }

        //dizideki elemanları toplayıp ekrana yazalım
        for (double number : myList) {
            total += number;
        }
        System.out.println("Toplam: " + total);

        //dizideki en büyük sayıyı bulup ekrana yazalım
        double max = myList[0];
        for (double number : myList) {
            if (max < number) {
                max = number;
            }
        }
        System.out.println("En buyuk sayi: "+max);
    }
}

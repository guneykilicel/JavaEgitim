public class Main {
//While içindeki şart sağlanmasa bile do sayesinde ilk adım yapılır.
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);
        System.out.println("Do-While dongusu bitti");
    }
}

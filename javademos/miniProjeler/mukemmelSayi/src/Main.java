public class Main {
// kendinden başka pozitif tüm tam bölenlerin sayısı toplamı kendisine eşit olan sayıya mükemmel sayı denir.
    // 6 mükemmel bir sayıdır 1 e 2 ye ve 3 e bölünür 1+2+3 = 6 yani mükemmel sayıdır.
    // 28 de mükemmel sayıdır. 1,2,4,7,14
    public static void main(String[] args) {

        int number= 28;
        int total = 0;
        for (int i=1; i<number; i++){
            if (number%i == 0){
                total +=i;
            }
        }

        if (number == total){
            System.out.println(number+" Mukemmel sayidir.");
        }
        else {
            System.out.println(number+" Mukemmel sayi DEGILDIR.");
        }


    }
}

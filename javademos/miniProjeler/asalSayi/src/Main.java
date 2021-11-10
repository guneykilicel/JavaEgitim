public class Main {

    public static void main(String[] args) {

        int number = 23;
        boolean ctrl = true;
        for (int i=2; i<number; i++){ //2<2 olamayacağı için döngü içerisine girmez ve 2 sayısına asal der.
            if(number%i==0){
                ctrl = false;
            }
        }
        if (number == 1){
            System.out.println("Sayı ASAL DEGILDIR.");
            return; // şimdi return yaptık çünkü bu iften sonra alttaki if çalışıp 1 e asal diyecek
            //ama biz 'return' dersek program burada peşin peşin biter.
        }
        if (number<1){
            System.out.println("Geçersiz sayı!");
        }

        if (ctrl == true){
            System.out.println(number+" sayisi ASALDIR.");
        }
        else {
            System.out.println(number+" sayisi ASAL DEGILDIR.");
        }










    }
}

public class Main {

    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator= new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();

        //abstract sınıflar new lenemez newlenirse içi doldurulmalıdır. Ama bu kötü bir kullanımdır.
        /*GameCalculator gameCalculator= new GameCalculator() {
            @Override
            public void hesapla() {

            }
        };
        Bu kötü bir kullanım.*/

        GameCalculator gameCalculator = new WomanGameCalculator();
    }
}

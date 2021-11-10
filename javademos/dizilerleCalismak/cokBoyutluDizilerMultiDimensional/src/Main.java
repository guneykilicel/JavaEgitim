public class Main {

    public static void main(String[] args) {
        String[][] sehirler = new String[3][3]; //çok boyutlu diziler bu şekilde tanımlanıyorlar
        sehirler[0][0] = "Ankara";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bolu";
        sehirler[1][0] = "Istanbul";
        sehirler[1][1] = "Izmir";
        sehirler[1][2] = "Canakkale";
        sehirler[2][0] = "Antalya";
        sehirler[2][1] = "Muğla";
        sehirler[2][2] = "Yalova";


        for (int i = 0; i <= 2; i++) {
            System.out.println("---------------------------");
            for (int j = 0; j <= 2; j++) {
                System.out.println(sehirler[i][j]);
            }
        }

    }
}

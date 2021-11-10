public class Main {
    /* YABANCI KELİMELERİN ANLAMLARI
    grade = not
     */
    //Eğer kod dağılırsa ctrl+shift+alt+L ile run dersek Intellij IDE'sinde düzenleyebiliriz.
    public static void main(String[] args) {
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Cok iyi");
                break;
            case 'B':
                System.out.println("Iyi");
                break;
            case 'C':
                System.out.println("Ortalama");
                break;
            case 'D':
                System.out.println("Gecer not (ortalamanin altinda)");
                break;
            case 'E':
                System.out.println("Kaldiniz");
                break;
            default:
                System.out.println("Hatali giris!");
                break;
        }
    }
}

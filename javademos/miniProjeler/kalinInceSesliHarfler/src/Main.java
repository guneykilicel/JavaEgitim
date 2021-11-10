public class Main {

    public static void main(String[] args) {

        char harf = 'I';

        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                //case lerin hepsi için aynı mesajı verecek
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("Ince sesli harf");

        }
    }
}

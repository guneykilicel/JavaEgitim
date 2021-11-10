public abstract class GameCalculator { //abstract yazıyoruz
    /* BU ŞEKİLDE YAZARSAK HER CLASS DA AYRI AYRI YAZMAMIZA GEREK YOK
    public void hesapla(){
        System.out.println("Puanınız: 100");
    }
     */
    public abstract void hesapla(); //bu şekilde abstract yapılıyor.
    //eğer abstract yaparsak her class kendi içinde hesapla yazmalılar.
    //zorunlu olarak tüm classlarda olmalı.

    public final void gameOver(){
        System.out.println("Oyun bitti");
    }

}

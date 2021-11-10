public class Main {

    public static void main(String[] args) {

        try {
            int[] sayilar = new int[]{1,2,3};
            System.out.println(sayilar[5]); //ArrayIndexOutOfBoundsException hatası verir.
        }/*catch (Exception exception){ //bu tüm hatalara aynı mesajı verir şuan ve biz daha spesifik yapmak için 'Exception' yerine mesela 'ArrayIndexOutOfBoundsException' yazmalıyız.
            System.out.println("Hata oluştu");
            System.out.println(exception);
        }*/catch (StringIndexOutOfBoundsException exception){
            System.out.println("StringIndexOutOfBoundsException Hatası");
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("ArrayIndexOutOfBoundsException Hatası");
        }catch (Exception exception){ //bu hataların dışında bir hata olursa mesela veri tabanına yönlendirmesi için loglayabiliriz hatayı
            System.out.println("Loglandı: "+exception);
        }
        finally {//Her zaman çalışır. Örneğin veri tabanına bağlandık ve hata oluştu
            // veri tabanına bağlandıktan sonra o bağlantıyı kapatmamız gerekir dolayısıyla o bağlantıyı
            // 'finally' ile kapatabiliriz. Aynı şey dosyalar içinde geçerli
            System.out.println("Burası her türlü çalışır.");
        }


    }
}

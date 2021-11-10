//ProductValidator: bir ürünü kaydederken bir ürünü güncellerken ürünün kurallara uygun olup olmadığını kontrol ederiz.
public class ProductValidator {
    static { // burası statik fonksiyon çalışırsa çalışır.
        System.out.println("Static yapıcı blok çalıştı.");
    }
    public ProductValidator(){ //buranın çalışması için new lenmesi gerekiyor statik çağırılınca çalışmaz.
        System.out.println("Yapıcı blok çalıştı.");
    }
    public static boolean isValid(Product product){
        if (product.price>0 && !product.name.isEmpty()){
            return true;
        } else {
            return false;
        }

    }
    public void normal(){

    }

    //inner class ana class ı C# da static yapabiliyoruz ama Java da 'inner class' ları statc yapabiliriz.
    public static class BaskaBirClass{
        public static void Sil(){

        }
    }
}

public class ProductManager {
    public void add(Product product) {
        //ProductValidator validator = new ProductValidator(); ProductValidator "statik" olursa new lemeye gerek yok.
        if (ProductValidator.isValid(product)) {
            System.out.println("Eklendi");
        } else {
            System.out.println("Urun bilgileri gecersiz.");
        }
    }
}

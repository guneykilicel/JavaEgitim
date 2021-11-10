//ürün manager de yapılan işlemler adı üstünde manager yönetim ekle, sil, güncelle

public class ProductManager {
    public void Add(Product product) {
        //JDBC kodları yazarak veri tabanına kaydedeceğiz.
        System.out.println("Ürün eklendi: " + product.name);
    }
}

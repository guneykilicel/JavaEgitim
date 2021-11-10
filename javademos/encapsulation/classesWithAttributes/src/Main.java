public class Main {

    public static void main(String[] args) {

        Product product = new Product();
        product.set_name("Laptop");
        //product.id = 1; #private yapınca kullanıcının yazması için setId tanımlaması yaptık onun yazması için de alttaki gibi kullanıyoruz.
        product.setId(1); //bu şekilde kullanıyoruz.
        product.set_description("HP Laptop");
        product.set_price(5000);
        product.set_stockAmount(3);
        product.getId(); //Product taki attributesleri private yapınca hepsi kızdı ama bu şekilde Id okunabilir

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.get_kod());

    }
}

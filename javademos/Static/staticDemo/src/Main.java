public class Main {
    //statik yapılar örneğin biz bu main i başka bir yerden çağırmaya çalışırsak
// ve orada buradaki main operasyonunu çağırmaya çalışırsak
// hiçbir şekilde new leyerek ulaşamayız. Onun yerine Main.main diye ulaşabiliriz.
    //Static yaparsak nesnemizin örneği bellekten atılmaz programımız durana kadar ama new ile kullanıldıktan sonra örneği silinir
    public static void main(String[] args) {

        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.name = "Klavye";
        product.price = 10;
        productManager.add(product);

        //DatabaseHelper.Connection.createConnection(); #bu gibi kullanımlar static
        //DatabaseHelper class ismi sonra inner class ismi sonra fonksiyon ismi


    }
}

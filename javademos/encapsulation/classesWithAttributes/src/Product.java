// ürün manager demedim çünkü ürün manager de yapılan işlemler adı üstünde manager yönetim ekle, sil, güncelle
public class Product { //ürün classı yani ürünün özellikleri olucak
    /* bu şekilde bir tanımlama yapabilirim ama fiyata -9 girseler bir sorun çıkmıyor. İşte burada kapsülleme
    kullanacağız ilk önce bunları private yapıp getter ve stter kullanacağız.
    //attribute veya field diyebiliriz alttakilere
    int id;
    String name;
    String description; //açıklama
    double price; //fiyat
    int stockAmount; //stok adedi
    */

    private int _id; // bunları '_' yaptığımda this kullanmaya gerek kalmayacak
    private String _name;
    private String _description; //açıklama
    private double _price; //fiyat
    private int _stockAmount; //stok adedi
    private String _renk;
    private String _kod;
    // biz bunları private yaptık doğal olarak main de tanımladığımız değerler kızdı çünkü private bi üstündeki süslü paranteze çalışır for, if

    //getter (getirmek)
    public int getId() { //bunu yaptığımızda sadece okuma yapabilir kullanıcı
        return _id;
    }

    //setter (setter hazır hale getirmek plaza dilinde toplantıyı düzenledik gibi)
    public void setId(int id) {
        //this.id=id; //this.id yazdığımda benim içerisinde bulunduğum class taki class
        _id = id; //this.id ye gerek kalmaması için hepsine '_' ekliyoruz daha profesyonel
    }


    //burada IDE miz yaptı nasıl yaptık bunu şu şekilde
    //aslında private vermeye falan gerek yok IDE miz kendisi yapabilir bunu
    //_price ye sağ tıkladım ben sen diğerlerine de tıklayabilirsin
    //_price sağ tık >> Refactor >> Encapsulate Fields >> karşımıza bir ekran açıldı kutucukklarını tikle ve onayla hepsi encapsüle olur.

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String _description) {
        this._description = _description;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double _price) {
        this._price = _price;
    }

    public int get_stockAmount() {
        return _stockAmount;
    }

    public void set_stockAmount(int _stockAmount) {
        this._stockAmount = _stockAmount;
    }

    public String get_renk() {
        return _renk;
    }

    public void set_renk(String _renk) {
        this._renk = _renk;
    }

    public String get_kod() { //kod kısmını yazılabilir istemiyorum o yüzden set kısmını sildim
        //return _kod;
        return this._name.substring(0,1)+_id; //kodumuzu ürünün baş harfi ve id sinin birleşimi şeklinde yaptık
    }

}

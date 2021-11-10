public class OgrenciKrediManager extends BaseKrediManager{
    //ogrenci için daha düşük faizli kredi için hesaplanın ÜZERİNE YAZDIK(overriding)
    public double hesapla(double tutar) {
        return tutar * 1.10;
        // eğer override edilmesini İSTEMİYORSAK base de public den sonda final yazmalıyız.
    }
}

public class BaseKrediManager {
    public double hesapla(double tutar){
        return tutar * 1.18;
        //eğer override edilmesini İSTEMİYORSAK final eklemeliyiz
        //public final double hesapla(double tutar){
    }
}

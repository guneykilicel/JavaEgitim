public class CustomerManager {
    private ICustomerDal customerDal;
    public CustomerManager(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }
    public void Add(){
        // iş kodları: parametre göndereceğiz buraya kontrol olarakta müşterinin adı girilmiş mi vs.

        customerDal.Add();
    }

}

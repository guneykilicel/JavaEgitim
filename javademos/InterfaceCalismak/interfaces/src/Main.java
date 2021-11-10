public class Main {
//interface ler 'class' kabul edilmiyorlar ama aynı normal classlar veya abstract class gibi referans tutabilirler.
//normal class açar gibi ilerliyoruz ama class yerine interface seçiyoruz.
    //isim verirken başına 'I' koyarsak daha anlaşılır olur interface olduğu belli olur.
    //class lar extend olur ve bir tane eklenir ama interfaceler implements olurlar ve BİRDEN FAZLA da eklenebilir MySqlCustomerDal da örneği ve kullanımı var
    public static void main(String[] args) {

        /*
        ICustomerDal customerDal = new OracleCustomersDal();
        customerDal.Add();
         */
        CustomerManager customerManager= new CustomerManager(new OracleCustomersDal());
        //customerManager.customerDal = new OracleCustomersDal();
        customerManager.Add();

    }
}

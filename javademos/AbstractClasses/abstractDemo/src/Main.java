public class Main {
//bir müşterinin veri tabanına kaydeilmesini işleyeceğiz. Ama müşterimizde mesela Oracle lisansı yok bu yüzden her alanda çalışabilen bi kod yazmamız gerek.
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new OracleDatabaseManager(); //buradan new SqlServerDatabaseManager yazıp sistemi Sql e çekebiliriz.
        customerManager.getCustomers();

    }
}

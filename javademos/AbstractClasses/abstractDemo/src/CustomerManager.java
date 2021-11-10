public class CustomerManager {
    BaseDatabaseManager databaseManager; //çok önemli
    public void getCustomers(){
        databaseManager.getData();
        //Şimdi kötü bağımlı kod şu şekilde olur örneğimizde oracle a bağımlıyız.
        /*
        OracleDatabaseManager oracleDatabaseManager= new OracleDatabaseManager();
        oracleDatabaseManager.getData();
         */



    }
}

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer(1,"Güney","Kılıçel"));
        customers.add(new Customer(2,"İrem","Ocak"));
        customers.add(new Customer(3,"Kuzey","Kılıçel"));

        //customers.remove(new Customer(1,"Güney","Kılıçel")); Bu işe yaramaz
        //Çünkü new diyoruz yeni bir şey o
        /* Bu şekilde tanımlama yapıp silebiliriz.
        Customer guney = new Customer(4,"Güney","Kuzey");
        customers.add(guney);
        customers.remove(guney);
        */


        for (Customer customer: customers){
            System.out.println(customer.firstName);
        }
    }
}

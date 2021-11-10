public class Main {

    public static void main(String[] args) {
        AccountManager manager = new AccountManager();
        System.out.println("Hesap: "+manager.getBalance()); //0
        manager.deposit(100);
        System.out.println("Hesap: "+manager.getBalance()); //100
        try {
            manager.withdrow(90);
        } catch (BalanceInsufficentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Hesap: "+manager.getBalance()); //10
        try {
            manager.withdrow(20);
        } catch (BalanceInsufficentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Hesap: "+manager.getBalance()); //-10 hesabımız - olamamalı bu yüzden
        // account manager a gidip withdrow kısmına if ile şart koyabiliriz biz throw ile yapacağız bunu.

    }
}

public class AccountManager {
    private double balance;

    public void deposit(double amount) { //para yatırma
        balance = getBalance() + amount;
    }

    public void withdrow(double amount) throws BalanceInsufficentException { //para çekme
        if(balance >=amount){
            balance = getBalance() - amount;
        }else {
            //throw new Exception("Bakiye yetersiz."); //DAHA PROFESYONEL OLMASI İÇİN KENDİ HATA KODUMUZU YAZABİLİRİZ:
            throw new BalanceInsufficentException("Bakiye yetersiz."); //BalanceInsufficent = yetersiz bakiye
        }

    }

    public double getBalance() {//hesaptaki parayı okumak için yapmamız gereken bu
        //balance a sağ tıkla >> Refactor >> Encapsulate Fields...
        return balance;
    }
}

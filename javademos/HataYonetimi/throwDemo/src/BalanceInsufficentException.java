public class BalanceInsufficentException extends Exception{
    //unutma exceptionlar bir classtaydı kendi exceptionumuzu da Exception class ına bağlıyoruz.

    String message;
    public BalanceInsufficentException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}

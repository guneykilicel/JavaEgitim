public class DatabaseLogger extends BaseLogger{
    //overriding: tüm kodlar bu 'Log' mirasını aldı ancak mesela database de 'Log' un farklı çalışmasını istiyoruz.
    public void log(String message){
        System.out.println("Logged to database: "+message);
    }
}

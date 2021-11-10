public class Main {

    public static void main(String[] args) {
        EmailLogger logger= new EmailLogger();
        logger.log("Islem tamamlandı.");

        DatabaseLogger databaseLogger = new DatabaseLogger();
        databaseLogger.log("Islem tamamlandı.");

        //BASELOGGER TÜRÜNDE DİZİLER OLUŞTURULABİLİR. tak çalıştır sistemi oldu çok pratik değişime açık
        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger()};
        for (BaseLogger logger1: loggers){
            logger1.log("Log mesajı.");
        }

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();

    }
}

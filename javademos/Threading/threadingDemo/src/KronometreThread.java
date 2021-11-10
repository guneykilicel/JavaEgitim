public class KronometreThread implements Runnable {

    private Thread thread;
    private String threadName;

    public KronometreThread(String threadName) {
        this.threadName = threadName;
        System.out.println("Oluşturuluyor: " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Çalıştırılıyor: " + threadName);

        for (int i = 0; i <= 10; i++) {
            System.out.println(threadName + " : " + i);
            try {
                Thread.sleep(1000); //çok hızlı çalışacağı için yaz 1 saniye bekle mantığı yaptık.
            } catch (InterruptedException e) {
                System.out.println("Kesildi: " + threadName);
            }
        }
        System.out.println("Thread bitti: " + threadName);

    }

    public void start() {
        System.out.println("Thread nesnesi oluşuyor");
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }

}

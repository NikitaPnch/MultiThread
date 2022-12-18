public class Starter extends Thread {
    private final int period;
    private int seconds = 0;

    public Starter(int period) {
        this.period = period;
    }


    public int getSeconds() {
        return seconds;
    }


    @Override
    public void run() {
        while (true) {
            try {
                sleep(period * 1000L);
                synchronized (this) {
                    seconds++;
                    this.notifyAll();
                }
            } catch (InterruptedException e) {
                System.out.println("Starter InterruptedException");
                e.printStackTrace();
            }
        }
    }
}
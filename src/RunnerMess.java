public class RunnerMess extends Thread {
    private final Starter timer;


    public RunnerMess(Starter timer) {
        this.timer = timer;
    }


    @Override
    public void run() {
        while (true) {
            synchronized (timer) {
                try {
                    timer.wait();
                } catch (InterruptedException e) {
                    System.out.println("RunnerMess InterruptedException");
                    e.printStackTrace();
                }
                System.out.println(timer.getSeconds());

            }
        }
    }
}
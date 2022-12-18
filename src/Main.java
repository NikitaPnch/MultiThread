public class Main {
    public static void main(String[] args) {
        Starter starter = new Starter(1);
        RunnerMess runnerMess = new RunnerMess(starter);

        starter.start();
        runnerMess.start();
    }
}
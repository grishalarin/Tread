package Work;

public class MyTread2 extends Thread {

    Timer timer;

    public MyTread2(Timer timer) {
        this.timer = timer;
    }

    @Override
    public void run() {

        while (!isInterrupted()) {
            synchronized (timer) {
                try {
                    timer.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if(timer.getTimer() % 3 == 0)System.out.println("3 sec");
        }
    }
}

package Work;


public class MyTread3 extends Thread {

    Timer timer;

    public MyTread3(Timer timer) {
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
            if(timer.getTimer() % 5 == 0)System.out.println("5 sec");
        }
    }
}
    /*while(Thread.CurrentTread().isInterrupted()) проверка*/

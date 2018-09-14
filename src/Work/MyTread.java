package Work;

public class MyTread extends Thread {


    Timer timer;


    public MyTread(Timer timer) {
        this.timer = timer;
    }
    //процент и делитель =число нацело

    @Override
    public void run() {
        while(!isInterrupted()){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            synchronized (timer){
                timer.incTimer();
                timer.notifyAll();
            }
        }

    }
}

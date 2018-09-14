package Work;

public class Main {
    public static void main(String[] args) {

        Timer timer = new Timer();

        MyTread myTread1 = new MyTread(timer);
        MyTread2 myTread2 = new MyTread2(timer);
        MyTread3 myTread3 = new MyTread3(timer);

        myTread1.start();
        myTread2.start();
        myTread3.start();

    }
}

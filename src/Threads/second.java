package Threads;

public class second implements Runnable {
    public static void main(String[] args) {
        Main object = new Main();
        Thread thread = new Thread(object);
        thread.start();
        System.out.println("This code is outside of the thread");
    }

    public void run(){
        System.out.println("This code is running in a thread");
    }
}

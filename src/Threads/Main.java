package Threads;

public class Main extends Thread {
    public static int amount = 0;
    public static void main(String[] args) {
        Main thread = new Main();
        thread.start();

        //wait for thread to finish
        while (thread.isAlive()) {
            System.out.println("bentar..");            
        }

        System.out.println(amount);
        amount++;
        System.out.println(amount);
        // System.out.println("this code is outside thread");
    }
    public void run(){
        // System.out.println("this code is running in a thread");
        amount++;
    }

}

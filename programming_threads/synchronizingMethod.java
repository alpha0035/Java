package programming_threads;

import java.util.concurrent.ScheduledThreadPoolExecutor;

// Synchronized methods are used to prevent other methods call them whenever they are not acomplish
public class synchronizingMethod {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor pool= new ScheduledThreadPoolExecutor(2);
        CountDownClockSync clk= new CountDownClockSync(20);
        pool.execute(clk);
        pool.execute(clk);
    }
}
class CountDownClockSync implements Runnable{
    private int start;
    public CountDownClockSync(int x){start=x;}
    public synchronized void run(){
        for(int i= start; i>=0; i--){
            System.out.println("T minus "+i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}

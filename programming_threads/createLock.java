package programming_threads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;

public class createLock {
    public static void main(String[] args) {
        CountDownClockLock clk= new CountDownClockLock(20);
        ScheduledThreadPoolExecutor pool= new ScheduledThreadPoolExecutor(2);
        pool.execute(clk);
        pool.execute(clk);
        pool.shutdown();
    }
}
class CountDownClockLock extends Thread 
    implements Runnable
{
    ReentrantLock lock= new ReentrantLock();
    private int start;
    public CountDownClockLock(int x){start=x;}
    public void run(){
        // whenever one thread access this lock, it will prevent any other thread to access 
        // then other thread must wait until accessing thread catch unlock
        lock.lock();
        for(int i= start; i>=0; i--){
            System.out.println("T minus "+i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        lock.unlock();
    }
}

package programming_threads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class usingExecutor {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor pool= new ScheduledThreadPoolExecutor(25);
        for (int i = 20; i >= 0; i--) {
            pool.schedule(new newCountDownClock(i), 20-i, TimeUnit.SECONDS);
        }
        pool.schedule(new newLaunchEvent("Alpha"), 5, TimeUnit.SECONDS);
        pool.schedule(new newLaunchEvent("Beta"), 10, TimeUnit.SECONDS);
        pool.schedule(new newLaunchEvent("Gamma"), 15, TimeUnit.SECONDS);
        pool.shutdown();
    }
}
class newCountDownClock implements Runnable{
    private int t;
    public newCountDownClock(int t){
        this.t=t;
    }
    public void run(){
        System.out.println("T minus "+t);
    }

}
class newLaunchEvent implements Runnable{
    private String mess;
    public newLaunchEvent(String s){mess=s;}
    public void run(){
        System.out.println(mess);
    }
}

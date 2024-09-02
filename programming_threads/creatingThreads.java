package programming_threads;

public class creatingThreads {
    public static void main(String[] args) {
        Thread clk= new CountDownClock();
        clk.start();
    }
}

class CountDownClock extends Thread{
    public void run(){
        for (int i = 20; i > -1; i--) {
            System.out.println("T minus "+ i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){}
        }
    }
}
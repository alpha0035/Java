package programming_threads;

public class runableInterface {
    public static void main(String[] args) {
        Thread clk= new CountDownClock();
        Runnable alp, bta, gma;
        alp =new LaunchEvent(15, "Alpha");
        bta= new LaunchEvent(10, "Beta");
        gma= new LaunchEvent(5, "Gamma");
        clk.start();
        new Thread(alp).start();
        new Thread(bta).start();
        new Thread(gma).start();
    }
}
/*1. Create a class implements Runable interface
 * 2. Provide run method
 * 3. Create an instance of Thread class and pass Runable obj to its constructor
 * 4.Call start method
 */
class LaunchEvent implements Runnable{
    private int start;
    private String mess;
    public LaunchEvent(int x, String mes){
        start= x;
        mess= mes;
    }
    public void run(){
        try {
            Thread.sleep(20000-start*1000);
        } catch (Exception e) {}
        System.out.println(mess);
    }
}
package abstract_classes_interfaces;

public class defaultMethod {
    public static void main(String[] args) {
        Play1 obj= new Play1();
        obj.play();
        obj.quit();   
        Play2 ob= new Play2();
        ob.play();
        ob.quit();
    }
}

interface Playable{
    void play();
    default void quit(){System.out.println("Good Bye!");}
    // default method will be use if you don't provide implement for the method
}

class Play1 implements Playable{
    public void play(){
        System.out.println("Welcome!");
    }
    public void quit(){
        System.out.println("You lose!");
    }
}

class Play2 implements Playable{
    public void play(){System.out.println("Welcome");}
}
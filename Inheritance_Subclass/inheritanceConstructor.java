package Inheritance_Subclass;

public class inheritanceConstructor {
    public static void main(final String[] args) {
        final BaseBall obj= new BaseBall();
    }
}
class Ball{
    public Ball(){
        System.out.println("this is constructor from Ball class.");
    }
}
class BaseBall extends Ball{
    public BaseBall(){
        System.out.println("this is constructor from BaseBall class.");
    }
}
package working_with_numbers_expressions;

public class useFinally {
    public static void main(String[] args) {
        int x=3, y=0, z;
        try{
            z=3/0;
        }
        catch(ArithmeticException e){
            System.out.println("You catch exception!");
        }
        finally{
            // this block will be always excuted
            System.out.println("Redo again");
        }
    }
}

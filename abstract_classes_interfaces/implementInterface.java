package abstract_classes_interfaces;


public class implementInterface {

    public static void main(String[] args) {
        // an interface can be used as data type as class 
        // get() method return an object of a class implements interfaces
        interfaces itf= get();
        if(itf instanceof One) System.out.println("Of One class");
        else if(itf instanceof Two) System.out.println("Of Two class");
    }
    public static One get(){
        Two obj = new Two();
        obj.setX(22);
        return obj;
    }
}
class One implements interfaces{
    private static int turn;
    public One(){System.out.println("One's obj");}
    public void play(){
        turn= 1;
    }
    public int getScore(String name){
        return turn;
    }
}
class Two extends One
    implements interfaces
    {
        private int x;
        
        public Two(){System.out.println("Two's obj");}
        public void play(){
            System.out.println("Start game now");
        }

        public int getScore(String name) {
            return x;
        }
        public void setX(int x) {
            this.x = x;
        }
        
    }
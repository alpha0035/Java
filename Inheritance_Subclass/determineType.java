public class determineType {
    public static void main(String[] args) {
        Alpha obj= new Beta();
        if(obj instanceof Beta){
            System.out.println("true");
        }else System.out.println("false");
    }
}
class Alpha{
    private int a;
    public Alpha(){System.out.println("Alpha class.");}
}
class Beta extends Alpha{
    private int b;  
    public Beta(){System.out.println("Beta class.");}
}
class Gamma extends Alpha{
    private int g;
    public Gamma(){System.out.println("Gamma class.");}
}
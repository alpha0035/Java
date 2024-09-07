package object_and_class;
// by default, toString() method return a String contain class name and hash code
public class toStringMethod {
    public static void main(String[] args) {
        Beta bta= new Beta("Beta");
        System.out.println(bta.toString());
        // It turns out that you needn't to use toString method in this example because println method auto call toString
        System.out.println(bta);
        System.out.println(new Gamma());
    }
}
class Beta{
    private String str;
    public Beta(String str){
        this.str= str;
    }
    public String getStr() {
        return str;
    }
}
class Gamma{
    // you can also override toString method
    // @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Greeting from "+ this.getClass().getName();
    }

}
package object_and_class;

public class equalsMethod {
    public static void main(String[] args) {
        Beta bta1= new Beta("Beta");
        Beta bta2= new Beta("Beta");
        // == operator just compare their references, not the data contain by the object.
        if(bta1==bta2) System.out.println("They are the same.");
        else System.out.println("They are not the same.");
        if(bta1.getStr().equals(bta2.getStr())) System.out.println("The data are the same");
        else System.out.println("The data are different");

        Lambda ob1= new Lambda("Hello", "Lambda");
        if(ob1.equals(new Lambda("Hello", "Lambda"))) System.out.println("They are the same");
        else System.out.println("They are different");
    }
}
/*To compare the data each obj contain, you have to override equals method and use it */
// a basic problem is that the parameter type must be Object
class Lambda{
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if(obj== null) return false;
        if(this== obj) return true;
        if(this.getFirst().equals(((Lambda)obj).getFirst()) 
            && this.getLast().equals(((Lambda) obj).getLast())){
            return true;
        }else return false;

    }
    private String first, last;
    public Lambda(String first, String last) {
        this.first = first;
        this.last = last;
    }
    public String getFirst() {
        return first;
    }
    public String getLast() {
        return last;
    }
    
}


package object_and_class;

public class cloneMethod {
    public static void main(String[] args) {
        Clone1 obj1= new Clone1("Leo", "Mark", 3);
        Clone1 obj2= (Clone1) obj1.clone();
        obj2.setFirst("Kevin");
        System.out.println(obj1);
        System.out.println(obj2);

        Clone2 ob1= new Clone2("James", "Smith");
        ob1.setPoint(8);
        Clone2 ob2=(Clone2) ob1.clone();
        ob2.setPoint(3);
        System.out.println(ob1);
        System.out.println(ob2);

        Clone3 o1= new Clone3("A", 13);
        o1.setStudent(ob1);
        Clone3 o2=(Clone3) o1.clone();
        o2.setStudent(ob2);;
        System.out.println(o1);
        System.out.println(o2);
    }
}

//Basic cloning
class Clone1{
    private String first, last;
    private int point;
    public Clone1(String first, String last, int point) {
        this.first = first;
        this.last = last;
        this.point = point;
    }

    @Override
    protected Object clone(){
        // TODO Auto-generated method stub
        Clone1 tmp= new Clone1(this.first, this.last, this.point);
        return tmp;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Clone1 [" +this.first+" "+this.last+" "+this.point+"]";
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}

//create shallow copy
class Clone2 implements Cloneable
{
    private String first, last;
    private int point;
    public Clone2(String first, String last) {
        this.first = first;
        this.last = last;
    }

    // we can create shallow copy by using clone method from Object class and implement Cloneable interface
    // this must catch CloneNotSupportedException exception.
    @Override
    public Object clone(){
        Clone2 tmp;
        try {
            tmp= (Clone2) super.clone();
        } catch (CloneNotSupportedException e) {
            // TODO: handle exception
            return null;
        }
        return tmp;
    }

    @Override
    public String toString() {
        return "Clone2 [" + first + " " + last + " " + point + "]";
    }

    public void setPoint(int point) {
        this.point = point;
    }
}

// deep clone
// Because the clone method just copy either primative types or String, so if your class field contain other sub-objects
// it has reference to the same address obj as original
// So to copy these you first call clone method to the obj then call clone method to sub-objs.
class Clone3 implements Cloneable
{
    private String type;
    private int age;
    private Clone2 student;
    public Clone3(String type, int age) {
        this.type = type;
        this.age = age;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setStudent(Clone2 student) {
        this.student = student;
    }

    @Override
    public Object clone(){
        // TODO Auto-generated method stub
        Clone3 tmp;
        try{
            tmp= (Clone3) super.clone();
            tmp.student= (Clone2) student.clone();
        }catch(CloneNotSupportedException e){
            return null;
        }
        return tmp;
    }
    @Override
    public String toString() {
        return "Clone3 [" + type + " " + age + " " + student + "]";
    }    
    
}

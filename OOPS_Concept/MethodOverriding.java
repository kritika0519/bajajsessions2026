//overriding involves inheritance
//JVM will bind the method call ont he runtime object, not on reference type
//True Polymorphism
class Parent{
    public void property() {
        System.out.println("land+cash+gold");
    }
    public void marry(){
        System.out.println("Relative girl only");
    }
}

class Child extends Parent{
    //overriding
    public void marry(){
        System.out.println("Some other  girl...");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        //parent object
        Parent p1=new Parent();
        p1.property();
        p1.marry();
        System.out.println();

        //child object
        Child c1=new Child();
        c1.property();
        c1.marry();
        System.out.println();

        //child object
        Parent p2=new Child();
        p2.property();
        p2.marry();
    }
}

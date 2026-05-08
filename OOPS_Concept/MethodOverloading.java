//method overloading : same method name but different parameters
//compliler is binding the job
//JVM should just execute the method body
//early binding, static binding, eager binding
// only have complile time error in method overloading
class Calculator {

    public void add(int a, int b) {
        System.out.println("int-int");
    }

    public void add(double a, double b) {
        System.out.println("double-double");
    }

    public void add(long a, long b) {
        System.out.println("long-long");
    }
    //var-args ==> can be use as array in method overloading
    public void add(int... args){
        int sum=0;
        for(int ele:args){
            sum+=ele;
        }
        System.out.println(sum);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(10, 20);
        c.add(10.2, 20);
        c.add(1234567890L, 1234567890L);
        c.add(1,2,3,4,5,6,7,8,9);
    }
}

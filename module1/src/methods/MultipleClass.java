package methods;
import java.util.Scanner;

class MultipleClass {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int a=3,b=67;
        calc.getInput();
        calc.add();
        calc.sub(a,b);
        int mul=calc.multiply(a,b);
        System.out.println("multiplication is: "+mul);
    }
}

class Calculator {
    Scanner sc = new Scanner(System.in);
    int a, b, res;

    void getInput() {
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
    }

    void add() {
        res = a + b;
        System.out.println("Sum: " + res);
    }

    void sub(int x,int y){
        res =  x- y;
        System.out.println("Difference: " + res);
    }

    int multiply(int x,int y){
        res=x*y;
        return res;
    }
}

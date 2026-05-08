class Person { // base class / parent class
    public String name;
    public String address;
    public int age;

}

// extend keyword means student class will take data from person class
class Student extends Person { // Derived class / child class
    public int marks;
    public String grade;
    //Contructor
    Student(String name, String address, int age, int marks, String grade) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.marks = marks;
        this.grade = grade;

    }

    public void disp() {
        System.out.println("name is: " + name);
        System.out.println("age is: " + age);
        System.out.println("address is: " + address);
        System.out.println("marks is: " + marks);
        System.out.println("grade is: " + grade);
    }
}

public class Inherit01 {
    public static void main(String[] args) {
        Student s1=  new Student("kartikeya", "Ambala",19,91,"A+");
        s1.disp();

    }
}

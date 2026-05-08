// Interface defining common behaviors
interface AnimalActions {
    void eat();
    void sleep();
    void makeSound();
}

// Abstract class representing an Animal
abstract class Animal implements AnimalActions {
    private String name;
    private int age;
    protected Leg leg; // Composition (HAS-A Relationship)

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.leg = new Leg(); // Animal HAS-A Leg
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { 
        if (age > 0) {
            this.age = age; 
        } else {
            System.out.println("Age must be positive!");
        }
    }

    // Common behaviors implemented
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    // Abstract method for unique sounds
    public abstract void makeSound();
}

// Concrete class for Dog, inheriting Animal
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " barks: Woof woof!");
    }
}

// Concrete class for Cat, inheriting Animal
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " meows: Meow meow!");
    }
}

// Concrete class for Bird, inheriting Animal
class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " chirps: Tweet tweet!");
    }
}

// Composition Example: Leg Class
class Leg {
    public void move() {
        System.out.println("Leg is moving...");
    }
}

// Main class to run the program
public class AnimalManagementSystem {
    public static void main(String[] args) {
        // Creating different animals
        Animal dog = new Dog("Buddy", 5);
        Animal cat = new Cat("Whiskers", 3);
        Animal bird = new Bird("Sunny", 2);

        // Display behaviors
        displayAnimalInfo(dog);
        displayAnimalInfo(cat);
        displayAnimalInfo(bird);
    }

    // Method to display animal actions
    public static void displayAnimalInfo(Animal animal) {
        System.out.println("\nAnimal: " + animal.getName());
        System.out.println("Age: " + animal.getAge());
        animal.eat();
        animal.sleep();
        animal.makeSound();
        animal.leg.move(); // Using composition feature
    }
}
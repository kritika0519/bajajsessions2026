class Plane{
    public void takeoff(){
        System.out.println("Plane Takeoff...");
    }
    public void fly(){
        System.out.println("plane flying...");
    }
    public void land(){
        System.out.println("plane landing....");
    }
}

class PassengerPlane extends Plane{
    public void takeoff(){
        System.out.println("Passenger-Plane Takeoff...");
    }
    public void fly(){
        System.out.println("Passenger-plane flying...");
    }
    public void land(){
        System.out.println("Passenger-plane landing....");
    }
}

class CargoPlane extends Plane{
    public void takeoff(){
        System.out.println("cargo-Plane Takeoff...");
    }
    public void fly(){
        System.out.println("cargo-plane flying...");
    }
    public void land(){
        System.out.println("cargo-plane landing....");
    }
}

class FighterPlane extends Plane{
    public void takeoff(){
        System.out.println("Fighter-Plane Takeoff...");
    }
    public void fly(){
        System.out.println("Fighter-plane flying...");
    }
    public void land(){
        System.out.println("Fighter-plane landing....");
    }
}

class Airport{
    public void allowPlane(Plane p){
        p.takeoff();;
        p.fly();
        p.land();
        System.out.println();
    }
}

public class Planeoverring {
    public static void main(String[] args) {

        PassengerPlane p=new PassengerPlane();
        CargoPlane c=new CargoPlane(); 
        FighterPlane f=new FighterPlane();
       
        Airport a=new Airport();
        a.allowPlane(p);
        a.allowPlane(c);
        a.allowPlane(f);
    }
}

class vehicle
{
    public String vehicleno;
    String Engineno;
    double cost;
    String brand;
    String vehicletype;

    void Milage() {
        System.out.println("Vehicle");
    }
}

class Car extends vehicle
{
    Boolean AC = true ;

    public void drift() {
        System.out.println("car");
    }
}

class Bike extends Car
{
    public void ride() {
        System.out.println("bike");
    }
}


public class Java03 {
    public static void main(String[] args) {
        Car car = new Car();
        car.Milage();
        car.drift();

        Bike bike = new Bike();
        bike.AC= false;
        bike.Milage();
        bike.ride();
        bike.drift();
    }
}
package Session08_OOP.Exercise02;

public class Bike extends Vehicle {
    public Bike(String name, int speed){
        super(name, speed); // gọi constructor lớp cha
    }
//    Ghi đè phương thức

    @Override
    public void displayInfo() {
        System.out.println("Bike Name: " + getName() + "Speed: " + getSpeed() + " km/h");
    }
}

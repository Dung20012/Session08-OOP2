package Session08_OOP.Exercise02;

public class Car extends Vehicle {
    public Car(String name, int speed){
        super(name, speed); // gọi constructor lớp cha
    }
//    Ghi đ phương thức

    @Override
    public void displayInfo() {
        System.out.println("CarName: " + getName() + " Speed: " + getSpeed() + " km/h");
    }
}

package Session08_OOP.Exercise02;

public abstract class Vehicle {
//    Triển khai lớp trừu tượng đơn giản
//    các thành phần lớp bth
    private String name;
    private int speed;

//    Constructor mặc định
    public Vehicle(){
    }

//    Constructor tham số
    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

//    Getter và Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

//    Phương thức trừu tượng
    public abstract void displayInfo();
//    Phương thức thông thường
    public void start(){
        System.out.println("Vehicle is starting...");
    }
}

package Session08_OOP.Exercise01;

public class Cat extends Animals{
    private String furColor;

//    Constructor
    public Cat(String name, int age, String furColor){
        super(name, age); // gọi constructor lớp cha
        this.furColor = furColor;
    }
//    Ghi đè phương thức makeSound

    @Override
    public String makeSound() {
        return "Meo Meo";
    }
//    Ghi đè phương thức displayInfo

    @Override
    public void displayInfo() {
        super.displayInfo(); // gọi phương thức displayInfo lớp cha (Animals)
        System.out.println("Màu lông: " + furColor);
    }
}

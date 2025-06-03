package Session08_OOP.Exercise01;

public class Dog extends Animals{
    private String breed;

//    Constructor
    public Dog(String name, int age, String breed){
        super(name, age); // constructor lớp cha
        this.breed = breed;
    }

//    Ghi đè phương thức makeSound

    @Override
    public String makeSound() {
        return "Gâu Gâu";
    }
//    Ghi đè phương thức displayInfo

    @Override
    public void displayInfo() {
        super.displayInfo(); // gọi method displayInfo lớp cha
        System.out.println("Giống chó: " + breed);
    }
}

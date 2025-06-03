package Session08_OOP.Exercise01;

public class Animals {
    String name;
    int age;

//    Constructor
    public Animals(String name, int age){
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("Tên không được để trống");
        }
        if (age < 0){
            throw new IllegalArgumentException("Tuổi không được âm");
        }
        this.name = name;
        this.age = age;
    }

//    getter và setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    phương thức hiển thị thông tin chung
    public void displayInfo(){
        System.out.println("Tên: " + name + " Tuổi: " + age);
    }

//    phương thức âm thanh
    public String makeSound(){
        return "Some generic sound";
    }
}

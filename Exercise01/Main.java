package Session08_OOP.Exercise01;

public class Main {
    public static void main(String[] args) {
//        Tạo mảng lưu động vật
        Animals[] animalsArray = new Animals[2];

//        Tạo đối tượng dog và cat
        Dog dog1 = new Dog("Buddy", 3, "Golden Retriever");
        Cat cat1 = new Cat("Whiskers", 2, "Ghi");

//        Thêm vào mảng
        animalsArray[0] = dog1;
        animalsArray[1] = cat1;

//        Hiển thị tt và âm thanh của từng đối tượng
        for (Animals animals : animalsArray){
            animals.displayInfo();
            System.out.println("Âm thanh: " +animals.makeSound());
            System.out.println();
        }
    }
}

package Session08_OOP.Exercise05;

public class Category {
    private int id;
    private String name;
    private String description;

//    Constructor k tham số
    public Category(){
    }
//    Constructor tham số

    public Category(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
//    Getter và Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    Hiển thị thông tin category
    public void display(){
        System.out.printf("ID: %d, Name: %s, Description: %s\n", id, name,description);
    }
}

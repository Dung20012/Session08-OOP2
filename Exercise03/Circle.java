package Session08_OOP.Exercise03;

public class Circle implements Colorable {
    private double radius;
    private String color;

//    Constructor
    public Circle(double radius) {
        this.radius = radius;
    }
//    Ghi đè phương thức

    @Override
    public void setColor(String color) {
        this.color = color;
    }
//    Getter setter

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
}

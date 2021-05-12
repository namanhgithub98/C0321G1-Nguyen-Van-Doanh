package bai5_access_modifier.bai_tap;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "Red";
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return (radius * radius * Math.PI);
    }

    public String getColor() {
        return color;
    }
}

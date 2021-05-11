package bai6_inheritance.bai_tap.Cirle_and_Cylinder;

import java.util.concurrent.Callable;

public class Circle {
    private double radius;
    private String color;

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return (radius * radius * Math.PI);
    }

    @Override
    public String toString() {
        return "A Circle with color of "
                + getColor()
                + ", Radius is: "
                + getRadius()
                + ", And Area is: "
                +getArea();
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2, "green");
        System.out.print(circle);

        }
}


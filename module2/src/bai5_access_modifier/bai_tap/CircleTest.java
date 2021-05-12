package bai5_access_modifier.bai_tap;

import java.util.concurrent.Callable;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Radius is: " + circle.getRadius()
                + "Area is: " + circle.getArea()
                + "and color is: " + circle.getColor());


        Circle circle1 = new Circle(2, "Green");
        System.out.println("Radius is: " + circle1.getRadius()
                + " Area is: " + circle1.getArea()
                + " and Color is: " + circle1.getColor());
    }
}

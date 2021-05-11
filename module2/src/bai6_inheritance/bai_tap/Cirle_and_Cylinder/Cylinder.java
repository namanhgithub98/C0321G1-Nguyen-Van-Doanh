package bai6_inheritance.bai_tap.Cirle_and_Cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    private Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return (height * Math.PI * getRadius() * getRadius());
    }

    @Override
    public String toString() {
        return  "A Cylinder with height="
                + getHeight()
                + ", and Volume is: "
                + getVolume()
                + ", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2, "Yellow", 6);
        System.out.println(cylinder);
    }
}

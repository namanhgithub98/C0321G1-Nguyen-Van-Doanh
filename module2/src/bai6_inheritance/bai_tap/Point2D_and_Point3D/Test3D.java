package bai6_inheritance.bai_tap.Point2D_and_Point3D;

public class Test3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D.toString());
        point3D.setXYZ(2,3,4);
        System.out.println(point3D.toString());
    }
}

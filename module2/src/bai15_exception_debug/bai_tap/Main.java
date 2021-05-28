package bai15_exception_debug.bai_tap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalTriangleException {
        int a; int b; int c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh a: ");
        a = scanner.nextInt();
        System.out.println("Nhập cạnh b: ");
        b = scanner.nextInt();
        System.out.println("Nhập cạnh c: ");
        c = scanner.nextInt();

        Triangle testTriangle = new Triangle(a,b,c) ;
        System.out.println(testTriangle);

    }
}

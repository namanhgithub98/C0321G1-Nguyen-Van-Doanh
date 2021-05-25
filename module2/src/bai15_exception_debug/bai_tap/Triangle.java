package bai15_exception_debug.bai_tap;

import java.util.Scanner;

public class Triangle {

    public Triangle(
        int a, int b, int c) throws IllegalTriangleException {


            if (a <= 0 || b <= 0 || c <= 0) {
                System.out.println("Lỗi!!! Các cạnh tam giác không thể âm, Mời nhập lại: ");
            }
            if (a + b < c || a + c < b || b + c < a) {
                System.out.println("Ngoại lệ");
            } else {
                System.out.println("Đây là tam giác");
            }
        }
}

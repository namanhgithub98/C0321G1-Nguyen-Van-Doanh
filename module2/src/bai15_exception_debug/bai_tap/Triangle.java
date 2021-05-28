package bai15_exception_debug.bai_tap;

import java.util.Scanner;

public class Triangle {
    int a;
    int b;
    int c;

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public Triangle(int a, int b, int c) throws IllegalTriangleException {

//            if (a <= 0 || b <= 0 || c <= 0) {
//                System.out.println("Lỗi!!! Các cạnh tam giác không thể âm, Mời nhập lại: ");
//            }
//            if (a + b < c || a + c < b || b + c < a) {
//                System.out.println("Ngoại lệ");
//            } else {
//                System.out.println("Đây là tam giác");
//            }
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("Lỗi!!! Các cạnh tam giác không thể âm, Mời nhập lại:");
        } else if (a + b < c || a + c < b || b + c < a) {
            throw new IllegalTriangleException("Ngoại lệ!!! Tổng 2 cạnh phải lớn hơn cạnh còn lại");
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }


    }
}

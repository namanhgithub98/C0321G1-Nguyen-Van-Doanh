package bai1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount USD: ");
        usd = sc.nextDouble();
        double exchange = usd * 23000;
        System.out.print("Into money VNĐ: " + exchange );
    }
}

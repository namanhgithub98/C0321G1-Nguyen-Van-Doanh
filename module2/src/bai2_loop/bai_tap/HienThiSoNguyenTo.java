package bai2_loop.bai_tap;

import java.util.Scanner;

public class HienThiSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số lượng số nguyên tố cần hiển thị: ");
        int num = sc.nextInt();
        int count = 0;
        int temp = 2;

        while (count < num) {
            int i;
            for (i = 2; i <= Math.sqrt(temp); i++) {
                if (temp%i == 0) {
                    break;
                }
            }
            if (i > Math.sqrt(temp)) {
                System.out.println(temp+ "là số nguyên tố");
                count++;
            }
            temp++;
        }
    }
}

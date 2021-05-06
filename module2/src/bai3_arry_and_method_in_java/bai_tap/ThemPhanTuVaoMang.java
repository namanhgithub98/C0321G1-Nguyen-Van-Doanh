package bai3_arry_and_method_in_java.bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 0, 9};
        int[] newarr = new int[arr.length + 1];
        Boolean check = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần thêm vào mảng: ");
        int num = scanner.nextInt();
        int index;
        System.out.println("Vị trí cần nhập trong mảng: ");
        index = scanner.nextInt();
        if (index >= 1 && index <= arr.length - 1) {
            for (int i = 0; i < newarr.length; i++) {
                if (i != index && !check) {
                    check = false;
                    newarr[i] = arr[i];
                } else if (i == index) {
                    newarr[i] = num;
                    check = true;
                } else if (check) {
                    newarr[i] = arr[i - 1];
                }
            }
            for (int i = 0; i < newarr.length; i++) {
                System.out.print(newarr[i] + "\t");
            }
        } else {
            System.out.println("Không chèn thêm" + num + "vào mảng được");
        }
    }
}

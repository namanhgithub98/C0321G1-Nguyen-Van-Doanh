package bai3_arry_and_method_in_java.bai_tap;

import java.util.Scanner;

public class XoaPhanTuTrongMang {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 0, 9};
        System.out.println("Nhập vào phần tử muốn xóa: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                check = true;
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0;
            }
        }
        if (check) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
        } else {
            System.out.println("Không có số muốn xóa trong mảng");
        }

    }
}

package bai3_arry_and_method_in_java.bai_tap;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước của mảng: ");
        int size;
        int[] array;
        size = scanner.nextInt();
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập phần tử" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Mảng vừa nhập là: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int min = array[0];
        for (int j = 0; j < array.length; j++) {
            if (min > array[j]) {
                min = array[j];
            }
        }
        System.out.print("\n Phần tử nhỏ nhất trong mảng là: " + min);
    }
}





package bai3_arry_and_method_in_java.bai_tap;

import java.util.Scanner;

public class TimPhanTuLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int x, y;
//        System.out.println("Nhập vào số mảng 1 chiều: ");
//        x = scanner.nextInt();
//        System.out.println("Nhập vào số phần tử của 1 mảng 1 chiều: ");
//        y = scanner.nextInt();
//
//        int[][] arr = new int[x][y];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print("Nhập vào giá trị phần tử thứ " + j + " của mảng thứ " + i+" ");
//                arr[i][j] = scanner.nextInt();
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + "\t");
//            }
//            System.out.println(" ");
//        }
//        int max = arr[0][0];
//        int index1 = 0, index2 = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] > max) {
//                    max = arr[i][j];
//                    index1 = i;
//                    index2 = j;
//                }
//            }
//        }
//        System.out.println("Số lớn nhất là: " + max + " ở vị trí " + index2 + " của mảng thứ " +index1);
//    }
        int soDong;
        int soCot;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của mảng: ");
        soDong = scanner.nextInt();
        System.out.println("Nhập vào số cột của mảng: ");
        soCot = scanner.nextInt();
        int[][] arr = new int[soDong][soCot];
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.println("Nhập phần tử thứ [" + i + " , " + j + " ]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int max = arr[0][0];
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
    }
}

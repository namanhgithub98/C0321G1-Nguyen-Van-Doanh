package bai13_thuat_toan_tim_kiem.thuc_hanh;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Test_LinerSearch {
//    public static int linearSearch(int[] array, int value) {
//        int index = -1;
//
//        for (int i = 0; i < array.length; i++) {
//            if (value == array[i]){
//                index = i;
//                break;
//            }
//        }
//        return index;
//    }


//    Tìm ra vị trí của số nguyên nhập từ bàn phím

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[100];
        System.out.println("Enter how many elements..");
        int n;
        n = sc.nextInt();
        System.out.println("Enter " +n+ "values...");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the search values : ");
        int src=sc.nextInt();
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] == src) {
                System.out.println(src+ "is found & the position is :" +(i+1));
                break;
            }
        }
        if (i == n) {
            System.out.println(src+ "not found");
        }
    }
}

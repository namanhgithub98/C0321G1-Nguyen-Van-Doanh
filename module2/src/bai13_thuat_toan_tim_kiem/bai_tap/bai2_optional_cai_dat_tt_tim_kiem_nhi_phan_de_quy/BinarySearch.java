package bai13_thuat_toan_tim_kiem.bai_tap.bai2_optional_cai_dat_tt_tim_kiem_nhi_phan_de_quy;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        int[] list = {-5, 5, 7, 9, 11, 12};
        int  index = 0;
//        insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + "");
        }
        index = binarySearch(list, 0, list.length -1 , -5);
        System.out.println("Vị trí trong mảng: " +index);

    }

    public static int binarySearch(int[] array, int left, int right ,int value) {
        int middle = (left + right) / 2;
        if (right >= left) {
            if (array[middle] == value) {
                return middle;
            } else if (array[middle] > value) {
                return binarySearch(array, left, middle - 1, value);
            } else {
                return binarySearch(array, middle + 1, right, value);
            }
        } else {
            return -1;
        }
    }
}

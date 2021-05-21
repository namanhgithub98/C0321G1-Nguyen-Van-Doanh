package bai14_thuat_toan_sap_xep.bai_tap.bai2_setting_intertionSort;

import java.util.List;

public class IntertionSort {
    static int[] list = {7, 5, 22, -5, 9, 14};

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
        insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + "");
        }
    }
}
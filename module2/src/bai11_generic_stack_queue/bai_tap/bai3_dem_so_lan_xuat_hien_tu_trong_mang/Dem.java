package bai11_generic_stack_queue.bai_tap.bai3_dem_so_lan_xuat_hien_tu_trong_mang;


import com.sun.xml.internal.fastinfoset.util.StringArray;
import sun.reflect.generics.tree.Tree;

import java.util.Arrays;
import java.util.TreeMap;

public class Dem {
    public static void main(String[] args) {
        String string = "Tôi đến trường bằng xe máy" + " An đến trường bằng xe buýt";
        String[] stringArr = string.toUpperCase().split("\\s+");
        System.out.println("Chuỗi ban đầu là: " + string);
        System.out.println(Arrays.toString(stringArr));
// ABC DEF ABC EFG
        TreeMap<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < stringArr.length; i++) {
            if (!map.containsKey(stringArr[i])) {
                map.put(stringArr[i], 1);
            } else {
                int count = map.get(stringArr[i]);
                map.put(stringArr[i], count + 1);
            }
        }
        System.out.println(map);
    }
}
package bai8_abstract_class_and_interface.thuc_hanh.th3_trien_khai_interface_Comparator2;

import bai5_access_modifier.bai_tap.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}

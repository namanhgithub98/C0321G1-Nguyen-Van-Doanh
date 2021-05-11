package bai4_class_and_object_in_java.bai_tap;

import java.util.Scanner;

public class TestPTBac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.println("Nhập vào lần lượt 3 số a, b, c của phương trình bậc 2: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        PTBac2 ptBac2 = new PTBac2(a, b, c);
        ptBac2.giaiPT();
    }
}

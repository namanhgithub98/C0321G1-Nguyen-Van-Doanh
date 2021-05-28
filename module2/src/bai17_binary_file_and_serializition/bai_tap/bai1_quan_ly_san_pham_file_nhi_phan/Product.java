package bai17_binary_file_and_serializition.bai_tap.bai1_quan_ly_san_pham_file_nhi_phan;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product {
    private static Scanner input = new Scanner(System.in);
    public static void writeToFile(String path, List<Product> listProduct) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listProduct);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void add(ArrayList<ListCar> listCars1) {
        System.out.println("Nhập mã sản phẩm: ");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Nhập tên sản phẩm: ");
        String name = input.nextLine();
        System.out.println("Nhập hãng sản xuất: ");
        String manufacturer = input.nextLine();
        System.out.println("Nhập giá sản phẩm:");
        int price = Integer.parseInt(input.nextLine());

        ListCar listcar1 = new ListCar(id, name, manufacturer, price);
        listCars1.add(listcar1);



    }

    public static void display(ArrayList<ListCar> listCars1) {
    }

    public static void search(ArrayList<ListCar> listCars1) {
    }



}

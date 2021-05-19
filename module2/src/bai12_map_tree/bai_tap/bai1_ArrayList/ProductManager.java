package bai12_map_tree.bai_tap.bai1_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {
    ArrayList<Product> list = new ArrayList<Product>();

    public ArrayList<Product> getList() {
        return list;
    }

    public void setList(ArrayList<Product> list) {
        this.list = list;
    }

    public int size() {
        return list.size();
    }

    public void add(Product o) {
        if (list.size() == 0) {
            list.add(o);
        } else {
            for (Product product : this.list) {
                if (o.getId() == product.getId()) {
                    System.out.println("Sản phẩm trùng Id, Vui lòng nhập sản phẩm khác!!!");
                    return;
                }
            }
            list.add(o);
        }
    }

    public void remove(int id) {
        if (list.size() == 0) {
            System.out.println("Danh sách rỗng!!!");
        } else {
            for (Product product : this.list) {
                if (id == product.getId()) {
                    list.remove(product);
                    System.out.println("Đã xóa sản phẩm có id là: " + id + "!!!");
                    return;
                }
            }
            System.out.println("Sản phẩm này không có trong danh sách!!!");
        }
    }

    public void update(int id) {
        if (list.size() == 0) {
            System.out.println("Danh sách rỗng!!!");
        } else {
            for (Product product : this.list) {
                if (id == product.getId()) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Vui lòng nhập thông tin cần sửa của sản phẩm có id là:" + id);
                    System.out.println("Nhập tên sản phẩm: ");
                    String updateName = scanner.nextLine();
                    System.out.println("Nhập giá sản phẩm: ");
                    int updatePrice = scanner.nextInt();
                    product.setName(updateName);
                    product.setPrice(updatePrice);
                    System.out.println("Sản phẩm đã được chỉnh sửa!!!");
                    return;
                }
            }
            System.out.println("Sản phẩm này không có trong danh sách!!!");
        }
    }

    public void display() {
        System.out.println("Danh sách các sản phẩm:");
        for (Product product : this.list) {
            System.out.println(product.toString());
        }
    }

    public void search(int id) {
        if (list.size() == 0) {
            System.out.println("Danh sách rỗng!!!");
        } else {
            for (Product product : this.list) {
                if (id == product.getId()) {
                    System.out.println(product.toString());
                    return;
                }
            }
            System.out.println("Sản phẩm này không có trong danh sách!!!");
        }
    }

    public void sort() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng chọn cách sắp xếp: \n" +
                "1. Tăng dần \n" +
                "2. Giảm dần");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                Collections.sort(this.list, new Comparator<Product>() {
                    @Override
                    public int compare(Product o1, Product o2) {
                        return Integer.compare(o1.getId(), o2.getId());
                    }
                });
                break;
            case 2:
                Collections.sort(this.list, new Comparator<Product>() {
                    @Override
                    public int compare(Product o1, Product o2) {
                        return Integer.compare(o2.getId(), o1.getId());
                    }
                });
                break;
        }
    }
}

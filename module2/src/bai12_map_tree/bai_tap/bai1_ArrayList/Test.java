package bai12_map_tree.bai_tap.bai1_ArrayList;

public class Test {
    public static void main(String[] args) {

    ProductManager listProduct = new ProductManager();
        listProduct.add(new Product(3, "Bánh", 20000));
        listProduct.add(new Product(6, "Kẹo", 35000));
        listProduct.add(new Product(1, "Mứt", 40000));
        listProduct.add(new Product(2, "Hạt", 45000));
        listProduct.add(new Product(4, "Coca", 10000));
        listProduct.add(new Product(5, "Socola", 50000));
        listProduct.display();

        listProduct.remove(3);
        listProduct.display();

        listProduct.update(5);
        listProduct.display();

        listProduct.search(7);
        listProduct.sort();
        listProduct.display();
}
}

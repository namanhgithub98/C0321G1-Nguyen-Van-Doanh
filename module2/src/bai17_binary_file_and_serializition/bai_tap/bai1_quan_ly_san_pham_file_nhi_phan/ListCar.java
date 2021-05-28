package bai17_binary_file_and_serializition.bai_tap.bai1_quan_ly_san_pham_file_nhi_phan;

import java.io.Serializable;

public class ListCar implements Serializable {
    private String id;
    private String name;
    private String manufacturer;  // hãng sản xuất
    private String price;         // giá

    public ListCar(String id, String name, String manufacturer, String price) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public ListCar(int id, String name, String manufacturer, int price) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "listCar{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}

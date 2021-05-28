package bai16_text_file.bai_tap.bai2_read_file;

public class readNations {
    private int id;
    private int code;
    private int country;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "readNations{" +
                "id=" + id +
                ", code=" + code +
                ", country=" + country +
                '}';
    }

    public static void main(String[] args) {
        System.out.println();
    }
}

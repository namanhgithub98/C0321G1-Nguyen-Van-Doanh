package bai11_generic_stack_queue.bai_tap.optional_bai5_to_chuc_du_lieu_hop_ly_queue;

public class Personnel implements Comparable<Personnel>{
    private String name;
    private String birthday;
    private String gender;
    private String id;

    public Personnel(String name, String birthday, String gender, String id) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Personnel{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public int compareTo(Personnel o) {
        return this.getBirthday().compareTo(o.getBirthday());
    }
}

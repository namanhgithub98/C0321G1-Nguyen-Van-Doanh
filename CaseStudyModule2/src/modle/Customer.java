package modle;


public class Customer {
    private String name;
    private String birthday;
    private String gender;
    private String idCard;
    private String telephone;
    private String email;
    private String service;
    private String address;


    public Customer() {
    }

    public Customer(String name, String birthday, String gender, String idCard, String telephone, String email, String address, String service) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
        this.telephone = telephone;
        this.email = email;
        this.service = service;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    public String getBirthday() {
        return birthday;
    }

    public Customer setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    public String getGender() {

        return gender;
    }

    public Customer setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getId() {
        return idCard;
    }

    public Customer setsCMND(String id) {
        this.idCard = idCard;
        return this;
    }

    public String getTelephone() {
        return telephone;
    }

    public Customer setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }

    public String getEmail() {

        return email;
    }

    public Customer setEmail(String email) {
        this.email = email;
        return this;
    }



    public String getService() {
        return service;
    }

    public Customer setService(String service) {
        this.service = service;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Customer setAddress(String address) {
        this.address = address;
        return this;
    }

    public void showInfor() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", idCard='" + idCard + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", service='" + service + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

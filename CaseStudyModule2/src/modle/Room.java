package modle;

public class Room extends Service {
    private String dvMienPhi;

    public Room() {
    }
    public Room(String dvMienPhi) {
        this.dvMienPhi = dvMienPhi;
    }
    public Room(String id, String tenDichVu, String dienTichSD, String chiPhiThue, String soNguoiTD, String kieuThue, String dvMienPhi) {
        super(id, tenDichVu, dienTichSD, chiPhiThue, soNguoiTD, kieuThue);
        this.dvMienPhi = dvMienPhi;
    }

    public String getDvMienPhi() {
        return dvMienPhi;
    }

    public void setDvMienPhi(String dvMienPhi) {

        this.dvMienPhi = dvMienPhi;
    }


    @Override
    public String showInfor() {

        return " Room { " +
                super.showInfor()+
                ", Dịch vụ Miễn Phí Đi Kèm ='" + dvMienPhi + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return "Room{" +
                super.toString()+","+ '\'' +
                "DvMienPhi='" + dvMienPhi + '\'' +
                '}';
    }
}

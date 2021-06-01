package modle;

public class Room extends Service {
    private String DvMienPhi;

    public Room() {
    }
    public Room(String DvMienPhi) {
        this.DvMienPhi = DvMienPhi;
    }
    public Room(String id, String tenDichVu, String dienTichSD, String chiPhiThue, String soNguoiTD, String kieuThue, String DvMienPhi) {
        super(id, tenDichVu, dienTichSD, chiPhiThue, soNguoiTD, kieuThue);
        this.DvMienPhi = DvMienPhi;
    }

    public String getDvMienPhi() {
        return DvMienPhi;
    }

    public void setDvMienPhi(String DvMienPhi) {

        this.DvMienPhi = DvMienPhi;
    }


    @Override
    public String showInfor() {

        return " Room { " +
                super.showInfor()+
                ", Dịch vụ Miễn Phí Đi Kèm ='" + DvMienPhi + '\'' +
                '}';
    }
}

package modle;

public class Villa extends Service {
    private String tieuChuanPhong;
    private String tienNghiKhac;
    private String dtHoBoi;
    private String soTang;

    public Villa() {

    }

    public Villa(String id, String tenDichVu, String dienTichSD, String chiPhiThue, String soNguoiTD, String kieuThue) {
        super(id, tenDichVu, dienTichSD, chiPhiThue, soNguoiTD, kieuThue);
    }

    public Villa(String id, String tenDichVu, String dienTichSD, String chiPhiThue, String soNguoiTD, String kieuThue,
                 String tieuChuanPhong, String tienNghiKhac, String dtHoBoi, String soTang) {
        super(id, tenDichVu, dienTichSD, chiPhiThue, soNguoiTD, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.tienNghiKhac = tienNghiKhac;
        this.dtHoBoi = dtHoBoi;
        this.soTang = soTang;
    }
    //
//    public Villa(String id, String tenDichVu, String dienTichSD, String chiPhiThue, String soNguoiTD, String kieuThue, String tieuChuanPhong,String tienNghiKhac,String dtHoBoi,String soTang) {
//        super(id, tenDichVu, dienTichSD, chiPhiThue, soNguoiTD, kieuThue);
//        this.tieuChuanPhong=tieuChuanPhong;
//        this.tienNghiKhac=tienNghiKhac;
//        this.dtHoBoi = dtHoBoi;
//        this.soTang =soTang;
//    }


    public String getSHoBoi() {
        return dtHoBoi;
    }
    public void setSHoBoi(String SHoBoi) {
        this.dtHoBoi = dtHoBoi;
    }

    public String getTienNghiKhac() {
        return tienNghiKhac;
    }

    public void setTienNghiKhac(String tienNghiKhac) {
        this.tienNghiKhac = tienNghiKhac;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getSoTang() {
        return soTang;
    }

    public void setSoTang(String soTang) {
        this.soTang = soTang;
    }

    @Override
    public String showInfor() {
        return "Villa { " +
                super.showInfor()+
                ", Tiêu Chuẩn Phòng = '" + tieuChuanPhong + '\'' +
                ", Tiện Nghi Khác = '" + tienNghiKhac + '\'' +
                ", Diện Tích Hồ Bơi = '" + dtHoBoi + '\'' +
                ", Số Tầng = '" + soTang + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return "Villa{" +
                super.toString()+","+
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", tienNghiKhac='" + tienNghiKhac + '\'' +
                ", dtHoBoi='" + dtHoBoi + '\'' +
                ", soTang='" + soTang + '\'' +
                '}';
    }
}

import java.util.Objects;

public class NhanVienFulltime extends NhanVien implements Comparable<NhanVienFulltime>{
    private double tienThuong = 0;
    private double tienPhat = 0;
    private double luongCung = 0;

    public NhanVienFulltime() {
    }

    public NhanVienFulltime(int maNhanVien, String hoVaTen, int tuoi, String SDT, String email, double tienThuong, double tienPhat, double luongCung) {
        super(maNhanVien, hoVaTen, tuoi, SDT, email);
        this.tienThuong = tienThuong;
        this.tienPhat = tienPhat;
        this.luongCung = luongCung;
    }

    public double getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(double tienThuong) {
        this.tienThuong = tienThuong;
    }

    public double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(double tienPhat) {
        this.tienPhat = tienPhat;
    }

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    public double thucLinhFullTime() {
         return this.luongCung+(this.tienThuong-this.tienPhat);
    }

    @Override
    public String toString() {
        return "Nhân viên Fulltime:" +
                " Mã nhân viên=" + getMaNhanVien() +
                ", Họ và tên=" + getHoVaTen() +
                ", tuổi=" + getTuoi() +
                ", SĐT=" + getSDT() +
                ", email=" + getEmail() +
                ", Tiền thưởng=" + tienThuong +
                ", Tiền phạt=" + tienPhat +
                ", Lương cứng=" + luongCung + "\n";
    }

    @Override
    public int compareTo(NhanVienFulltime o) {
        return Double.compare(this.luongCung, o.luongCung);
    }
}

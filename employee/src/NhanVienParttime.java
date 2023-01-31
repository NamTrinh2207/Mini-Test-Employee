public class NhanVienParttime extends NhanVien {
    private double gioLamViec;

    public NhanVienParttime() {
    }

    public NhanVienParttime(int maNhanVien, String hoVaTen, int tuoi, String SDT, String email, double gioLamViec) {
        super(maNhanVien, hoVaTen, tuoi, SDT, email);
        this.gioLamViec = gioLamViec;
    }

    public double getGioLamViec() {
        return gioLamViec;
    }

    public void setGioLamViec(double gioLamViec) {
        this.gioLamViec = gioLamViec;
    }

    public double thucLinhPartTime() {
        return this.gioLamViec * 100000;
    }

    @Override
    public String toString() {
        return "Nhân viên Parttime:" +
                "  Mã nhân viên=" + getMaNhanVien() +
                ", Họ và tên=" + getHoVaTen() +
                ", Tuổi=" + getTuoi() +
                ", SĐT=" + getSDT() +
                ", email=" + getEmail() +
                ", Giờ làm việc=" + gioLamViec + "\n";
    }
}

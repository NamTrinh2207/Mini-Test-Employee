import java.util.List;

public class NhanVien {
    private int maNhanVien;
    private String hoVaTen;
    private int tuoi;
    private String SDT;
    private String email;

    public NhanVien() {
    }

    public NhanVien(int maNhanVien, String hoVaTen, int tuoi, String SDT, String email) {
        this.maNhanVien = maNhanVien;
        this.hoVaTen = hoVaTen;
        this.tuoi = tuoi;
        this.SDT = SDT;
        this.email = email;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "maNhanVien=" + maNhanVien +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", tuoi=" + tuoi +
                ", SDT='" + SDT + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}

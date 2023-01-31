import java.util.ArrayList;
import java.util.Collections;

public class NhanVienManager {
    public ArrayList<NhanVien> nhanViens;

    public NhanVienManager() {
        nhanViens = new ArrayList<>();
        nhanViens.add(new NhanVienFulltime(1, "trịnh văn nam", 26, "0369324191", "trinhnam91@gmail.com", 100, 10, 5000000));
        nhanViens.add(new NhanVienFulltime(2, "trịnh văn bắc", 26, "0369324192", "trinhnam92@gmail.com", 100, 10, 4000000));
        nhanViens.add(new NhanVienFulltime(3, "trịnh văn đông", 26, "0369324193", "trinhnam93@gmail.com", 100, 10, 500000));
        nhanViens.add(new NhanVienParttime(4, "trịnh văn tây", 26, "0369324194", "trinhnam94@gmail.com", 20));
        nhanViens.add(new NhanVienParttime(5, "trịnh văn trung", 26, "0369324195", "trinhnam95@gmail.com", 3));
        nhanViens.add(new NhanVienParttime(6, "trịnh văn quốc", 26, "0369324197", "trinhnam96@gmail.com", 4));
    }

    public double tongLuongTatCaNv() {
        double tongluong;
        double luongFullTime = 0;
        double luongPartTime = 0;
        for (NhanVien nv : nhanViens) {
            if (nv instanceof NhanVienFulltime) {
                luongFullTime += ((NhanVienFulltime) nv).thucLinhFullTime();
            }
            if (nv instanceof NhanVienParttime) {
                luongPartTime += ((NhanVienParttime) nv).thucLinhPartTime();
            }
        }
        tongluong = luongFullTime + luongPartTime;
        return tongluong;
    }

    public double trungBinhLuong() {
        return tongLuongTatCaNv() / nhanViens.size();
    }

    public void nvLuongThap() {
        double luongNv;
        System.out.println("nhân viên lương thấp FullTime:");
        for (NhanVien nv : nhanViens) {
            if (nv instanceof NhanVienFulltime) {
                if (((NhanVienFulltime) nv).thucLinhFullTime() < trungBinhLuong()) {
                    luongNv = ((NhanVienFulltime) nv).thucLinhFullTime();
                    System.out.println(nv.getHoVaTen() + ", Tiền lương: " + luongNv);
                }
            }
        }
    }

    public void tongLuongPartTime() {
        double tongluong = 0;
        for (NhanVien nv : nhanViens) {
            if (nv instanceof NhanVienParttime) {
                tongluong += ((NhanVienParttime) nv).thucLinhPartTime();
            }
        }
        System.out.println("Lương phải trả cho nhân viên Part Time là: " + tongluong);
    }

    public void sapXep() {
        ArrayList<NhanVienFulltime> nhanVienFulltimes = new ArrayList<>();
        for (NhanVien nv : nhanViens
        ) {
            if (nv instanceof NhanVienFulltime) {
                nhanVienFulltimes.add((NhanVienFulltime) nv);
            }
        }
        Collections.sort(nhanVienFulltimes);
        System.out.println(nhanVienFulltimes);
    }
}

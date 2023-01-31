public class Main {

    public static void main(String[] args) {
        NhanVienManager nhanVien = new NhanVienManager();
        System.out.println(nhanVien.nhanViens);
        System.out.println("Tổng lương tất cả nhân viên trong ty: "+nhanVien.tongLuongTatCaNv());
        System.out.println("Tổng lương trung bình: "+nhanVien.trungBinhLuong());
        nhanVien.nvLuongThap();
        nhanVien.tongLuongPartTime();
        nhanVien.sapXep();
    }
}

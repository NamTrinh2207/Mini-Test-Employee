package controller;

public class PartTimeEmployee extends Employee {
    private double workTime;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(int maNhanVien, String hoVaTen, int tuoi, String SDT, String email, double workTime) {
        super(maNhanVien, hoVaTen, tuoi, SDT, email);
        this.workTime = workTime;
    }

    public double getWorkTime() {
        return workTime;
    }

    public void setWorkTime(double workTime) {
        this.workTime = workTime;
    }

    public double partTimePractice() {
        return this.workTime * 100000;
    }

    @Override
    public String toString() {
        return "Nhân viên Parttime:" +
                "  Mã nhân viên=" + getId() +
                ", Họ và tên=" + getFullName() +
                ", Tuổi=" + getTuoi() +
                ", SĐT=" + getPhone() +
                ", email=" + getEmail() +
                ", Giờ làm việc=" + workTime + "\n";
    }
}

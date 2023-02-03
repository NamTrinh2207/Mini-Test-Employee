package controller;

public class Employee {
    private int id;
    private String fullName;
    private int age;
    private String phone;
    private String email;

    public Employee() {
    }

    public Employee(int id, String fullName, int age, String phone, String email) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getTuoi() {
        return age;
    }

    public void setTuoi(int tuoi) {
        this.age = tuoi;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
                "maNhanVien=" + id +
                ", hoVaTen='" + fullName + '\'' +
                ", tuoi=" + age +
                ", SDT='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

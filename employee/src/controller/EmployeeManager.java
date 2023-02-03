package controller;

import model.Employee;
import model.FullTimeEmployee;
import model.PartTimeEmployee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager {
    private final List<Employee> employees;

    //Data saving----------------------------------------------------------------------
    public EmployeeManager() {
        employees = new ArrayList<>();
    }

    public EmployeeManager(List<Employee> employees) {
        this.employees = employees;
    }

    //CRUD Employee--------------------------------------------------------------------
    public void addNewEmployee(Employee employee) {  // Thêm
        employees.add(employee);
    }

    public void displayEmployees() {  //Hiển thị danh sách
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void deleteByEmploy() {  // xóa
        if (employees.size()==0){
            System.out.println("Không có dữ liệu để xóa! ");
        }else {
            employees.remove(employees.size() - 1);
        }
    }

    public void editEmployee(Scanner input) { //sửa thông tin nhân viên
        String newId;String newName;int newAge;String newPhone;String newEmail;
        double newBonus;double newFine;double newHardSalary;
        System.out.println("Mời bạn nhập vào id nhân viên: ");
        String id = input.nextLine();
        for (Employee e : employees) {
            if (id.equals(e.getId())) {
                if (e instanceof FullTimeEmployee) {
                    System.out.print("Mời bạn nhập mã nhân viên  : "); newId = input.nextLine();
                    System.out.print("Mời bạn nhập tên nhân viên : "); newName = input.nextLine();
                    System.out.print("Mời bạn nhập tuổi nhân viên : "); newAge = Integer.parseInt(input.nextLine());
                    System.out.print("Mời bạn nhập sđt nhân viên : "); newPhone = input.nextLine();
                    System.out.print("Mời bạn nhập email nhân viên : "); newEmail = input.nextLine();
                    System.out.print("Mời bạn nhập tiền thưởng nhân viên : "); newBonus = Integer.parseInt(input.nextLine());
                    System.out.print("Mời bạn nhập tiền phạt nhân viên : "); newFine = Integer.parseInt(input.nextLine());
                    System.out.print("Mời bạn nhập lương cơ bản của nhân viên : "); newHardSalary = Integer.parseInt(input.nextLine());
                    e.setId(newId);e.setFullName(newName);e.setAge(newAge);e.setPhone(newPhone);e.setEmail(newEmail);
                    ((FullTimeEmployee) e).setBonus(newBonus);((FullTimeEmployee) e).setFine(newFine);
                    ((FullTimeEmployee) e).setHardSalary(newHardSalary);
                } else if (e instanceof PartTimeEmployee) {
                    System.out.print("Mời bạn nhập mã nhân viên  : "); newId = input.nextLine();
                    System.out.print("Mời bạn nhập tên nhân viên : "); newName = input.nextLine();
                    System.out.print("Mời bạn nhập tuổi nhân viên : "); newAge = Integer.parseInt(input.nextLine());
                    System.out.print("Mời bạn nhập sđt nhân viên : "); newPhone = input.nextLine();
                    System.out.print("Mời bạn nhập email nhân viên : "); newEmail = input.nextLine();
                    System.out.print("Mời bạn nhập số giờ làm việc : ");double newWorkTime = Integer.parseInt(input.nextLine());
                    e.setId(newId);e.setFullName(newName);e.setAge(newAge);e.setPhone(newPhone);e.setEmail(newEmail);
                    ((PartTimeEmployee) e).setWorkTime(newWorkTime);
                }
            }
        }
    }

    public double totalSalaryAllEmployees() { // Tổng lương của tất cả nhân viên trong công ty
        double totalSalary;
        double FullTimeSalary = 0;
        double PartTimeSalary = 0;
        for (Employee nv : employees) {
            if (nv instanceof FullTimeEmployee) {
                FullTimeSalary += ((FullTimeEmployee) nv).fullTimePractice();
            }
            if (nv instanceof PartTimeEmployee) {
                PartTimeSalary += ((PartTimeEmployee) nv).partTimePractice();
            }
        }
        totalSalary = FullTimeSalary + PartTimeSalary;
        return totalSalary;
    }

    public double averageSalary() { // Trung bình lương của tất cả nhân viên trong công ty
        return totalSalaryAllEmployees() / employees.size();
    }

    public String lowSalaryEmployees() { //Danh sach nhan vien có luong thap hon TB luong
        StringBuilder name = new StringBuilder();
        for (Employee employee : employees) {
            if (employee instanceof FullTimeEmployee) {
                if (((FullTimeEmployee) employee).fullTimePractice() < averageSalary()) {
                    name.append("Nhân viên:").append(employee.getFullName()).append("\n").append("Lương: ").
                            append(((FullTimeEmployee) employee).fullTimePractice()).append("\n").;
                }
            }
        } return name.toString();
    }

    public double totalSalaryPartTime() {  // Tổng lương của nhân viên part time
        double totalSalaryPartTime = 0;
        for (Employee nv : employees) {
            if (nv instanceof PartTimeEmployee) {
                totalSalaryPartTime += ((PartTimeEmployee) nv).partTimePractice();
            }
        }
        return totalSalaryPartTime;
    }

    public ArrayList<FullTimeEmployee> sortFullTimeEmployee() { //Sắp xếp lương nhân viên full time tăng dần
        ArrayList<FullTimeEmployee> fullTimeEmployees = new ArrayList<>();
        for (Employee nv : employees
        ) {
            if (nv instanceof FullTimeEmployee) {
                fullTimeEmployees.add((FullTimeEmployee) nv);
            }
        }
        Collections.sort(fullTimeEmployees);
        return fullTimeEmployees;
    }
}

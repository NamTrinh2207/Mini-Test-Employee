package views;

import controller.EmployeeManager;

import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        EmployeeManager nhanVien = new EmployeeManager();
        Scanner input = new Scanner(System.in);
        int checkInput;
        do {
            System.out.println("-----------------------------------Menu-------------------------------------");
            System.out.println(
                    "1. Danh sách nhân viên công ty\n" +
                    "2. Tổng lương của tất cả nhân viên\n" +
                    "3. Trung bình lương thực lĩnh của tất cả nhân viên\n" +
                    "4. Nhân viên full time có mức lương thấp hơn so với mức lương trung bình của cả công ty\n" +
                    "5. Tổng lương của nhân viên làm part time\n" +
                    "6. Danh sách nhân viên full time có mức lương tăng dần\n" +
                    "0. thoát chương trình");
            System.out.print("Mời bạn chọn...");
            checkInput = Integer.parseInt(input.nextLine());
            switch (checkInput){
                case 1 -> {
                    System.out.println("Danh sách nhân viên công ty: ");
                    System.out.println(nhanVien.employees);
                }
                case 2 -> {
                    System.out.println("Tổng lương của tất cả nhân viên: ");
                    System.out.println(nhanVien.totalSalaryAllEmployees());
                }
                case 3 -> {
                    System.out.println("Trung bình lương thực lĩnh của tất cả nhân viên: ");
                    System.out.println(nhanVien.averageSalary());
                }
                case 4 -> {
                    System.out.println("Nhân viên FullTime lương thấp so với trùng bình lương cả công ty: ");
                    nhanVien.lowSalaryEmployees();
                }
                case 5 -> {
                    System.out.println("Tổng lương của nhân viên làm part time: ");
                    nhanVien.totalSalaryPartTime();
                }
                case 6 -> {
                    System.out.println("Danh sách nhân viên full time có mức lương tăng dần: ");
                    nhanVien.sortFullTimeEmployee();
                }
                case 0 -> System.exit(checkInput);
                default -> System.out.println("Vui lòng nhập lại !");
            }
        }while (true);
    }
}

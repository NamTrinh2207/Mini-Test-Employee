package controller;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeManager {
    public ArrayList<Employee> employees;

    public EmployeeManager() {
        employees = new ArrayList<>();
        employees.add(new FullTimeEmployee(1, "trịnh văn nam", 26, "0369324191", "trinhnam91@gmail.com", 100, 10, 5000000));
        employees.add(new FullTimeEmployee(2, "trịnh văn bắc", 26, "0369324192", "trinhnam92@gmail.com", 100, 10, 4000000));
        employees.add(new FullTimeEmployee(3, "trịnh văn đông", 26, "0369324193", "trinhnam93@gmail.com", 100, 10, 500000));
        employees.add(new PartTimeEmployee(4, "trịnh văn tây", 26, "0369324194", "trinhnam94@gmail.com", 20));
        employees.add(new PartTimeEmployee(5, "trịnh văn trung", 26, "0369324195", "trinhnam95@gmail.com", 3));
        employees.add(new PartTimeEmployee(6, "trịnh văn quốc", 26, "0369324197", "trinhnam96@gmail.com", 4));
    }

    public double totalSalaryAllEmployees() {
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

    public double averageSalary() {
        return totalSalaryAllEmployees() / employees.size();
    }

    public void lowSalaryEmployees() {
        double lowSalaryEmployees;
        for (Employee nv : employees) {
            if (nv instanceof FullTimeEmployee) {
                if (((FullTimeEmployee) nv).fullTimePractice() < averageSalary()) {
                    lowSalaryEmployees = ((FullTimeEmployee) nv).fullTimePractice();
                    System.out.println(nv.getFullName() + ", Tiền lương: " + lowSalaryEmployees);
                }
            }
        }
    }

    public void totalSalaryPartTime() {
        double totalSalaryPartTime = 0;
        for (Employee nv : employees) {
            if (nv instanceof PartTimeEmployee) {
                totalSalaryPartTime += ((PartTimeEmployee) nv).partTimePractice();
            }
        }
        System.out.println("Lương phải trả cho nhân viên Part Time là: " + totalSalaryPartTime);
    }

    public void sortFullTimeEmployee() {
        ArrayList<FullTimeEmployee> fullTimeEmployees = new ArrayList<>();
        for (Employee nv : employees
        ) {
            if (nv instanceof FullTimeEmployee) {
                fullTimeEmployees.add((FullTimeEmployee) nv);
            }
        }
        Collections.sort(fullTimeEmployees);
        System.out.println(fullTimeEmployees);
    }
}

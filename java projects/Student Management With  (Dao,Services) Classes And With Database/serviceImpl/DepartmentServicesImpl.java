package serviceImpl;

import daoImpl.DepartmentDaoImpl;
import model.Department;
import service.DepartmentServices;

import java.util.Scanner;

public class DepartmentServicesImpl implements DepartmentServices {

    @Override
    public void addDepartment() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Department ID(Number Format : )");
                    int newDepId = Integer.parseInt(input.nextLine());

                    System.out.print("Enter Department Name: ");
                    String depName = input.nextLine();

                    System.out.print("Enter Department Code: ");
                    String depCode = input.nextLine();

        Department newDepartment = new Department(newDepId, depName, depCode);
        DepartmentDaoImpl departmentDao = new DepartmentDaoImpl();
        boolean success = departmentDao.addDepartment(newDepartment);

        if (success) {
            System.out.println("Department Added successfully.");
        } else {
            System.out.println("failed.");
        }
    }
}

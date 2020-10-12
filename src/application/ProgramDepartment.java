package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgramDepartment {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDeparmentDao();

		System.out.println("--- Test 01: Department FindById ---");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);

		System.out.println();
		System.out.println("--- Test 02: Seller FindAll ---");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		System.out.println();
		System.out.println("--- Test 03: Seller insert ---");
		Department newDep = new Department(null, "Music");
		departmentDao.insert(newDep);
		System.out.println("Inserted! Department new Id: " + newDep.getId());

		System.out.println();
		System.out.println("--- Test 04: Seller update ---");
		Department depUpdate =departmentDao.findById(1);
		depUpdate.setName("Food");
		departmentDao.update(depUpdate);
		System.out.println("Update completed!");

		System.out.println();
		System.out.println("--- Test 05: Seller delete ---");

		sc.close();
	}

}

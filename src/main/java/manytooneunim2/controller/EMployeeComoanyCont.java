package manytooneunim2.controller;

import manytooneunim2.dao.CompanyDao;
import manytooneunim2.dao.EmployeeDao;
import manytooneunim2.dto.Company;
import manytooneunim2.dto.Employee;

public class EMployeeComoanyCont {
public static void main(String[] args) {
//	Company company1=new Company();
//	company1.setId(1);
//	company1.setName("TYss");
//	company1.setAddress("Bangalore");
//	
//	Company company2=new Company();
//	company2.setId(2);
//	company2.setName("infosys");
//	company2.setAddress("Bangalore");
//	
//	Employee employee1=new Employee();
//	employee1.setId(1);
//	employee1.setName("Hari");
//	employee1.setPhone(87878787);
//	employee1.setCompany(company1);
//	
//	Employee employee2=new Employee();
//	employee2.setId(2);
//	employee2.setName("Ajay");
//	employee2.setPhone(43456787);
//	employee2.setCompany(company2);
//	
//	
//	Employee employee3=new Employee();
//	employee3.setId(3);
//	employee3.setName("Vijay");
//	employee3.setPhone(909090900);
//	employee3.setCompany(company1);
	
	EmployeeDao employeeDao=new EmployeeDao();
	CompanyDao companyDao=new CompanyDao();
	
	
//	companyDao.saveCompany(company1);
//	companyDao.saveCompany(company2);
//	
//	employeeDao.saveEMployee(employee1);
//	employeeDao.saveEMployee(employee2);
//	employeeDao.saveEMployee(employee3);
	
	
	
//	find the data
	
//	companyDao.getCompayById(1);
//	employeeDao.getEmployeeById(1);
//	
	
//	companyDao.deleteCompany(1);
//	employeeDao.deleteEmployee(1);
	Employee employee=new Employee();
	employee.setName("Rashmi");
	employee.setPhone(878677675);

	employeeDao.updateEmployee(3, employee);
	
	
	
}
}

package manytooneunim2.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytooneunim2.controller.EMployeeComoanyCont;
import manytooneunim2.dto.Company;
import manytooneunim2.dto.Employee;

public class EmployeeDao {

	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("vinod").createEntityManager();
	}
	
	public void saveEMployee(Employee employee) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}
	
	public void getEmployeeById(int id) {
		EntityManager entityManager=getEntityManager();
		Employee employee=entityManager.find(Employee.class, id);
		if(employee!=null) {
			System.out.println(employee);
		}else {
			System.out.println("id is not present");
		}
	}
	public void deleteEmployee(int id) {
		EntityManager entityManager=getEntityManager();
		Employee employee=entityManager.find(Employee.class, id);
		if(employee!=null) {
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();
		}else {
			System.out.println("id is not present");
		}
	}
	
	public void updateEmployee(int id,Employee employee) {
		EntityManager entityManager=getEntityManager();
		Employee dbEmployee=entityManager.find(Employee.class, id);
		if(dbEmployee!=null) {
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			employee.setId(id);
	        employee.setCompany(dbEmployee.getCompany());
			entityManager.merge(employee);
			
			entityTransaction.commit();
		}else {
			System.out.println("id is not present");
		}
		
		
	}
	
	
	
	
	
	
	
	
}

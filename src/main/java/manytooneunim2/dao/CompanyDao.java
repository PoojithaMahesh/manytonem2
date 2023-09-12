package manytooneunim2.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytooneunim2.dto.Company;
import manytooneunim2.dto.Company;


public class CompanyDao {
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		return entityManager;
	}
	
	public void saveCompany(Company company) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(company);
		entityTransaction.commit();
	}
	public void getCompayById(int id) {
		EntityManager entityManager=getEntityManager();
		Company company=entityManager.find(Company.class, id);
		if(company!=null) {
			System.out.println(company);
		}else {
			System.out.println("id is not present");
		}
	}
	public void deleteCompany(int id) {
		EntityManager entityManager=getEntityManager();
		Company company=entityManager.find(Company.class, id);
		if(company!=null) {
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(company);
			entityTransaction.commit();
		}else {
			System.out.println("id is not present");
		}
	}
	
	public void updateCompany(int id,Company company) {
		EntityManager entityManager=getEntityManager();
		Company dbCompany=entityManager.find(Company.class, id);
		if(dbCompany!=null) {
//			id is present i can update the data
			EntityTransaction entityTransaction =entityManager.getTransaction();
			entityTransaction.begin();
			company.setId(id);
			 
			entityTransaction.commit();
		}else {
//			id is not present
			System.out.println("Sorry id is not present");
		}
		
		
	}
	
	
	
	
}

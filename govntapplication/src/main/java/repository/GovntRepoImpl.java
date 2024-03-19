package repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import Dto.GovntDto;
import entity.GovntEntity;

public class GovntRepoImpl implements  GovntRepo {

	@Override
	public boolean save(GovntEntity entity) {
		
	
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction =entityManager.getTransaction();
		
		try {
			entityTransaction.begin();
			entityManager.persist(entity);
			entityTransaction.commit();
		}catch(PersistenceException e) {
		if(entityTransaction.isActive()) {
			entityTransaction.rollback();
		}
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
	
		return true;
	}

}

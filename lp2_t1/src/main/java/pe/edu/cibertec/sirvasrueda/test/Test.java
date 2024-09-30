package pe.edu.cibertec.sirvasrueda.test;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import pe.edu.cibertec.sirvasrueda.model.*;

public class Test {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("lp2_t1");
		EntityManager manager = factory.createEntityManager();
			
			try {
					Query query= manager.createNamedQuery("Role.findAll");
					List<Role> roles = query.getResultList();
					for (Role role : roles) {
						System.out.println("ID= " + role.getIdrole());
						System.out.println("Name: " + role.getName());
						System.out.println("Descripcion: " + role.getDescription());
					}
			}catch(Exception e) {
				e.printStackTrace();
				
		}
    }
}

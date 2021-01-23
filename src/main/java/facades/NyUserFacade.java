 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import dto.UserDTO;
import dto.UsersDTO;
import entities.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Madsj
 */
public class NyUserFacade {
    
     private static EntityManagerFactory emf;
    private static NyUserFacade instance;


 private NyUserFacade() {
    }

    /**
     *
     * @param _emf
     * @return the instance of this facade.
     */
    public static NyUserFacade getUserFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new NyUserFacade();
        }
        return instance;
    }
    
    public List<UserDTO> getAllUsers() {
    
    EntityManager em = emf.createEntityManager();
    List<User> UserList = em.createQuery("SELECT u FROM User u", User.class).getResultList();
    
    return new UsersDTO(UserList).getAll();
}
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import entities.User;
import entities.UserInfo;
import facades.FetchFacade;
import facades.NyUserFacade;
import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import rest.UserResource;

/**
 *
 * @author Madsj
 */
public class tester {
    public static void main(String[] args) throws IOException {
           EntityManagerFactory emf = EMF_Creator.createEntityManagerFactory();
    EntityManager em = emf.createEntityManager();
    
//    em.getTransaction().begin();
//    String uName;
//    long l = 1;
//    UserInfo userInfofound = em.find(UserInfo.class,l );
//        System.out.println(userInfofound.getUser().getUserName());
//    
    
    NyUserFacade nyuserFacade = NyUserFacade.getUserFacade(emf);
        UserResource ur = new UserResource();
        System.out.println(ur.getChuck());
        
    
        FetchFacade fetchFacade = FetchFacade.getFetchFacade(emf);
      
        System.out.println(fetchFacade.chuckJokes().getValue());
        
        
        
        
    }
    
}

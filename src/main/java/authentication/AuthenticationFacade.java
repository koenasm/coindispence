package authentication;

import entity.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;
import java.util.List;

@Stateless
public class AuthenticationFacade {

    @PersistenceUnit(name = "coindispense")
    private EntityManager entityManager;

    public boolean authenticate(String userName,String password){

        List<User> result = entityManager.createQuery(
                "SELECT u " +
                "FROM User u "+
                "WHERE u.userName = ?1 " +
                "AND u.password = ?2",
                 User.class)
                .setParameter(1,userName)
                .setParameter(2,password)
                .getResultList();

        return !result.isEmpty();
    }

}

package ro.sd.a2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.sd.a2.entity.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findFirstByName(String name);
    User findFirstByNameAndPassword(String name,String password);
    User findFirstByEmailAndPassword(String email,String password);

    //List<User> findAll();

    void deleteUserByEmail(String email);
}

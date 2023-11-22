package kr.ac.mjc.Camera.repository;


import kr.ac.mjc.Camera.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    public User findByEmail(String email);
    public User findByEmailAndPassword(String email,String password);

}
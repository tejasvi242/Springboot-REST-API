package net.com.springboot.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import net.com.springboot.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {



	

}

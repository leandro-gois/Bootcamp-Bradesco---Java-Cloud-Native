package lgois.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import lgois.security.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    // Finds a user by username
    UserDetails findByUsername(String username);

}

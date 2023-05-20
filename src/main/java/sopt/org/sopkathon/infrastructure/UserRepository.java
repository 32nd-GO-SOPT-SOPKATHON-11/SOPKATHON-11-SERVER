package sopt.org.sopkathon.infrastructure;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import sopt.org.sopkathon.domain.User;

import java.util.Optional;


public interface UserRepository extends Repository<User, Long> {

    @Query("select u from User u where u.id != 1")
    Optional<User> findAll();
}

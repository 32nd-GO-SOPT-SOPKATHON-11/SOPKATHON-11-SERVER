package sopt.org.sopkathon.infrastructure;

import org.springframework.data.repository.Repository;
import sopt.org.sopkathon.domain.Hobby;

public interface HobbyRepository extends Repository<Hobby, Long> {

    //Get
    Hobby findById(Long id);
}

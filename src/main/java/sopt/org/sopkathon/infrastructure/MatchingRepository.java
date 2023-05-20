package sopt.org.sopkathon.infrastructure;

import org.springframework.data.repository.Repository;
import sopt.org.sopkathon.domain.Matching;

import java.util.List;

public interface MatchingRepository extends Repository<Matching, Long> {
    void save(Matching matching);

    List<Matching> findByWoman(Long womanId);
}

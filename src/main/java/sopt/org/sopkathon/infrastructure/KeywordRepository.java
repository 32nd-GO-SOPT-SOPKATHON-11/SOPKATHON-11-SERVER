package sopt.org.sopkathon.infrastructure;

import org.springframework.data.repository.Repository;
import sopt.org.sopkathon.domain.Keyword;

public interface KeywordRepository extends Repository<Keyword, Long>{

    Keyword findById(Long id);
}

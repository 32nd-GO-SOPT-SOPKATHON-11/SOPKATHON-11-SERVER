package sopt.org.sopkathon.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sopt.org.sopkathon.domain.Matching;
import sopt.org.sopkathon.infrastructure.MatchingRepository;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class MatchingService {

    private final MatchingRepository matchingRepository;
    @Transactional
    public void postMatching(Long userId, Long targetId){
        Matching newMatching = new Matching(userId, targetId);
        matchingRepository.save(newMatching);
    }
}

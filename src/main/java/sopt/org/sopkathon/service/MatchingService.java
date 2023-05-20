package sopt.org.sopkathon.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sopt.org.sopkathon.controller.dto.response.MatchingResponseDto;
import sopt.org.sopkathon.domain.Matching;
import sopt.org.sopkathon.domain.User;
import sopt.org.sopkathon.infrastructure.MatchingRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

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

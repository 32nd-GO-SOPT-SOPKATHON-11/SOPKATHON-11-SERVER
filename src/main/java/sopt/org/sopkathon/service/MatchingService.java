package sopt.org.sopkathon.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sopt.org.sopkathon.controller.dto.response.MatchingResponseDto;
import sopt.org.sopkathon.domain.Matching;
import sopt.org.sopkathon.domain.User;

import sopt.org.sopkathon.exception.Error;
import sopt.org.sopkathon.exception.model.NotFoundException;
import sopt.org.sopkathon.infrastructure.MatchingRepository;
import sopt.org.sopkathon.infrastructure.UserRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MatchingService {

    private final MatchingRepository matchingRepository;
    private final UserRepository userRepository;
    @Transactional
    public void postMatching(Long userId, Long targetId) throws NotFoundException{
        userRepository.findById(targetId).orElseThrow(() ->new NotFoundException(Error.NOT_FOUND_ERROR, "존재하지 않는 유저를 검색했습니다."));
        Matching newMatching = new Matching(userId, targetId);
        matchingRepository.save(newMatching);
    }


}

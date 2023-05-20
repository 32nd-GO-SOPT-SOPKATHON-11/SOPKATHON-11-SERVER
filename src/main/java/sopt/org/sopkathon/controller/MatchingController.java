package sopt.org.sopkathon.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sopt.org.sopkathon.controller.dto.request.MatchingRequestDto;
import sopt.org.sopkathon.service.MatchingService;

@RestController
@RequiredArgsConstructor
public class MatchingController {

    private final MatchingService matchingService;

    @PostMapping("/matching")
    public void postMatching(@RequestBody MatchingRequestDto requestDto){
        matchingService.postMatching(1L, Long.valueOf(requestDto.getUserId()));
    }
}

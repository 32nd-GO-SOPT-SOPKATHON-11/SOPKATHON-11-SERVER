package sopt.org.sopkathon.controller.dto.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class MatchingResponseDto {


    private String name;

    private String profileImage;

    public static MatchingResponseDto of(String name, String profileImage) {
        return MatchingResponseDto.builder()
                .name(name)
                .profileImage(profileImage)
                .build();
    }

}
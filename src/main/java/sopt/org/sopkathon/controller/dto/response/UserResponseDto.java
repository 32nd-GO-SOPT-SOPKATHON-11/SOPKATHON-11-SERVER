package sopt.org.sopkathon.controller.dto.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class UserResponseDto {

    private Long id;

    private String name;

    private int age;

    private String local;

    private String profileImage;

    public static UserResponseDto of(Long id, String name, int age, String local, String profileImage) {
        return UserResponseDto.builder()
                .id(id)
                .name(name)
                .age(age)
                .local(local)
                .profileImage(profileImage)
                .build();
    }

}

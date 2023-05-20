package sopt.org.sopkathon.controller.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.util.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDetailResponseDto {
    private String name;

    private String profileImage;

    private int age;

    private String local;

    private boolean isMarried;

    private boolean hasChild;

    private List<String> hobby;

    private List<String> keyword;
}

package sopt.org.sopkathon.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sopt.org.sopkathon.controller.dto.response.UserDetailResponseDto;
import sopt.org.sopkathon.controller.dto.response.UserResponseDto;
import sopt.org.sopkathon.domain.Hobby;
import sopt.org.sopkathon.domain.Keyword;
import sopt.org.sopkathon.domain.User;
import sopt.org.sopkathon.exception.Error;
import sopt.org.sopkathon.infrastructure.HobbyRepository;
import sopt.org.sopkathon.infrastructure.KeywordRepository;
import sopt.org.sopkathon.infrastructure.UserRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public List<UserResponseDto> getUserList() {
        System.out.println("DFSDF");
        List<User> users = userRepository.getAll();


        return users.stream()
                .map(user -> UserResponseDto.of(
                        user.getId(),
                        user.getName(),
                        user.getAge(),
                        user.getLocal(),
                        user.getProfileImage()
                )).collect(Collectors.toList());
    }

    @Transactional
    public UserDetailResponseDto getUserDetail(Long id){
        User user = userRepository.findById(id);
        Hobby hobby = user.getHobby();
        Keyword keyword = user.getKeyword();
        List<String> hobbyList = new ArrayList<>();
        List<String> keywordList = new ArrayList<>();
        if(hobby.isArt()){
            hobbyList.add("미술");
        }
        if(hobby.isBook()){
            hobbyList.add("독서");
        }
        if(hobby.isSong()){
            hobbyList.add("노래");
        }
        if(hobby.isMusic()){
            hobbyList.add("악기");
        }
        if(hobby.isExercise()){
            hobbyList.add("운동");
        }
        if(hobby.isDance()){
            hobbyList.add("춤");
        }

        if(keyword.isActive()){
            keywordList.add("활동적인");
        }
        if(keyword.isSmart()){
            keywordList.add("지적인");
        }
        if(keyword.isSocial()){
            keywordList.add("사교적인");
        }
        if(keyword.isSentimental()){
            keywordList.add("감성적인");
        }
        if(keyword.isHonest()){
            keywordList.add("솔직한");
        }
        if(keyword.isGenuine()){
            keywordList.add("성실한");
        }
        return new UserDetailResponseDto(user.getName(), user.getProfileImage(), user.getAge(), user.getLocal(), user.isMarried(), user.isHasChild(), hobbyList, keywordList);
    }
}

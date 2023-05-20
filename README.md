# SOPKATHON-11-SERVER
##  🫶 GOSOPT-SOPKATHON Server Developers

<img src="https://github.com/32nd-GO-SOPT-SOPKATHON-11/SOPKATHON-11-SERVER/assets/65678579/387376db-bc65-4d9d-96f3-644db1420984" width="200"> | <img src="https://github.com/32nd-GO-SOPT-SOPKATHON-11/SOPKATHON-11-SERVER/assets/65678579/caa91d2c-1f2a-4d91-af8f-c4d059ae0a34" width="200"> |
:---------:|:----------:|
강윤서 | 도소현 |
[yungu0010](https://github.com/yungu0010) | [sohyundoh](https://github.com/sohyundoh) |
[GET] 전체유저 조회 API 구현 | [POST] 좋아요 API 구현 |
[GET] 내가 좋아하는 유저 조회| [GET] 유저 상세페이지 조회 |

<br>

## 📝 Code Convention
<details>
<summary>  💙 네이밍 </summary>

<br>

**Dto명**

```
- Entity명 + Response or Request + Dto
ex) UserResponseDto
```

**메소드명**

```
- HTTPMethod + Entity명 + 리스트인지 아닌지에 따라 분기처리
ex) getUserList
```

**서비스 클래스명**

```
- Entity명 + Service
ex) UserSevice
```

**컨트롤러 클래스명**

```
- Entity명 + Controller
ex) UserController
```

그 외 모든 변수명은 **lowerCamelCase** 사용
</details>  

<details>
<summary>  💙 코드레이아웃 </summary>

<br>
  
**들여쓰기 및 띄어쓰기**

- 들여쓰기에는 탭(tab) 대신 **4개의 space**를 사용합니다.
- 클래스 내 변수는 한 줄 공백을 두고 작성합니다.

**줄바꿈**

- 함수 정의가 **`최대 길이를 초과하는 경우`**에는 아래와 같이 줄바꿈합니다.
    
    ```java
    public static UserResponseDto of(Long id, String nickName, Rank userRank, int point, 
                                    int coupon, long interest, int waiting, int finish,
                                    int ready, int delivering, int delivered, 
                                    String address, String phoneNumber) {
    				...
        }
    }
    ```
</details>

<br>

## 📝 Commit Convention

```
[PREFIX] #이슈번호 - 이슈 내용
```

### 예시

```
// 1번 이슈에서 새로운 기능(Feat)을 구현한 경우
[FEAT] #1 - 기능 구현
// 1번 이슈에서 레이아웃(Design)을 구현한 경우
[DESIGN] #1 - 레이아웃 구현
```

### Prefix의 의미

```
[FEAT]: 새로운 기능 구현
[FIX]: 버그, 오류 해결, 코드 수정
[REFACTOR]: 전면 수정이 있을 때 사용합니다(쓸모없는 코드, 주석 삭제, 파일 삭제, 프로젝트 구조 변경(폴더링 등))
[CHORE]: 그 이외의 잡일/ 버전 코드 수정, 패키지 구조 변경, 파일 이동, 파일이름 변경
[DOCS]: README나 WIKI 등의 문서 개정
[COMMENT]: 필요한 주석 추가 및 변경
[MERGE]: 머지
[HOTFIX] 겁나 급한 버그 수정 (모두 주목...)
```

##  📝 Git Flow
### branch명

```
feature/#이슈넘버
```

### Merge

- Merge를 할 때는 커밋 메세지를 `**[PREFIX] #이슈번호 - 구현내용**` 형식의 이슈 이름과 같이 수정해줍니다.
- Merge 후 재사용하지 않는 브랜치는 삭제합니다.

## 👾 ERD 구조

## 📂 프로젝트 구조
```

├── build.gradle
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
├── settings.gradle
└── src
    ├── main
    │   ├── java
    │   │   └── sopt
    │   │       └── org
    │   │           └── sopkathon
    │   │               ├── SopkathonApplication.java
    │   │               ├── common
    │   │               │   └── dto
    │   │               ├── controller
    │   │               │   └── dto
    │   │               │       ├── request
    │   │               │       └── response
    │   │               ├── domain
    │   │               ├── infrastructure
    │   │               └── service
    │   └── resources
    │       └── applicatoin.yaml
    └── test
        └── java
            └── sopt
                └── org
                    └── sopkathon
                        └── SopkathonApplicationTests.java
```

## 🌷우리의 행복한 Chu억~♥︎ 🌷
<img src= "https://github.com/32nd-GO-SOPT-SOPKATHON-11/SOPKATHON-11-SERVER/assets/65678579/b9026148-0c0c-4212-93ac-2cdd7d562beb" width="300"> <img src = "https://github.com/32nd-GO-SOPT-SOPKATHON-11/SOPKATHON-11-SERVER/assets/65678579/db94873d-050f-4a0b-aa83-21a121159d3a" width="300">
<img src = "https://github.com/32nd-GO-SOPT-SOPKATHON-11/SOPKATHON-11-SERVER/assets/65678579/9fb31673-9a07-4b70-b3e4-2df530a79589" width="300">





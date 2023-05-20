package sopt.org.sopkathon.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int age;

    private String sex;

    private String local;

    @OneToOne
    @JoinColumn(name = "hobby")
    private Hobby hobby;

    @OneToOne
    @JoinColumn(name = "keyword")
    private Keyword keyword;

    private boolean isMarried;

    private boolean hasChild;

    private String profileImage;
    
}

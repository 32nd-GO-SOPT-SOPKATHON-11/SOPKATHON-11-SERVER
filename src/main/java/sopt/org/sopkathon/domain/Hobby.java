package sopt.org.sopkathon.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Hobby {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private boolean exercise;

    @Column
    private boolean read;

    @Column
    private boolean art;

    @Column
    private boolean music;

    @Column
    private boolean song;

    @Column
    private boolean dance;

}

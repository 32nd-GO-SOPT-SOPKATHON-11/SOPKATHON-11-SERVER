package sopt.org.sopkathon.domain;

import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Keyword {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private boolean active;

    @Column
    private boolean smart;

    @Column
    private boolean sentimental;

    @Column
    private boolean social;

    @Column
    private boolean honest;

    @Column
    private boolean genuine;

}

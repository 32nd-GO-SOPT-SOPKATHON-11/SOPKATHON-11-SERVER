package sopt.org.sopkathon.domain;

import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Matching {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long woman;

    @Column
    private Long man;

    public Matching(Long woman, Long man){
        this.woman = woman;
        this.man = man;
    }
}

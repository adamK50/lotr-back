package com.smusik.games.lotrback.persistence.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "T_OPTION")
public class OptionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "OptionIdGenSeq")
    @SequenceGenerator(name = "OptionIdGenSeq", sequenceName = "OPTION_ID_SEQ", allocationSize = 1)
    private Long id;

    private String option;

    public OptionEntity(Long id, String option) {
        this.id = id;
        this.option = option;
    }
}

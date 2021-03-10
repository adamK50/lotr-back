package com.smusik.games.lotrback.persistence.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "T_MAGIC")
public class MagicEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MagicIdGenSeq")
    @SequenceGenerator(name = "MagicIdGenSeq", sequenceName = "MAGIC_ID_SEQ", allocationSize = 1)
    private Long id;

    private String magic;

    public MagicEntity(Long id, String magic) {
        this.id = id;
        this.magic = magic;
    }
}

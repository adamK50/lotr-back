package com.smusik.games.lotrback.persistence.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "T_UNIT_TYPE")
public class UnitTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "UnitTypeIdGenSeq")
    @SequenceGenerator(name = "UnitTypeIdGenSeq", sequenceName = "UNIT_TYPE_ID_SEQ", allocationSize = 1)
    private Long id;

    private String unitType;

    public UnitTypeEntity(Long id, String unitType) {
        this.id = id;
        this.unitType = unitType;
    }
}

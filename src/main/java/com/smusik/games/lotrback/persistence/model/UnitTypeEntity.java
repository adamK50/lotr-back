package com.smusik.games.lotrback.persistence.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitTypeEntity that = (UnitTypeEntity) o;
        return id.equals(that.id) &&
                unitType.equals(that.unitType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, unitType);
    }

    @Override
    public String toString() {
        return "UnitTypeEntity{" +
                "id=" + id +
                ", unitType='" + unitType + '\'' +
                '}';
    }
}

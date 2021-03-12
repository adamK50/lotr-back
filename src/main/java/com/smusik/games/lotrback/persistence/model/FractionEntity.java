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
@Table(name = "T_FRACTION")
public class FractionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FractionIdGenSeq")
    @SequenceGenerator(name = "FractionIdGenSeq", sequenceName = "FRACTION_ID_SEQ", allocationSize = 1)
    private Long id;

    private String fraction;
    private Integer destruction;

    public FractionEntity(Long id, String fraction, Integer destruction) {
        this.id = id;
        this.fraction = fraction;
        this.destruction = destruction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FractionEntity that = (FractionEntity) o;
        return id.equals(that.id) &&
                fraction.equals(that.fraction) &&
                destruction.equals(that.destruction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fraction, destruction);
    }

    @Override
    public String toString() {
        return "FractionEntity{" +
                "id=" + id +
                ", fraction='" + fraction + '\'' +
                ", destruction=" + destruction +
                '}';
    }
}

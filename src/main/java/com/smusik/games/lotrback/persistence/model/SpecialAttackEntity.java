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
@Table(name = "T_SPECIAL_ATTACK")
public class SpecialAttackEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SpecialAttackIdGenSeq")
    @SequenceGenerator(name = "SpecialAttackIdGenSeq", sequenceName = "SPECIAL_ATTACK_ID_SEQ", allocationSize = 1)
    private Long id;

    private String attack;

    public SpecialAttackEntity(Long id, String attack) {
        this.id = id;
        this.attack = attack;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpecialAttackEntity that = (SpecialAttackEntity) o;
        return id.equals(that.id) &&
                attack.equals(that.attack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, attack);
    }

    @Override
    public String toString() {
        return "SpecialAttackEntity{" +
                "id=" + id +
                ", attack='" + attack + '\'' +
                '}';
    }
}

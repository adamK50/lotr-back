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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MagicEntity that = (MagicEntity) o;
        return id.equals(that.id) &&
                magic.equals(that.magic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, magic);
    }

    @Override
    public String toString() {
        return "MagicEntity{" +
                "id=" + id +
                ", magic='" + magic + '\'' +
                '}';
    }
}

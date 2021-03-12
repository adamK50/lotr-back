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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OptionEntity that = (OptionEntity) o;
        return id.equals(that.id) &&
                option.equals(that.option);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, option);
    }

    @Override
    public String toString() {
        return "OptionEntity{" +
                "id=" + id +
                ", option='" + option + '\'' +
                '}';
    }
}

package com.smusik.games.lotrback.persistence.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import com.smusik.games.lotrback.persistence.enums.*;

import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "T_CREATURE")
public class CreatureEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CreatureIdGenSeq")
    @SequenceGenerator(name = "CreatureIdGenSeq", sequenceName = "CREATURE_ID_SEQ", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "unitPoints")
    private Integer unitPoints;
    @Column(name = "pointsSum")
    private Integer pointsSum;
    @Column(name = "movement")
    private Float movement;
    @Column(name = "fight")
    private String fight;
    @Column(name = "strength")
    private Integer strength;
    @Column(name = "defense")
    private Integer defense;
    @Column(name = "attack")
    private Integer attack;
    @Column(name = "lives")
    private Integer lives;
    @Column(name = "courage")
    private Integer courage;
    @Column(name = "power")
    private Integer power;
    @Column(name = "will")
    private Integer will;
    @Column(name = "fortune")
    private Integer fortune;
    @Column(name = "option")
    private Option option;
    @Column(name = "specialAttack")
    private SpecialAttack specialAttack;
    @Column(name = "magic")
    private Magic magic;
    @Column(name = "unitType")
    private UnitType unitType;

    @ManyToOne
    @JoinColumn(name="t_fraction_id", nullable=false)
    private FractionEntity fractionId;

    public CreatureEntity(Long id, String name, Integer unitPoints, Integer pointsSum, Float movement, String fight, Integer strength, Integer defense, Integer attack, Integer lives, Integer courage, Integer power, Integer will, Integer fortune, Option option, SpecialAttack specialAttack, Magic magic, UnitType unitType, FractionEntity fractionId) {
        this.id = id;
        this.name = name;
        this.unitPoints = unitPoints;
        this.pointsSum = pointsSum;
        this.movement = movement;
        this.fight = fight;
        this.strength = strength;
        this.defense = defense;
        this.attack = attack;
        this.lives = lives;
        this.courage = courage;
        this.power = power;
        this.will = will;
        this.fortune = fortune;
        this.option = option;
        this.specialAttack = specialAttack;
        this.magic = magic;
        this.unitType = unitType;
        this.fractionId = fractionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreatureEntity that = (CreatureEntity) o;
        return id.equals(that.id) &&
                name.equals(that.name) &&
                unitPoints.equals(that.unitPoints) &&
                pointsSum.equals(that.pointsSum) &&
                movement.equals(that.movement) &&
                fight.equals(that.fight) &&
                strength.equals(that.strength) &&
                defense.equals(that.defense) &&
                attack.equals(that.attack) &&
                lives.equals(that.lives) &&
                courage.equals(that.courage) &&
                power.equals(that.power) &&
                will.equals(that.will) &&
                fortune.equals(that.fortune) &&
                option == that.option &&
                specialAttack == that.specialAttack &&
                magic == that.magic &&
                unitType == that.unitType &&
                fractionId.equals(that.fractionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, unitPoints, pointsSum, movement, fight, strength, defense, attack, lives, courage, power, will, fortune, option, specialAttack, magic, unitType, fractionId);
    }

    @Override
    public String toString() {
        return "CreatureEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", unitPoints=" + unitPoints +
                ", pointsSum=" + pointsSum +
                ", movement=" + movement +
                ", fight='" + fight + '\'' +
                ", strength=" + strength +
                ", defense=" + defense +
                ", attack=" + attack +
                ", lives=" + lives +
                ", courage=" + courage +
                ", power=" + power +
                ", will=" + will +
                ", fortune=" + fortune +
                ", option=" + option +
                ", specialAttack=" + specialAttack +
                ", magic=" + magic +
                ", unitType=" + unitType +
                ", fractionId=" + fractionId +
                '}';
    }
}

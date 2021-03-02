package com.smusik.games.lotrback.persistence.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class CreatureEntity {

    @Id
    private Integer id;

    private String name;
    private Integer unitPoints;
    private Integer pointsSum;
    private Float movement;
    private String fight;
    private Integer strength;
    private Integer defense;
    private Integer attack;
    private Integer lives;
    private Integer courage;
    private Integer power;
    private Integer will;
    private Integer fortune;
    private Integer unitTypeId;
    private Integer fractionId;

    public CreatureEntity(Integer id, String name, Integer unitPoints, Integer pointsSum, Float movement, String fight, Integer strength, Integer defense, Integer attack, Integer lives, Integer courage, Integer power, Integer will, Integer fortune, Integer unitTypeId, Integer fractionId) {
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
        this.unitTypeId = unitTypeId;
        this.fractionId = fractionId;
    }
}

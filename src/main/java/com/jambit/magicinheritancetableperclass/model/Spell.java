package com.jambit.magicinheritancetableperclass.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "SPELL")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Spell {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer energyCost;
    private Integer damage;

    public Spell() {
    }

    public Spell(String name, Integer energyCost, Integer damage) {
        this.name = name;
        this.energyCost = energyCost;
        this.damage = damage;
    }
}
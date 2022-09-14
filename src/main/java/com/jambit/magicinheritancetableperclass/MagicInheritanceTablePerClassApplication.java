package com.jambit.magicinheritancetableperclass;

import com.jambit.magicinheritancetableperclass.model.FireSpell;
import com.jambit.magicinheritancetableperclass.model.FrostSpell;
import com.jambit.magicinheritancetableperclass.model.Spell;
import com.jambit.magicinheritancetableperclass.repository.FireSpellRepository;
import com.jambit.magicinheritancetableperclass.repository.FrostSpellRepository;
import com.jambit.magicinheritancetableperclass.repository.SpellRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MagicInheritanceTablePerClassApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext configurableApplicationContext =
                SpringApplication.run(MagicInheritanceTablePerClassApplication.class, args);

        SpellRepository spellRepository =
                configurableApplicationContext.getBean(SpellRepository.class);
        SpellRepository frostSpellRepository =
                configurableApplicationContext.getBean(FrostSpellRepository.class);
        SpellRepository fireSpellRepository =
                configurableApplicationContext.getBean(FireSpellRepository.class);

        Spell arcaneSpark =
                new Spell("Arcane Spark", 50, 60);
        Spell fireBall =
                new FireSpell("Fireball", 100, 100, 100, 2000);
        Spell meteorShower =
                new FireSpell("Meteor Shower", 400, 300, 300, 3000);
        Spell frostBolt =
                new FrostSpell("Frost Bolt", 80, 80, true, 300);

        spellRepository.save(arcaneSpark);
        fireSpellRepository.save(fireBall);
        fireSpellRepository.save(meteorShower);
        frostSpellRepository.save(frostBolt);
    }
}

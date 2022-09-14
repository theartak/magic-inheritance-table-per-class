package com.jambit.magicinheritancetableperclass.repository;

import com.jambit.magicinheritancetableperclass.model.Spell;
import org.springframework.context.annotation.Primary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public interface SpellRepository extends CrudRepository<Spell, Long> {
}
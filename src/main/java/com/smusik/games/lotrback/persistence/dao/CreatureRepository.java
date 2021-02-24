package com.smusik.games.lotrback.persistence.dao;

import com.smusik.games.lotrback.persistence.model.CreatureEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CreatureRepository extends JpaRepository<CreatureEntity, Long> {


}

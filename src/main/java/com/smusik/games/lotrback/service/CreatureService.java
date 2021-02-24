package com.smusik.games.lotrback.service;

import com.smusik.games.lotrback.persistence.model.CreatureEntity;

import java.util.Optional;

public interface CreatureService {

    CreatureEntity getCreatureEntityByName(String name);
}

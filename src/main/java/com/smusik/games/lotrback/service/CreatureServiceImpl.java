package com.smusik.games.lotrback.service;

import com.smusik.games.lotrback.persistence.dao.CreatureRepository;
import com.smusik.games.lotrback.persistence.model.CreatureEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CreatureServiceImpl implements CreatureService {

    private CreatureService creatureService;
    private CreatureRepository creatureRepository;

    @Override
    public CreatureEntity getCreatureEntityByName(@RequestParam String name) {
        return creatureService.getCreatureEntityByName(name);

    }
}

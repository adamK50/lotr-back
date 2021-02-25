package com.smusik.games.lotrback.rest;

import com.smusik.games.lotrback.persistence.model.CreatureEntity;
import com.smusik.games.lotrback.service.CreatureServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api")
public class CreatureController {

    private CreatureServiceImpl creatureService;

    @GetMapping("/get-creature-by-name")
    public CreatureEntity getCreatureByName(@RequestParam String name) {
        return creatureService.getCreatureEntityByName(name);
    }
}

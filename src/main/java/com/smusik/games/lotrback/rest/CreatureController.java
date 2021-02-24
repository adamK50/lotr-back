package com.smusik.games.lotrback.rest;

import com.smusik.games.lotrback.persistence.model.CreatureEntity;
import com.smusik.games.lotrback.service.CreatureServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import java.util.Optional;

@RestController
public class CreatureController {

    private CreatureServiceImpl creatureService;

    @GetMapping("/get-creature")
    public CreatureEntity getCreatureByName(String name) {
        return creatureService.getCreatureEntityByName(name);
    }
}

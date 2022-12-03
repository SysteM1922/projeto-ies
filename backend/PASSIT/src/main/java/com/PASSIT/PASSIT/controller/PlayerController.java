package com.PASSIT.PASSIT.controller;

import com.PASSIT.PASSIT.model.Player;
import com.PASSIT.PASSIT.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class PlayerController {

    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @PostMapping("/add")
    public String add(@RequestBody Player player) {
        playerService.savePlayer(player);
        return "New player ADDED!";
    }

    @GetMapping("/players")
    public List<Player> getPlayers() {
        return playerService.getPlayers();
     }

    @GetMapping("/players/{id}")
    public Player getPlayerById(@PathVariable("id") Long id) {
        return playerService.getPlayerById(id);
    }
}

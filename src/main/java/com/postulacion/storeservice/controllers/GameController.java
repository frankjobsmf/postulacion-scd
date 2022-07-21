package com.postulacion.storeservice.controllers;


import com.postulacion.storeservice.entities.Game;
import com.postulacion.storeservice.repository.IGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/games")
public class GameController {

    @Autowired
    private IGame iGame;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Game> getGames() {
        return iGame.getGames();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Game getGameById(@PathVariable Long id) {
        return iGame.getGameById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveGame(@RequestBody Game game) {
        iGame.saveGame(game);
    }

    @PutMapping("/game={idGame}/store={idStore}")
    @ResponseStatus(HttpStatus.OK)
    public void saveGame(@PathVariable Long idGame, @PathVariable Long idStore) {
        iGame.updateGame(idGame, idStore);
    }
}

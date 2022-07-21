package com.postulacion.storeservice.repository;

import com.postulacion.storeservice.entities.Game;

import java.util.List;

public interface IGame {
    public List<Game> getGames();
    public Game getGameById(Long id);
    public void saveGame(Game game);
    public void updateGame(Long idGame, Long idStore);
}

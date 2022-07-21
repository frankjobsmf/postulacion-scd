package com.postulacion.storeservice.service;

import com.postulacion.storeservice.dao.GameDao;
import com.postulacion.storeservice.dao.StoreDao;
import com.postulacion.storeservice.entities.Game;
import com.postulacion.storeservice.entities.Store;
import com.postulacion.storeservice.repository.IGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService implements IGame {

    @Autowired
    private StoreDao storeDao;

    @Autowired
    private GameDao gameDao;

    @Override
    public List<Game> getGames() {
        return (List<Game>) gameDao.findAll();
    }

    @Override
    public Game getGameById(Long id) {
        return gameDao.findById(id).orElse(null);
    }

    @Override
    public void saveGame(Game game) {
        gameDao.save(game);
    }
    @Override
    public void updateGame(Long idGame, Long idStore){
        Store store = storeDao.findById(idStore).orElse(null);

        if (store == null)
            return;


        Game game = gameDao.findById(idGame).orElse(null);

        if (game == null)
            return;

        game.setStore(store);
        gameDao.save(game);
    };
}

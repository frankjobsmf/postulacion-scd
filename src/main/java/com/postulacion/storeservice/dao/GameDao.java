package com.postulacion.storeservice.dao;

import com.postulacion.storeservice.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameDao extends JpaRepository<Game, Long> {
}

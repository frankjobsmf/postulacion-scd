package com.postulacion.storeservice.dao;

import com.postulacion.storeservice.entities.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreDao extends JpaRepository<Store, Long> {
}

package com.devsuperior.dslist1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist1.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}

package com.devsuperior.dslist1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist1.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}

package com.devsuperior.dslist1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.devsuperior.dslist1.dto.GameDTO;
import com.devsuperior.dslist1.dto.GameMinDTO;
import com.devsuperior.dslist1.entities.Game;
import com.devsuperior.dslist1.projections.GameMinProjection;
import com.devsuperior.dslist1.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	

	@Transactional(readOnly =true)
	public GameDTO findById(@PathVariable Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}
		
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
	    List<Game> result = gameRepository.findAll();  
	    return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId) {
	    List<GameMinProjection> result = gameRepository.searchByList(listId);
	    return result.stream().map(x -> new GameMinDTO(x)).toList();
	}


}

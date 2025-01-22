package com.devsuperior.dslist1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist1.dto.GameDTO;
import com.devsuperior.dslist1.dto.GameMinDTO;

import com.devsuperior.dslist1.services.GameListService;
import com.devsuperior.dslist1.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	
	
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> result = gameService.findAll();
		return result;
	}
	@GetMapping("/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId){
	    List<GameMinDTO> result = gameService.findByList(listId);
	    return result;
	}

}

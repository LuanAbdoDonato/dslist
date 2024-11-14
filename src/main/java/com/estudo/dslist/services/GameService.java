package com.estudo.dslist.services;

import com.estudo.dslist.dto.GameMinDTO;
import com.estudo.dslist.entities.Game;
import com.estudo.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List <Game> games = gameRepository.findAll();
        List<GameMinDTO> gamesDTO = new ArrayList<>();

        games.forEach(x -> gamesDTO.add(new GameMinDTO(x)));

        return gamesDTO;
    }
}

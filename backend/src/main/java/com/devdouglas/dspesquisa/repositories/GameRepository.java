package com.devdouglas.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devdouglas.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}

package com.devdouglas.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devdouglas.dspesquisa.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>{

}

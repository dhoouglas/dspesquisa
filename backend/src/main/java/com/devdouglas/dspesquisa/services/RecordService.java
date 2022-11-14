package com.devdouglas.dspesquisa.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devdouglas.dspesquisa.dto.RecordDTO;
import com.devdouglas.dspesquisa.dto.RecordInsertDTO;
import com.devdouglas.dspesquisa.entities.Game;
import com.devdouglas.dspesquisa.entities.Record;
import com.devdouglas.dspesquisa.repositories.GameRepository;
import com.devdouglas.dspesquisa.repositories.RecordRepository;

@Service
public class RecordService {
	
	@Autowired
	private RecordRepository repository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional
	public RecordDTO insert(RecordInsertDTO dto) {
		
		Record entity = new Record();
		
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		
		@SuppressWarnings("deprecation")
		Game game = gameRepository.getOne(dto.getGameId());
		entity.setGame(game);
		
		entity = repository.save(entity);
		return new RecordDTO(entity);
	}

	@Transactional(readOnly = true)
	public Page<RecordDTO> findByMonents(Instant minDate, Instant maxDate, PageRequest pageRequest) {
		return repository.findByMoments(minDate, maxDate, pageRequest).map(x -> new RecordDTO(x));
	}

}

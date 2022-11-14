package com.devdouglas.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devdouglas.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{

}

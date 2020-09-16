package com.devsuperior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dspesquisa.entities.Record;

@RestController
public interface RecordRepository extends JpaRepository<Record, Long> {

}

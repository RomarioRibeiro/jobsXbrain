package com.jobs.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jobs.domain.Venda;

public interface VendaRepository extends JpaRepository<Venda, Integer>{
	@Query(value="select*from venda where id = ?",nativeQuery = true )
Venda find(Integer id);
}

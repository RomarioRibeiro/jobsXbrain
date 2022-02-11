package com.jobs.Repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.jobs.domain.ItemVenda;

public interface ItemVendaRepository extends JpaRepository<ItemVenda, Integer>{
	
	@Modifying
	@Transactional	
	@Query(value= "delete from item_venda where venda_id = ?", nativeQuery = true)
	void deleteByIdVenda(Integer id);
	

}

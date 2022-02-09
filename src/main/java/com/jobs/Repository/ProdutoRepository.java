package com.jobs.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jobs.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
	@Query(value="select*from produto where id = ?",nativeQuery = true )
Produto find(Integer id);
}

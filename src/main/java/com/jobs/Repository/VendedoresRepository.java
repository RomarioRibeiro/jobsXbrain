package com.jobs.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jobs.domain.Vendedores;

public interface VendedoresRepository extends JpaRepository<Vendedores, Integer>{
	@Query(value="select*from apartamento where id = ?",nativeQuery = true )
Vendedores find(Integer id);
}

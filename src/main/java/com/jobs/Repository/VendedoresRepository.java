package com.jobs.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jobs.domain.Vendedor;

public interface VendedoresRepository extends JpaRepository<Vendedor, Integer>{
	@Query(value="select*from vendedor where id = ?",nativeQuery = true )
Vendedor find(Integer id);
}

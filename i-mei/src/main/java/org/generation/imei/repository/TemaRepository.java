package org.generation.imei.repository;

import org.generation.imei.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface TemaRepository extends JpaRepository<Tema, Long> {
	public List<Tema> findAllByCategoriaContainingIgnoreCase(String categoria);
	
	public List<Tema> findByDescricaoContainingIgnoreCase(String descricao);
}

package br.edu.ifms.relacionamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifms.relacionamentos.model.LiderProjeto;

public interface LiderProjetoRepository extends JpaRepository<LiderProjeto, Integer> {
    
}

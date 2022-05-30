package br.edu.ifms.relacionamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifms.relacionamentos.model.Projeto;

public interface ProjetoRepository extends JpaRepository<Projeto, Integer> {
    
}

package br.edu.ifms.relacionamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifms.relacionamentos.model.Funcao;

public interface FuncaoRepository extends JpaRepository<Funcao, Integer>  {
    
}

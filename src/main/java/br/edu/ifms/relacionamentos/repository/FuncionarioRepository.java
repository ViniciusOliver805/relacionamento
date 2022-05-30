package br.edu.ifms.relacionamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifms.relacionamentos.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {
    
}

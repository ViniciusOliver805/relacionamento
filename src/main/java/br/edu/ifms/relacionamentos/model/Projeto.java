package br.edu.ifms.relacionamentos.model;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Projeto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
   
    private String nome;
    private double custoTotal;
    private int duracao; // em meses
   
    @ManyToMany(mappedBy = "projetos")
    private List<Funcionario> funcionarios;


    @ManyToOne
    @JoinColumn(name = "LiderProjeto", nullable = true)
    LiderProjeto liderProjeto;


    

}

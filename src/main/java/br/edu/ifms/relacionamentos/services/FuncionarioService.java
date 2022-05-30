package br.edu.ifms.relacionamentos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.relacionamentos.model.Funcionario;
import br.edu.ifms.relacionamentos.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
    @Autowired
    FuncionarioRepository funcionarioRepository;

    public List<Funcionario> getAll(){
        return funcionarioRepository.findAll();
    }
    
    public void save(Funcionario funcionario){
        funcionarioRepository.save(funcionario);
        }
    
        public void deleteById(Integer id){
            funcionarioRepository.deleteById(id);
        }
    
        public Funcionario findById(Integer id){
            return funcionarioRepository.findById(id).get();
        }
    
        public void updateStudent(Funcionario funcionario){
         funcionarioRepository.save(funcionario);
    
                
            
    
        }
}

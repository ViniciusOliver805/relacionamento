package br.edu.ifms.relacionamentos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.relacionamentos.model.Funcao;
import br.edu.ifms.relacionamentos.repository.FuncaoRepository;

@Service
public class FuncaoService {
    @Autowired
    FuncaoRepository funcaoRepository;

    public List<Funcao> getAll(){
        return funcaoRepository.findAll();
    }
    
    public void save(Funcao funcao){
        funcaoRepository.save(funcao);
        }
    
        public void deleteById(Integer id){
            funcaoRepository.deleteById(id);
        }
    
        public Funcao findById(Integer id){
            return funcaoRepository.findById(id).get();
        }
    
        public void updateStudent(Funcao funcao){
         funcaoRepository.save(funcao);
    
                
            
    
        }

    
}

package br.edu.ifms.relacionamentos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.relacionamentos.model.LiderProjeto;
import br.edu.ifms.relacionamentos.repository.LiderProjetoRepository;

@Service
public class LiderProjetoService {
    
    @Autowired
    LiderProjetoRepository liderprojetoRepository;

    public List<LiderProjeto> getAll(){
        return liderprojetoRepository.findAll();
    }
    
    public void save(LiderProjeto liderprojeto){
        liderprojetoRepository.save(liderprojeto);
        }
    
        public void deleteById(Integer id){
            liderprojetoRepository.deleteById(id);
        }
    
        public LiderProjeto findById(Integer id){
            return liderprojetoRepository.findById(id).get();
        }
    
        public void updateStudent(LiderProjeto liderprojeto){
         liderprojetoRepository.save(liderprojeto);
    
                
            
    
        }
}

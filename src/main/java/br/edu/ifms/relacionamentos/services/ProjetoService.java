package br.edu.ifms.relacionamentos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.relacionamentos.model.Projeto;
import br.edu.ifms.relacionamentos.repository.ProjetoRepository;

@Service
public class ProjetoService {
    
    @Autowired
    ProjetoRepository projetoRepository;

    public List<Projeto> getAll(){
        return projetoRepository.findAll();
    }
    
    public void save(Projeto projeto){
        projetoRepository.save(projeto);
        }
    
        public void deleteById(Integer id){
            projetoRepository.deleteById(id);
        }
    
        public Projeto findById(Integer id){
            return projetoRepository.findById(id).get();
        }
    
        public void updateStudent(Projeto projeto){
         projetoRepository.save(projeto);
    
                
            
    
        }
}

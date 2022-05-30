package br.edu.ifms.relacionamentos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifms.relacionamentos.model.Projeto;
import br.edu.ifms.relacionamentos.services.ProjetoService;

@Controller
@RequestMapping("/projeto")

public class ProjetoController {

    @Autowired
    ProjetoService projetoService;

    @PostMapping ("/")
    public String save(@ModelAttribute("projeto") Projeto projeto) {
        projetoService.save(projeto);
        return "redirect:/projeto/";
    }

    @GetMapping("/")
    public String locAll(Model model) {
        List<Projeto> projeto = projetoService.getAll();
        model.addAttribute("projeto", projeto );
        return "index";
    }

    @GetMapping("/cadastrar")
    public String newProjeto(Model model) {
        model.addAttribute("projeto", new Projeto());
        return "cadastrar";


    }
    @GetMapping("/remove/{id}")
  public String deleteProjeto(@PathVariable("id") Integer id)
  {
      projetoService.deleteById(id);
      return "redirect:/student/";
      
  }

 @GetMapping("/edit/{id}")
 public String editProjeto (@PathVariable("id") Integer id, Model model){
     Projeto projeto = projetoService.findById(id);
     model.addAttribute("projeto", projeto);
     return "edit-student";
 } 

 
 @PostMapping("/update/{id}")
    public String updateprojeto(@PathVariable("id") Integer id, @ModelAttribute Projeto projeto){
        projetoService.save(projeto);

        return "redirect:/student/";
 
    }
    
}

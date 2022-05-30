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

import br.edu.ifms.relacionamentos.model.LiderProjeto;
import br.edu.ifms.relacionamentos.services.LiderProjetoService;

@Controller
@RequestMapping("/liderprojeto")

public class LiderProjetoController {
    
    @Autowired
    LiderProjetoService liderprojetoService;

    @PostMapping ("/")
    public String save(@ModelAttribute("liderprojeto") LiderProjeto liderprojeto) {
        liderprojetoService.save(liderprojeto);
        return "redirect:/liderprojeto/";
    }

    @GetMapping("/")
    public String locAll(Model model) {
        List<LiderProjeto> liderprojeto = liderprojetoService.getAll();
        model.addAttribute("liderprojeto", liderprojeto );
        return "index";
    }

    @GetMapping("/cadastrar")
    public String newLiderProjeto(Model model) {
        model.addAttribute("liderprojeto", new LiderProjeto());
        return "cadastrar";


    }
    @GetMapping("/remove/{id}")
  public String deleteLiderProjeto(@PathVariable("id") Integer id)
  {
      liderprojetoService.deleteById(id);
      return "redirect:/liderprojeto/";
      
  }

 @GetMapping("/edit/{id}")
 public String editLiderProjeto (@PathVariable("id") Integer id, Model model){
     LiderProjeto liderprojeto = liderprojetoService.findById(id);
     model.addAttribute("liderprojeto", liderprojeto);
     return "edit-student";
 } 

 
 @PostMapping("/update/{id}")
    public String updateliderprojeto(@PathVariable("id") Integer id, @ModelAttribute LiderProjeto liderprojeto){
        liderprojetoService.save(liderprojeto);

        return "redirect:/liderprojeto/";
 
    }

}

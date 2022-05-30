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

import br.edu.ifms.relacionamentos.model.Funcao;
import br.edu.ifms.relacionamentos.services.FuncaoService;

@Controller
@RequestMapping("/funcao")
public class FuncaoController {
    
    @Autowired
    FuncaoService funcaoService;

    @PostMapping ("/")
    public String save(@ModelAttribute("funcao") Funcao funcao) {
        funcaoService.save(funcao);
        return "redirect:/funcao/";
    }

    @GetMapping("/")
    public String locAll(Model model) {
        List<Funcao> funcao = funcaoService.getAll();
        model.addAttribute("funcao", funcao );
        return "index";
    }

    @GetMapping("/cadastrar")
    public String newFuncao(Model model) {
        model.addAttribute("funcao", new Funcao());
        return "cadastrar";


    }
    @GetMapping("/remove/{id}")
  public String deleteFuncao(@PathVariable("id") Integer id)
  {
      funcaoService.deleteById(id);
      return "redirect:/funcionario/";
      
  }

 @GetMapping("/edit/{id}")
 public String editFuncao (@PathVariable("id") Integer id, Model model){
     Funcao funcao = funcaoService.findById(id);
     model.addAttribute("funcao", funcao);
     return "edit-funcionario";
 } 

 
 @PostMapping("/update/{id}")
    public String updatefuncao(@PathVariable("id") Integer id, @ModelAttribute Funcao funcao){
        funcaoService.save(funcao);

        return "redirect:/funcionario/";
 
    }

}

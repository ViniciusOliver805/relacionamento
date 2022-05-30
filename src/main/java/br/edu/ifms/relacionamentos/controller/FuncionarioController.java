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

import br.edu.ifms.relacionamentos.model.Funcionario;
import br.edu.ifms.relacionamentos.services.FuncionarioService;

@Controller
@RequestMapping("/funcionario")
public class FuncionarioController {

    @Autowired
    FuncionarioService funcionarioService;

    @PostMapping ("/")
    public String save(@ModelAttribute("funcionario") Funcionario funcionario) {
        funcionarioService.save(funcionario);
        return "redirect:/funcionario/";
    }

    @GetMapping("/")
    public String locAll(Model model) {
        List<Funcionario> funcionario = funcionarioService.getAll();
        model.addAttribute("funcionario", funcionario );
        return "index";
    }

    @GetMapping("/cadastrar")
    public String newFuncionario(Model model) {
        model.addAttribute("funcionario", new Funcionario());
        return "cadastrar";


    }
    @GetMapping("/remove/{id}")
  public String deleteFuncionario(@PathVariable("id") Integer id)
  {
      funcionarioService.deleteById(id);
      return "redirect:/funcionario/";
      
  }

 @GetMapping("/edit/{id}")
 public String editFuncionario (@PathVariable("id") Integer id, Model model){
     Funcionario funcionario = funcionarioService.findById(id);
     model.addAttribute("funcionario", funcionario);
     return "edit-funcionario";
 } 

 
 @PostMapping("/update/{id}")
    public String updatefuncionario(@PathVariable("id") Integer id, @ModelAttribute Funcionario funcionario){
        funcionarioService.save(funcionario);

        return "redirect:/funcionario/";
 
    }
    
}

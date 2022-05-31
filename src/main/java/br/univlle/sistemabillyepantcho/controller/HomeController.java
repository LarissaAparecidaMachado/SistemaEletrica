package br.univlle.sistemabillyepantcho.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping()
    public ModelAndView index (){
        var nome = "matheus";
        var sobrenome = " tavares";
        var mapadados = new HashMap<String, String>();
        mapadados.put("nomenatela", nome);
        mapadados.put("sobrenomenatela", sobrenome);
        return new ModelAndView("home/index",mapadados);

    }
    
}

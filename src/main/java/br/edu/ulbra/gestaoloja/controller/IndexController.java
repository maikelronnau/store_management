package br.edu.ulbra.gestaoloja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "login";
    }
    
    @PostMapping(value="/login")
    public String login(){
        return "redirect:/produtos";
    }
}

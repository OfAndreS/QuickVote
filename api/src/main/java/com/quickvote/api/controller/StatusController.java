package com.quickvote.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quickvote.api.model.Enquete;

@RestController
public class StatusController {

    @GetMapping("/status")
    public String verificarStatus() 
    {
        Enquete myEnquete = new Enquete("Minha Enquete de Teste", "Dev Adm", 50);
        
        String outputString = "| Nome da Enquete: " + myEnquete.getNome() + " | Criador da Enquete: " + myEnquete.getCriador() + "|"; 

        return outputString;
    }
}
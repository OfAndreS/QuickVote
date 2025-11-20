package com.quickvote.api.model;

import com.quickvote.api.model.OpcaoVoto;

import java.sql.Time;
import java.util.ArrayList;

public class Enquete 
{
    private String nomeEnquete;
    private Time duracaoEnquete;
    private OpcaoVoto vencedorEnquete;
    private ArrayList<OpcaoVoto> listOfOpcaoVoto = new ArrayList<OpcaoVoto>();

    public Enquete(String nomeEnquete, Time duracaoEnquete)
    {
        this.nomeEnquete = nomeEnquete;
        this.duracaoEnquete = duracaoEnquete;
    }

    public void addOpcaoVoto()
    {
        // Método para Factory OpcaoVoto
        // Retornar this.listOfOpcaoVoto = this.listOfOpcaoVoto.add()
        System.out.println("| Método não implementado!");
    }

    public String getNomeEnquete()
    {
        return this.nomeEnquete;
    }

    public OpcaoVoto getVencedorEnquete()
    {
        return this.vencedorEnquete;
    }
    
}

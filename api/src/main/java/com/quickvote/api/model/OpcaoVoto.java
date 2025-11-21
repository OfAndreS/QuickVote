package com.quickvote.api.model;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

public class OpcaoVoto 
{
    private String idOpcaoVoto;
    private String descricaoOpcao;
    AtomicLong totalVotos;

    public OpcaoVoto(String id, String texto, AtomicLong totalVotos) 
    {
        this.idOpcaoVoto = id;
        this.descricaoOpcao = texto;
        this.totalVotos = totalVotos;
    }

    public OpcaoVoto(String descricaoOpcao)
    {
        this.idOpcaoVoto = UUID.randomUUID().toString();
        this.descricaoOpcao = descricaoOpcao;
        this.totalVotos = new AtomicLong(0);
    }

    public String getIdOpcaoVoto() 
    {
        return idOpcaoVoto;
    }

    public String getDescricaoOpcao() 
    {
        return descricaoOpcao;
    }

    public AtomicLong getTotalVotos() 
    {
        return totalVotos;
    }
}

package com.quickvote.api.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

public class Enquete 
{

    private final String idEnquete;
    private final String nomeEnquete;
    private final String criadorEnquete;
    private final LocalDateTime dataCriacaoEnquete;
    private final LocalDateTime dataFimEnquete;
    private final List<OpcaoVoto> opcoesEnquete;

    public Enquete(String idEnquete, String nomeEnquete, String criadorEnquete, LocalDateTime dataCriacaoEnquete, LocalDateTime dataFimEnquete, List<OpcaoVoto> opcoes) 
    {
        this.idEnquete = idEnquete;
        this.nomeEnquete = nomeEnquete;
        this.criadorEnquete = criadorEnquete;
        this.dataCriacaoEnquete = dataCriacaoEnquete;
        this.dataFimEnquete = dataFimEnquete;
        this.opcoesEnquete = opcoes;
    }

    public Enquete(String nomeEnquete, String criadorEnquete, int duracaoEmMinutos) 
    {
        
        this.idEnquete = UUID.randomUUID().toString();
        this.nomeEnquete = nomeEnquete;
        this.criadorEnquete = criadorEnquete;
        this.dataCriacaoEnquete = LocalDateTime.now();
        this.dataFimEnquete = LocalDateTime.now().plusMinutes(duracaoEmMinutos);
        this.opcoesEnquete = new CopyOnWriteArrayList<>();
    }

    public String getId() 
    {
        return idEnquete;
    }

    public String getNome() 
    {
        return nomeEnquete;
    }

    public String getCriador() 
    {
        return criadorEnquete;
    }

    public LocalDateTime getDataCriacao() 
    {
        return dataCriacaoEnquete;
    }

    public LocalDateTime getDataFim() 
    {
        return dataFimEnquete;
    }

    public List<OpcaoVoto> getOpcoes() 
    {
        return opcoesEnquete;
    }

    
    public StatusEnquete getStatus() 
    {
        LocalDateTime agora = LocalDateTime.now();

        if (agora.isBefore(dataCriacaoEnquete)) {
            return StatusEnquete.NAO_INICIADA;
        } else if (agora.isAfter(dataFimEnquete)) {
            return StatusEnquete.FINALIZADA;
        } else {
            return StatusEnquete.EM_ANDAMENTO;
        }
    }

}
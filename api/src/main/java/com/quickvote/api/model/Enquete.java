package com.quickvote.api.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

public class Enquete {

    private final String id;
    private final String nome;
    private final String criador;
    private final LocalDateTime dataCriacao;
    private final LocalDateTime dataFim;
    private final List<OpcaoVoto> opcoes;

    public Enquete(String id, String nome, String criador, LocalDateTime dataCriacao, LocalDateTime dataFim, List<OpcaoVoto> opcoes) {
        this.id = id;
        this.nome = nome;
        this.criador = criador;
        this.dataCriacao = dataCriacao;
        this.dataFim = dataFim;
        this.opcoes = opcoes;
    }

    public Enquete(String nome, String criador, int duracaoEmMinutos) {
        this(
            UUID.randomUUID().toString(),
            nome,
            criador,
            LocalDateTime.now(),
            LocalDateTime.now().plusMinutes(duracaoEmMinutos),
            new CopyOnWriteArrayList<>() // Lista Thread-Safe
        );
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCriador() {
        return criador;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public LocalDateTime getDataFim() {
        return dataFim;
    }

    public List<OpcaoVoto> getOpcoes() {
        return opcoes;
    }

    /*
    public StatusEnquete getStatus() {
        LocalDateTime agora = LocalDateTime.now();

        if (agora.isBefore(dataCriacao)) {
            return StatusEnquete.NAO_INICIADA;
        } else if (agora.isAfter(dataFim)) {
            return StatusEnquete.FINALIZADA;
        } else {
            return StatusEnquete.EM_ANDAMENTO;
        }
    }
    */
}
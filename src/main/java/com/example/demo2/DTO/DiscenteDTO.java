package com.example.demo2.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DiscenteDTO {
    private Integer id;
    private String nome;
    private String cognome;
    private String matricola;
    private String dataNascita;
    private List<CorsoDTO> corsi;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setid(Integer id) {
        this.id = id;
    }

    public Integer getid() {
        return id;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public String getMatricola() {
        return matricola;
    }
    public void setData_nascita(String dataNascita) {this.dataNascita = dataNascita;}

    public String getData_nascita() {
        return dataNascita;
    }
    public void setCorsi(List<CorsoDTO> corsi) {
        this.corsi = corsi;
    }
    public List<CorsoDTO> getCorsi() {
        return corsi;
    }

}

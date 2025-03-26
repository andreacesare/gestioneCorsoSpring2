package com.example.demo2.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CorsoDTO {
    private Integer id;
    private String nome;
    private String dataInizio;
    private String durata;
    private DocenteDTO docente;
    public List<DiscenteDTO> discenti;

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {this.nome = nome;}
    public String getData_inizio() {
        return this.dataInizio;
    }
    public void setData_inizio(String data_inizio) {this.dataInizio = data_inizio;}
    public String getDurata() {return this.durata;}
    public void setDurata(String durata) {this.durata = durata;}
    public Integer getId() {return this.id;}
    public void setId(int id) {this.id = id;}
    public DocenteDTO getDocente() {return this.docente;}
    public void setDocente(DocenteDTO docente) {this.docente = docente;}
    public List<DiscenteDTO> getDiscenti() {return this.discenti;}
    public void setDiscenti(List<DiscenteDTO> discenti) {
        this.discenti = discenti;
    }
}

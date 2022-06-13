/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anhembi.a3.models;

import java.util.ArrayList;

/**
 *
 * @author TheBl
 */
public class Evento {
    private static int id = 0;
    private int eventoID;
    private String nome;
    private String data;
    private String modalidade;
    private ArrayList<Atleta> participantes = new ArrayList<>();

    public Evento(String nome, String data, String modalidade, ArrayList<Atleta> participantes){
        id++;
        this.eventoID = id;
        this.nome = nome;
        this.data = data;
        this.modalidade = modalidade;
        this.participantes = participantes;
    }

    public int getId() {
        return eventoID;
    }

    public ArrayList<Atleta> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Atleta> participantes) {
        this.participantes = participantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }
    
    
}

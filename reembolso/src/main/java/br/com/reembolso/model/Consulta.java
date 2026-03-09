package br.com.reembolso.model;

public class Consulta {

    private double valor;
    private Paciente paciente;

    public Consulta(double valor, Paciente paciente){
        this.valor = valor;
        this.paciente = paciente;
    }

    public double getValor(){
        return valor;
    }

    public Paciente getPaciente(){
        return paciente;
    }
}
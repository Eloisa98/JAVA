package br.com.reembolso.service;

import br.com.reembolso.interfaces.*;
import br.com.reembolso.model.Consulta;

public class CalculadoraReembolso {

    private PlanoSaude plano;
    private HistoricoConsultas historico;
    private Auditoria auditoria;
    private AutorizadorReembolso autorizador;

    public CalculadoraReembolso(
            PlanoSaude plano,
            HistoricoConsultas historico,
            Auditoria auditoria,
            AutorizadorReembolso autorizador){

        this.plano = plano;
        this.historico = historico;
        this.auditoria = auditoria;
        this.autorizador = autorizador;
    }

    public double calcular(Consulta consulta){

        if(!autorizador.autorizar(consulta)){
            throw new RuntimeException("Consulta não autorizada");
        }

        double percentual = plano.getPercentualCobertura();
        double valor = consulta.getValor();

        double reembolso = valor * percentual;

        if(reembolso > 150){
            reembolso = 150;
        }

        historico.adicionarConsulta(consulta);
        auditoria.registrarConsulta(consulta);

        return reembolso;
    }

}
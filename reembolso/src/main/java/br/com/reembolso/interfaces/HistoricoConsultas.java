package br.com.reembolso.interfaces;

import br.com.reembolso.model.Consulta;

public interface HistoricoConsultas {

    void adicionarConsulta(Consulta consulta);

    int totalConsultas();

}
package br.com.reembolso.interfaces;

import br.com.reembolso.model.Consulta;

public interface Auditoria {

    void registrarConsulta(Consulta consulta);

}
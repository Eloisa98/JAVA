package br.com.reembolso.spy;

import br.com.reembolso.interfaces.Auditoria;
import br.com.reembolso.model.Consulta;

public class AuditoriaSpy implements Auditoria {

    public boolean chamado = false;

    @Override
    public void registrarConsulta(Consulta consulta){
        chamado = true;
    }

}
package br.com.reembolso.interfaces;

import br.com.reembolso.model.Consulta;

public interface AutorizadorReembolso {

    boolean autorizar(Consulta consulta);

}
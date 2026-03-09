package br.com.reembolso.helper;

import br.com.reembolso.model.*;

public class TestHelper {

    public static Consulta criarConsultaPadrao(){

        Paciente paciente = new Paciente("João");

        return new Consulta(200, paciente);

    }

}
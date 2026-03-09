package br.com.reembolso.fake;

import java.util.ArrayList;
import java.util.List;
import br.com.reembolso.interfaces.HistoricoConsultas;
import br.com.reembolso.model.Consulta;

public class HistoricoConsultasFake implements HistoricoConsultas {

    private List<Consulta> consultas = new ArrayList<>();

    @Override
    public void adicionarConsulta(Consulta consulta){
        consultas.add(consulta);
    }

    @Override
    public int totalConsultas(){
        return consultas.size();
    }

}
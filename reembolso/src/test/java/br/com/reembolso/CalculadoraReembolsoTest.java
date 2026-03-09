package br.com.reembolso;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.mockito.Mockito;

import br.com.reembolso.interfaces.*;
import br.com.reembolso.model.*;
import br.com.reembolso.service.CalculadoraReembolso;
import br.com.reembolso.fake.HistoricoConsultasFake;
import br.com.reembolso.spy.AuditoriaSpy;
import br.com.reembolso.helper.*;

public class CalculadoraReembolsoTest {

    @Test
    public void deveCalcularReembolso(){

        PlanoSaude plano = () -> 0.7;

        HistoricoConsultasFake historico = new HistoricoConsultasFake();

        AuditoriaSpy auditoria = new AuditoriaSpy();

        AutorizadorReembolso autorizador = Mockito.mock(AutorizadorReembolso.class);

        Mockito.when(autorizador.autorizar(Mockito.any())).thenReturn(true);

        CalculadoraReembolso calc =
                new CalculadoraReembolso(plano, historico, auditoria, autorizador);

        Consulta consulta = TestHelper.criarConsultaPadrao();

        double resultado = calc.calcular(consulta);

        assertTrue(ComparadorDouble.igual(resultado, 140));

    }

}
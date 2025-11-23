package meuempresa.supermercado;

public class Esfera {
    public double raio;

    public double calcularVolume() {
        return (4.0 / 3.0) * Math.PI * raio * raio * raio;
    }
}

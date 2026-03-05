package Carroazulzinho.model;

public class Carro {
    private String cor;
    private String modelo;
    private String marca;
    private double velocidadeAtual;

    public Carro(String modelo, String marca) {
        this.cor = "Azul";
        this.modelo = modelo;
        this.marca = marca;
        this.velocidadeAtual = 0.0;
    }

    // Método Acelerar com Regra de Negócio
    public void acelerar(double incremento) {
        if (incremento > 0) {
            this.velocidadeAtual += incremento;
            System.out.println("Acelerando... Velocidade atual: " + this.velocidadeAtual + " km/h");
        } else {
            System.out.println("Erro: O valor de aceleração deve ser positivo.");
        }
    }

    // Método Frear com Regra de Negócio
    public void frear(double decremento) {
        if (decremento <= 0) {
            System.out.println("Erro: O valor da frenagem deve ser positivo.");
        } else if (this.velocidadeAtual - decremento < 0) {
            this.velocidadeAtual = 0;
            System.out.println("O carro parou (0.0 km/h).");
        } else {
            this.velocidadeAtual -= decremento;
            System.out.println("Freando... Velocidade atual: " + this.velocidadeAtual + " km/h");
        }
    }

    // Getters
    public String getCor() { return cor; }
    public String getModelo() { return modelo; }
    public String getMarca() { return marca; }
    public double getVelocidadeAtual() { return velocidadeAtual; }
}
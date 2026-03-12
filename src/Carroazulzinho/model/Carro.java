package Carroazulzinho.model;

public class Carro {
    private String modelo;
    private double velocidadeAtual;
    private boolean marchaRe;

    public Carro(String modelo) {
        this.modelo = modelo;
        this.velocidadeAtual = 0.0;
        this.marchaRe = false;
    }

    public void setMarchaRe(boolean engatar) {
        if (engatar && this.velocidadeAtual > 0) {
            System.out.println("ALERTA: Nao eh possivel engatar a re com o carro em movimento!");
        } else {
            this.marchaRe = engatar;
            System.out.println("Status da re: " + (this.marchaRe ? "Engatada" : "Desengatada"));
        }
    }

    public boolean isMarchaRe() {
        return marchaRe;
    }

    public void darRe(double forca) {
        if (this.marchaRe) {
            this.velocidadeAtual = forca;
            System.out.println("Deslocamento em re: " + this.velocidadeAtual + " km/h");
        } else {
            System.out.println("ERRO: Marcha re nao detectada.");
        }
    }

    public void acelerar(double incremento) {
        if (!this.marchaRe) {
            this.velocidadeAtual += incremento;
            System.out.println("Velocidade atual: " + this.velocidadeAtual + " km/h");
        } else {
            System.out.println("ERRO: Desengate a re para acelerar para frente.");
        }
    }

    public String getModelo() {
        return modelo;
    }
}
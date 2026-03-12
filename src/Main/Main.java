package Main;

import Carroazulzinho.model.Carro;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Skyline Azul");

        System.out.println("Teste de Seguranca - Marcha Re");

        meuCarro.acelerar(30.0);
        
        System.out.println("Tentando burlar o sistema engatando a re em velocidade...");
        meuCarro.setMarchaRe(true); 

        System.out.println("Verificando se o sistema bloqueou a re: " + !meuCarro.isMarchaRe());
    }
}
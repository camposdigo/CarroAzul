package Main; // Adicionado para bater com a pasta 'Main'

import Carroazulzinho.model.Carro;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Sedan", "Marca X");

        System.out.println("--- Testes de Comportamento (Carro Azul) ---");
        
        // Teste: Aceleração Válida
        meuCarro.acelerar(80);

        // Teste: Regra de Negócio (Limite inferior)
        meuCarro.frear(120); 

        System.out.println("\n--- Testes Finalizados ---");
    }
}
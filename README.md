# Projeto: Modelagem e Comportamento - Classe Carro

Este repositório contém a implementação técnica de um objeto da "Aula Zero", evoluído para uma estrutura de Programação Orientada a Objetos (POO) em Java, utilizando pacotes para organização e regras de negócio para proteção de estado.

# Estrutura de Pacotes
O projeto segue uma organização de camadas para melhor manutenção:
- `Carroazulzinho.model`: Contém a classe de domínio `Carro.java`.
- `Main`: Contém a classe de execução e testes `Main.java`.

# Implementação Técnica

# 1. Encapsulamento e Estado
Os atributos da classe (cor, modelo, marca, velocidade) foram definidos como **privados** (`private`), garantindo que o estado do objeto só possa ser alterado através de métodos controlados.

# 2. Métodos e Regras de Negócio
Foram implementados comportamentos com validações rigorosas (Proteção de Estado):

- **Acelerar:** O método valida se o incremento é positivo. Não é permitido acelerar com valores negativos ou nulos.
- **Frear:** O método impede que a velocidade do veículo se torne negativa. Caso o decremento seja maior que a velocidade atual, o sistema crava o valor em `0.0 km/h`.

# Como Executar
Para compilar e rodar o projeto via terminal:

1. Navegue até a pasta `src`.
2. Compile as classes:
   ```bash
   javac Main/Main.java Carroazulzinho/model/Carro.java

    Execute os testes:
    Bash

    java Main.Main

Arquivos do Projeto

    Carro.java: Lógica do objeto e validações.

    Main.java: Testes automatizados com valores válidos e inválidos.

    diagrama_classe.asta: Modelagem UML atualizada.

Autor: Rodrigo Campos Cordeiro

Sprint: Métodos, Comportamentos e Encapsulamento (Java)

PROJETO CARRO AZUL - SPRINT ENCAPSULAMENTO

Descricao:
Este projeto implementa os conceitos de Programacao Orientada a Objetos com foco em Encapsulamento e Protecao de Estado. O objeto escolhido foi o Carro Azul, evoluido com regras de seguranca reais.

Implementacao de Encapsulamento:

    Todos os atributos da classe Carro (modelo, velocidadeAtual, marchaRe) foram definidos como privados.

    O acesso e a modificacao desses dados ocorrem exclusivamente atraves de metodos Publicos (Getters e Setters).

Regra Especial de Negocio:
Foi implementada uma trava de seguranca no metodo setMarchaRe. O sistema impede o engate da marcha re caso o veiculo esteja em movimento (velocidade maior que 0). Essa validacao garante a integridade do objeto e simula o comportamento de um cambio real.

Instrucoes de Execucao:

    Navegue ate a pasta src.

    Compile: javac Main/Main.java Carroazulzinho/model/Carro.java

    Execute: java Main.Main

Arquivos do Repositorio:

    Carro.java: Classe com atributos privados e logica de protecao.

    Main.java: Classe de teste que demonstra o bloqueio da marcha re em velocidade.

    CarroAzul.asta: Diagrama de classes UML atualizado.

Autor: Rodrigo Campos Cordeiro

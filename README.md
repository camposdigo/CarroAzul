# Modelagem de Objeto: Classe Carro

Este repositório apresenta a transição entre a abstração mental de um objeto cotidiano e sua estruturação lógica em Programação Orientada a Objetos (POO). O projeto utiliza a modelagem UML para definir a estrutura e o Python para a implementação técnica.

# Objetivo
O exercício consiste em identificar Atributos (estado) e Métodos (comportamento) de um objeto real, aplicando os fundamentos de encapsulamento e definição de classes.

# Modelagem UML
A classe foi estruturada no software Astah, definindo a visibilidade e os tipos de dados para cada componente.



# Atributos (Estado)
- cor: String (Valor definido: "Azul")
- modelo: String
- marca: String
- velocidade_atual: float

# Métodos (Comportamento)
- acelerar(): Incrementa a velocidade atual.
- frear(): Reduz a velocidade do veículo.
- ligar(): Altera o estado do motor para ativo.

# Implementação em Python
Abaixo, a representação em código da classe modelada no diagrama:

python
class Carro:
    def __init__(self, modelo, marca):
        self.cor = "Azul"
        self.modelo = modelo
        self.marca = marca
        self.velocidade_atual = 0.0
        self.esta_ligado = False

    def ligar(self):
        self.esta_ligado = True
        print("O motor foi ligado.")

    def acelerar(self, incremento):
        if self.esta_ligado:
            self.velocidade_atual += incremento
            print(f"Velocidade atual: {self.velocidade_atual} km/h")
        else:
            print("Não é possível acelerar com o motor desligado.")

    def frear(self):
        self.velocidade_atual = max(0, self.velocidade_atual - 10)
        print(f"Freando. Velocidade: {self.velocidade_atual} km/h")

# Exemplo de instância
meu_carro = Carro("Sedan", "Fabricante X")
meu_carro.ligar()
meu_carro.acelerar(20)

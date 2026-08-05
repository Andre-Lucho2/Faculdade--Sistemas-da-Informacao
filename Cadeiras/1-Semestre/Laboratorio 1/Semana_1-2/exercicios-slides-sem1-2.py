import math
#1-5, 7 e 8 básicos - Não fiz

# 6)
# Crie um programa que pede 5 números inteiros pelo teclado e armazena-os, respectivamente, nas variáveis A, B, C, D e E. Em seguida, faça o que se pede:

# Sabendo que B e C são respectivamente a base e a altura de um triângulo, imprima a área deste triângulo.

# Sabendo que A, B, C e D formam um retângulo, imprima o perímetro deste retângulo.

# Sabendo que E é o valor do raio de um determinado círculo, imprima a área deste círculo.

# print(type(math.pi2))

def areaTriangulo(b, c):
  return (b + c) / 2
  
def perimetroRetangulo(a, b, c, d):
  return a + b + c + d 

def areaCirculo(e):
  return math.pi * math.pow(e,2)

opcao = -1

while opcao != 0:

  opcao = int(input('Digite uma das opcoes abaixo:  \n1- Calcular área do triângulo \n2- Calcular perímetro do retângulo \n3- Calcular área do círculo \n0-Sair\n'))

  match opcao:
    case 1:
      b = int(input('Insira o segundo lado do triângulo:')) 
      c = int(input('Insira o terceiro lado do triângulo:'))
      triangulo = areaTriangulo(b,c)
      print('A área do triângulo é:',triangulo,'\n')
    case 2:
      a = int(input('Insira o primeiro lado do retângulo:'))
      b = int(input('Insira o segundo lado do retângulo:'))
      c = int(input('Insira o terceiro lado do retângulo:'))
      d = int(input('Insira o quarto lado do retângulo:'))
      perimetro = perimetroRetangulo(a, b, c, d)
      print('O perímetro do retângulo é:',perimetro,'\n')
    case 3:
      e = int(input('Insira o raio lado do circulo:'))
      circulo = areaCirculo(e)
      print('A área do triângulo é:',circulo,'\n')
    case 0:
      print('Encerrando...','\n')
    case _:
      print('Opção inválida, tente novamente...\n')
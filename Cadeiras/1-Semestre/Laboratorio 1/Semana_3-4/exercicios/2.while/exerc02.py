# Exercício 8. Crie um programa que pergunta para o usuário (via Teclado) quantos números ele irá digitar e armazena em uma variável chamada quant. Logo após, faça com que o usuário digite quant números inteiros, e para cada número digitado imprima na tela se o número é negativo, positivo ou zero.

# A)
# -----

'''
quant = int(input('Quantos números você gostaria de verificar?'))
listaNumeros = []
cont = 0

if quant != 0:
  while cont < quant:
    numero = float(input('Digite os números:'))
    listaNumeros.append(numero)
    cont +=1

  print('Os numeros digitados foram: ' + str(listaNumeros))

  cont = 0
  while cont < quant:

    if listaNumeros[cont] == 0:
      print('O numéro é zero')
    elif listaNumeros[cont] < 0:
      print(f'O numéro {listaNumeros[cont]} é negativo')
    else: 
      print(f'O numéro {listaNumeros[cont]} é positivo')
    
    cont +=1  

else:
  print('O numéro de dígitos a verificar deve ser diferente de zero')    
'''
  

# B) 
# com for (assumindo funcao de forEach), range() e map:
# ------------------------------------------------------

'''
quant1 = int(input('Quantos números você gostaria de verificar?'))
listaNumeros1 = []

if quant1 != 0:
  for i in range(quant1):
    numero1 = float(input(f'Digite o {i+1}º número:'))
    listaNumeros1.append(numero1)

  print('Os numeros digitados foram: ' + ', '.join(map(str, listaNumeros1)))
  # print('Os numeros digitados foram: ' + ', '.join([str(n) for n in listaNumeros1]))

  for num in listaNumeros1:
    if num == 0:
      print('O numéro é zero')
    elif num < 0:
      print(f'O numéro {num} é negativo')
    else: 
      print(f'O numéro {num} é positivo')
    
else:
  print('O numéro de dígitos a verificar deve ser diferente de zero')    

'''
# C) 
# Mais conscisso:
# ----------------

'''
quant2 = int(input('Quantos números você gostaria de verificar?'))

if quant2 != 0:
  lista2 = [float(input(f'Digite o {i+1}º número:')) for i in range(quant2)]

  # print('Os numeros digitados foram: ' + ', '.join(map(str, listaNumeros1)))
  print('Os numeros digitados foram: ' + ', '.join([str(n) for n in lista2]))

  for num in lista2:
    if num == 0:
      print('O numéro é zero')
    elif num < 0:
      print(f'O numéro {num} é negativo')
    else: 
      print(f'O numéro {num} é positivo')
    
else:
  print('O numéro de dígitos a verificar deve ser diferente de zero')    

'''

# Exercício 10. Crie um programa que faça a soma dos valores de 0 até 198.

# A)
# -----

'''
cont = 0
soma = 0
while cont <= 198:
  soma += cont
  cont += 1
print(soma)
'''

# B)
# -----

from functools import reduce
# print(reduce(lambda acc, num: acc + num, range(199), 0))


# C)
# Mais utilizado para somas de uma lista
# --------------------------------------------

# print(sum(range(199)))

'''

Reduce em JS:
-------------
lista = [0, 1, 2];

soma = lista.reduce((acc, num) => {
  return acc + num;
}, 0);

console.log(soma);

'''

# Exercício 14. Crie um programa que diga se o número informado pelo usuário é primo ou não.

num = int(input("Digite um valor inteiro: "))
isPrimo = True
cont = 2
while cont < num:
  if num % cont == 0:
    isPrimo = False
    break
  cont += 1

if isPrimo:
  print("É primo!")
else:
  print("Não é primo!")


# Exercício 15. Crie um programa que imprime os números primos entre 0 e 200, imprimindo ao final a soma destes números.
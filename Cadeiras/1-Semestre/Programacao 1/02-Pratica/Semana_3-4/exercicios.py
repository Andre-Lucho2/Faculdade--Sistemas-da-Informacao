import string
#1
# Crie um programa que recebe um inteiro pelo teclado e imprime se ele é par ou ímpar.

def parOuImpar():
  try:
    numero = int(input('Digite um número para ver se o mesmo é par ou ímpar: '))

    if numero < 0:
      print(f'O número {numero} é um número negativo')
    elif numero == 0:
      print(f'O número é zero')
    elif numero % 2 == 0:
      print(f'O número {numero} é par')
    else:
      print(f'O número {numero} é ímpar')
  except ValueError:
    print('Erro: Digite um número inteiro')

# parOuImpar()

#5
# Crie um programa que solicita que o usuário digite uma letra e imprime na tela se a letra é uma vogal ou uma consoante.

# a)

def vogalOuConsoante():
  vogais = 'aeiou'

  letra_digitada = input('Digite uma letra do alfabeto: ').lower()

  if len(letra_digitada) != 1 or not letra_digitada.isalpha():
    print("Por favor, digite apenas uma única letra e que ela seja válida.")
    return
  # filtrando pela quant de caracteres digitados pelo usuário se ele digitou qualquer outro caractere não alfabético

  elif letra_digitada in vogais:
    print(f"A letra '{letra_digitada}' é uma vogal!")
  else:
    print(f"A letra '{letra_digitada}' é uma consoante!")

# vogalOuConsoante()


# b)

def vogalOuConsoanteComFor():
  vogais = ['a', 'e', 'i', 'o', 'u']
  vogal = False
  
  letra_digitada = input('Digite uma letra do alfabeto: ').lower()

  if len(letra_digitada) != 1 or not letra_digitada.isalpha():
    print("Por favor, digite apenas uma única letra e que ela seja válida.")
    return

  for loopVogal in vogais:
    if loopVogal == letra_digitada:
      vogal = True
      break

  if vogal:
    print('A letra digitada é uma vogal')
  else:
    print('A letra digitada é uma consoante')

# vogalOuConsoanteComFor()

#8
#Utilizando while, crie um programa que imprime os números de 0 a 1000.

# a = 0

# while a < 1001:
#   print(a)
#   a += 1


# b) com for:
# lista = range(0, 1001)
# for a in lista:
#   print(a)


#9
#Utilizando while, crie um programa que imprime os números pares de 0 a 2000.

# a = 1

# while a < 2001:
#   if a % 2 == 0:
#     print(a)
#   a += 1


#10
# Utilizando while, crie um programa que imprime os números de 0 a 1000 em ordem decrescente (ou seja, de 1000 a 0).

# a = 1000

# while a >= 0:
#   print(a)
#   a -= 1

#14
#  Utilizando for, crie um programa que imprime a tabuada de um número inteiro digitado pelo usuário.

def calculaTabuada():
  num = int(input("Digite o valor para calcular a tabuada:"))
  for i in range(1,11):
    print(num,"x",i,"=",(num*i))

calculaTabuada()
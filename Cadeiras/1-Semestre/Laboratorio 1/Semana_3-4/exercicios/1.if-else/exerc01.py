# Exercício 2. Crie um programa que recebe dois valores inteiros pelo teclado e imprime qual dos dois é maior.
'''
var1 = int(input('Digite o primeiro valor: '))
var2 = int(input('Digite o segundo valor valor: '))

if var1 > var2:
  print('O primeiro numero é maior que o segundo')
else :
  print('O segundo numero é maior que o primeiro')

'''


# Exercício 4. Crie um programa que recebe três valores inteiros pelo teclado e imprime qual dos três é menor.

'''
a = int(input('Digite o primeiro valor: '))
b= int(input('Digite o segundo valor: '))
c = int(input('Digite o terceiro valor: '))

if a == b and b== c:
    print('Os três números são iguais')
elif a < b and a < c:
    print('O primeiro número é o menor')
elif b < a and b < c:
    print('O segundo número é o menor')
elif c < a and c < var2:
    print('O terceiro número é o menor')
elif a == b and a < c:
    print('O primeiro e o segundo são os menores (empate)')
elif a == c and a < var2:
    print('O primeiro e o terceiro são os menores (empate)')
else:  # b== c and b < a
    print('O segundo e o terceiro são os menores (empate)')

'''
# opção de hierarquia das 3 variáveis:
'''
# Caso 1: Todos iguais
if var1 == var2 == var3:
    print("Os três números são iguais.")

# Caso 2: var1 é o maior
elif var1 >= var2 and var1 >= var3:
    if var2 >= var3:
        print(f"Ordem: var1 ({var1}) >= var2 ({var2}) >= var3 ({var3})")
    else:
        print(f"Ordem: var1 ({var1}) >= var3 ({var3}) >= var2 ({var2})")

# Caso 3: var2 é o maior
elif var2 >= var1 and var2 >= var3:
    if var1 >= var3:
        print(f"Ordem: var2 ({var2}) >= var1 ({var1}) >= var3 ({var3})")
    else:
        print(f"Ordem: var2 ({var2}) >= var3 ({var3}) >= var1 ({var1})")

# Caso 4: var3 é o maior (Se não for var1 nem var2, só resta o var3)
else:
    if var1 >= var2:
        print(f"Ordem: var3 ({var3}) >= var1 ({var1}) >= var2 ({var2})")
    else:
        print(f"Ordem: var3 ({var3}) >= var2 ({var2}) >= var1 ({var1})")
'''

# Exercício 7. Crie um programa que recebe um valor inteiro referente a um determinado ano. Imprima na tela se o ano informado é bissexto ou não.


usuario_ano = int(input('Digite o ano para verificar se ele é bissexto: '))

if usuario_ano % 4 == 0:
    if usuario_ano % 100 == 0:
        if usuario_ano % 400 == 0:
            print('O ano digitado é um ano bissexto')
            exit()
        else:
            print('O ano digitado NÃO É um ano bissexto')
            exit()
    print('O ano digitado é um ano bissexto')
else:
    print('O ano digitado NÃO É um ano bissexto')


# outra forma de fazer:
'''
ano = int(input('Digite o ano para verificar se ele é bissexto: '))

if (ano % 4 == 0 and ano % 100 != 0) or (ano % 400 == 0):
    print('O ano digitado é um ano bissexto')
else:
    print('O ano digitado NÃO É um ano bissexto')
'''


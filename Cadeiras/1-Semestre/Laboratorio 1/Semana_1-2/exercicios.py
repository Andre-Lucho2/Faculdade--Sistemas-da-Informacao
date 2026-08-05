# 
# 1) Peça o nome do usuário e imprima: Olá <nome do usuário>! Seja bem-vindo ao Python

# nome = input('Digite seu nome:')
# print('Olá ' + nome + '! Seja bem-vindo ao Python')


# 2)  Peça 2 números inteiros e mostre a soma

numero1 = int(input('Digite o primeiro numero:'))
numero2 = int(input('Digite o segundo numero:'))

soma = numero1 + numero2
print('A soma dos numeros é igual a: ' + str(soma)) # **
print('A soma dos numeros é igual a:',soma) # valores separados por vírgula dão espaço

# ** - concatenado str + str (soma é int = preciso tranformar)

# nomes = ['1', 'suco', '3', '4']
# for a in nomes:
#   print(a)
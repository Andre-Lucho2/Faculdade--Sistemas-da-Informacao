# Exercicio 7
# Para cada situação abaixo, escreva um trecho de código para solicitar que o usuário digite tais dados e eles sejam armazenados na memória de forma correta (em relação ao tipo do dado):

# a) solicitar o nome do usuário 
# nome = input("Digite seu nome: ")
# # método input já retorna string

# # b) solicitar a idade do usuário  
# idade = int(input("Digite sua idade: "))

# # c) solicitar o peso do usuário
# peso = float(input("Digite seu peso: "))

# Exercício 8. Para os itens abaixo, crie o código solicitado:

# a) solicitar ao usuário 2 valores reais e imprimir na tela o resultado da divisão de um pelo outro com 2 casas decimais  
valor1 = float(input('Digite o primeiro numero real: '))
valor2 = float(input('Digite o segundo numero real: '))

divisao = valor1/valor2

print(f'resultado da divisão é: {divisao:.2f}')

# b) solicitar ao usuário 2 valores reais e imprimir na tela o resultado da divisão de um pelo outro com 3 casas decimais
print(f'resultado da divisão é: {divisao:.3f}')

# c) solicitar ao usuário 2 valores reais e imprimir na tela o resultado da divisão de um pelo outro com 4 casas decimais
print(f'resultado da divisão é: {divisao:.4f}')
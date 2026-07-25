# 1
'''
lista = []

for i in range(101):
  lista.append(i)
  
# print(', '.join(map(str, lista)))
# print(', '.join([str(n) for n in lista]))
'''


# 2 Exercício 2. Crie um programa que imprime na tela todos os valores entre dois valores digitados pelo teclado.
'''
valor1 = int(input('Digite o primeiro valor: '))
valor2 = int(input('Digite o segundo valor: '))

numeros = []

for n in range(valor1 + 1, valor2):
  numeros.append(n)
  
print('Os valores entre os números digitados são: ' + ', '.join([str(n) for n in numeros]))

'''

# Exercício 4. Sabendo que uma string é uma lista de letras, peça para o usuário digitar um texto e imprima na tela a quantidade de vogais que existem no texto.

# A)
'''
inputTexto = input('Digite o seu texto para vermos a quantidade de vogais existentes: ')

vogais = ['a', 'e', 'i', 'o', 'u']
cont = 0

for letra in inputTexto:
  if letra in vogais:
    cont +=1
    print(letra)

print(f'Total de vogais encontradas = {cont}')
'''

# B) Mais conciso
'''
inputTexto1 = input('Digite o seu texto para vermos a quantidade de vogais existentes: ')
vogais1 = ['a', 'e', 'i', 'o', 'u']

# Criamos uma lista só com o que passou no "filtro" e medimos o tamanho dela
vogaisEncontradas = [letra2 for letra2 in inputTexto1 if letra2 in vogais1]

print(', '.join(vogaisEncontradas))
print(f"Total de vogais: {len(vogaisEncontradas)}")
'''
# C)
#Com filter()
'''
inputTexto2 = input('Digite o seu texto para vermos a quantidade de vogais existentes: ')
vogais2 = ['a', 'e', 'i', 'o', 'u']

# O filter recebe: (função de teste, o que testar) : filtre = para cada 'x', verifique se 'x' está em 'vogais2' e retone sim ou não a partir da lista 'inputTexto2'
# "lambda x: x in vogais1" faz exatamente o papel do seu "if letra in vogais" acima.

filtroVogais = filter(lambda x: x in vogais2, inputTexto2)

vogaisEncontradas2 = list(filtroVogais)

print('Vogais encontradas: ' + ', '.join(vogaisEncontradas2))
print(f"Total de vogais: {len(vogaisEncontradas2)}")

'''
# Exercício 6. Crie um programa que solicita o nome e o estado civil de 20 pessoas pelo teclado. Ao final, imprima apenas o nome das pessoas separadas por estado civil: solteiras, casadas, divorciadas e viúvas (nesta ordem!)

# pessoal = {
#   "nome": "",
#   "estadoCivil": [],
# }

# def atualizaCadastro(usuario, novo_estadoCivil):
#   novo_usuario = usuario.copy()
#   novo_usuario['estadoCivil'] = +novo_estadoCivil
#   return novo_usuario



dados = {
    "solteiro": [],
    "casado": [],
    "divorciado": [],
    "viuvo": []
}


# for i in range(20):
#     print(f"--- Pessoa {i+1} ---")
#     nome = input("Digite o nome: ")
    
#     estado = input("Estado civil (solteiro, casado, divorciado, viuvo): ").lower()

#     # Adicionamos o nome na lista correspondente dentro do nosso dicionário
#     if "solteiro" in estado:
#         dados["solteiro"].append(nome)
#     elif "casado" in estado:
#         dados["casado"].append(nome)
#     elif "divorciado" in estado:
#         dados["divorciado"].append(nome)
#     elif "viuvo" in estado or "viúvo" in estado or "viuva" in estado or "viúva" in estado:
#         dados["viuvo"].append(nome)

print(dados)
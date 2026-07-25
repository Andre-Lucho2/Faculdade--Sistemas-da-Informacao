# Exercício 2: Crie um método chamado maiorValor que recebe 3 valores por parâmetro (assumaque serão inteiros) e retorna o maior dos três valores.

def maiorValor(a, b, c):
    # print(min([a, b, c])) --> menor valor
    print(max([a, b, c]))


# maiorValor(10,2,53)

# Exercício 3: Crie um método que recebe um valor por parâmetro (assuma que será inteiro) e retorna a soma de todos os valores entre 0 e o valor recebido. Caso o valor seja negativo, o método deve retornar -1.

def somaDeValores(valor):
    print(sum(range(0, valor + 1)))

# somaDeValores(5)

# Exercício 5: Crie um método que recebe uma lista por parâmetro e imprime os elementos da lista recebida.

def imprimeLista(lista):
    valores = []
    for i in lista:
        valores.append(str(i))

    print(', '.join(valores))  
    

lista = [1, 2, 3]

# imprimeLista(lista)

# Exercício 6: Crie um método que recebe uma lista por parâmetro (assuma que será uma lista de string), que:
# a) conte os caracteres de cada string; 
# b) retorne a menor string da lista (com menos caracteres).

# a.1)

lista_strings = ['andre', 'pedro', 'joao', 'guilherme']

def menorString(lista):
    menor = lista[0]
    
    for palavra in lista:
        if len(palavra) < len(menor):
            menor = palavra
    return menor

# a.2)

def menorString2(lista):
    return min(lista, key=len)


# b.1)

def contarCaracteres(lista):
    nova_lista = []
    for palavra in lista:
        nova_lista.append(len(palavra))
    
    print(nova_lista)
    
# b.2)

def contarString2(lista):
    return len(lista)



# print(menorString(lista_strings))
# print(menorString2(lista_strings))

# print(contarString(lista_strings))
print(contarString2(lista_strings))
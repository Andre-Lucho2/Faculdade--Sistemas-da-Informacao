# pet = input("Você gostaria de adotar um cachorro ou um gato? Digite C para cachorro ou G para gato. ")

# while pet != "C" and pet != "G":
#     print("\n[ERRO] Digite C ou G")
#     pet = input("Você gostaria de adotar um cachorro ou um gato? Digite C para cachorro ou G para gato. ")


# def maiorValor(n):
#     lista = []
#     for i in range(0, n):
#         lista.append(input("Digite um valor: "))
#     return lista

# print(maiorValor(3))

# for i in range(11):
#     print(i)

turno = input("Digite o turno (M para manhã, T para tarde e N para noite): ")

if turno == "M" or turno == "m":
    print("bom dia!")
elif turno == "T" or turno == "t":
    print("boa tarde!")
elif turno == "N" or turno == "n":
    print("boa noite!")
else:
    print("turno inválido!")
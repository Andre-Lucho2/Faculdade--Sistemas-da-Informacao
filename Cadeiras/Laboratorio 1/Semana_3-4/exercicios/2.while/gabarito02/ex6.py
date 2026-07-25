cont = 0
numeros = ""
while cont < 20:
  valor = float(input("Digite um valor com ponto flutuante:"))
  numeros = numeros + str(valor)+ "\n"
  cont += 1
print("Valores digitados:\n"+numeros)
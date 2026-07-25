quant = int(input("Quantos valores serão digitados?\n"))
cont = 0
while cont < quant:
  numero = int(input("Digite um valor: "))
  if numero == 0:
    print("Zero")
  elif numero > 0:
    print("Positivo")
  else:
    print("Negativo")
  cont += 1
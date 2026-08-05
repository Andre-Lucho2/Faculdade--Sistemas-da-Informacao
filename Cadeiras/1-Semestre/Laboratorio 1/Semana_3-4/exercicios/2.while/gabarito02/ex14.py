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

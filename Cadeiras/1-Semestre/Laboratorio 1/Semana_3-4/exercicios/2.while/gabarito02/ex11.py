valor1 = int(input("Digite o primeiro valor: "))
valor2 = int(input("Digite o segundo valor: "))

somaPares = 0
somaImpares = 0

if valor1 < valor2:
  cont = valor1
  while cont < valor2:
    if cont % 2 == 0:
      somaPares += cont
    else:
      somaImpares += cont
    cont += 1
else:
  print("[ERRO] Valor1 >= Valor2")
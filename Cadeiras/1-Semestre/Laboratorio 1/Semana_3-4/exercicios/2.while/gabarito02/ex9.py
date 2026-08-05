val1 = int(input("Digite o primeiro valor: "))
val2 = int(input("Digite o segundo valor: "))

if val1 >= 0 and val2 >= 0:
  menor = val1
  maior = val2
  if val1 > val2:
    menor = val2
    maior = val1
  cont = menor
  while cont <= maior:
    if cont % 2 == 0:
      print(cont)
    cont += 1
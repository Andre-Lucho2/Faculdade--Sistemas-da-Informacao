cont = 0
contGremistas = 0
while cont < 10:
  time = input("Digite seu time: ")
  if time == "Grêmio":
    contGremistas += 1
  cont += 1
print("Quantidade de gremistas:",contGremistas)
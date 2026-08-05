total = 0
quant = 0

while True:
  valor = int(input("Digite um valor positivo (negativo para sair): "))
  if valor < 0:
    break
  total += valor
  quant += 1

print("Média dos valores digitados:",(total/quant))
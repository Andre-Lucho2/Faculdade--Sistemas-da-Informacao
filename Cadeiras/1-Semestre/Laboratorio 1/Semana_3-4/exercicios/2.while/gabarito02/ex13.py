num = int(input("Digite um valor inteiro: "))

if num >= 0:
  if num == 0 or num == 1:
    print("Fatorial de",num,"é 1")
  else:
    cont = num
    fatorial = 1
    while cont > 1:
      fatorial *= cont #fatorial = fatorial * cont
      cont -= 1
    print("Fatorial de",num,"é",fatorial)
else:
  print("[ERRO] Valor deve ser positivo =/")

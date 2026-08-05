# 1:

# lista = [1, 2, 3, 4, 5]
# for i in lista:
#   print(i)

# # com range():
# for j in range(1,6):
#   print(j)

# 2:

lista2 = []

lista2.append('nome')
lista2.append('endereco')
lista2.append('cep')

for k in lista2:
  print(k)


# OBS.:
# -------

# método '.append' = '.push' do JS (exceto que só add 1 elemento em python)
# ----------------------------------------------------------------------

# para múltiplos elementos --> usar método '.extend()'
#---------------------------------------------

lista2.extend(['casa', 'escritorio'])

for k in lista2:
  print(k)


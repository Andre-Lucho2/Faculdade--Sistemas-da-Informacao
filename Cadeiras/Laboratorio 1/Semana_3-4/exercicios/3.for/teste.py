# Equivalente em Python de teste.js

# 1) 

obj1 = {
    'nomes': ['andre', 'larissa', 'geovane', 'gustavo'],
    'idades': [44, 23, 32, 16],
}

# obj1.nomes.map((n) => console.log(n))  →  for / map em Python
for n in obj1['nomes']:
    print(n)

# 2)
# --- lista de filmes (array de objetos → lista de dicionários) ---

filmes = [
    {
        'titulo': 'Oppenheimer',
        'ano': 2023,
        'elenco': [
            'Cillian Murphy',
            'Emily Blunt',
            'Matt Damon',
            'Robert Downey Jr.',
            'Florence Pugh',
        ],
        'diretor': 'Christopher Nolan',
        'pais': 'EUA',
    },
    {
        'titulo': 'Nomadland',
        'ano': 2020,
        'elenco': ['Frances McDormand', 'David Strathairn', 'Linda May'],
        'diretor': 'Chloé Zhao',
        'pais': 'EUA',
    },
    {
        'titulo': 'Parasite',
        'ano': 2019,
        'elenco': ['Song Kang-ho', 'Lee Sun-kyun', 'Cho Yeo-jeong', 'Choi Woo-shik'],
        'diretor': 'Bong Joon-ho',
        'pais': 'Coreia do Sul',
    },
    {
        'titulo': 'Moonlight: Sob a Luz do Luar',
        'ano': 2017,
        'elenco': ['Mahershala Ali', 'Naomie Harris', 'Trevante Rhodes'],
        'diretor': 'Barry Jenkins',
        'pais': 'EUA',
    },
    {
        'titulo': 'Zona de Interesse',
        'ano': 2024,
        'elenco': [
            'Christian Friedel',
            'Sandra Hüller',
            'Freya Kreutzkam',
            'Max Beck',
            'Steffi Krause',
        ],
        'diretor': 'Jonathan Glazer',
        'pais': 'Reino Unido',
    },
]

# 2.1)
# filmes.forEach((n) => console.log(n.titulo))
for n in filmes:
    print(n['titulo'])

# 2.2)
# filmes.map((n) => { if (n.pais !== 'EUA') console.log(n.diretor) }) # retorno strings

for n in filmes:
    if n['pais'] != 'EUA':
        print(n['diretor'])


# 2.3)
# Com filter:
# --------------

# A) JS
# -----------

# const a = filmes.filter((n) => n.pais !== 'EUA').map((n) => n.diretor) # retorno array com strings 

# B) Python
# -----------

# O filter() é aplicado por dentro e o map() é aplicado por fora — de dentro pra fora, ao contrário da leitura encadeada do JS
b = map(lambda x: x['diretor'], filter(lambda x: x['pais'] != 'EUA', filmes))
print(list(b))


# B.1) list comprehension em Python
# ----------------------------------------

a = [n['diretor'] for n in filmes if n['pais'] != 'EUA']
print(a)



# 3)
# ------
# --- filmesObj (objeto com chaves numéricas → dicionário aninhado) ---

filmes_obj = {
    '01': {
        'titulo': 'Oppenheimer',
        'ano': 2023,
        'elenco': [
            'Cillian Murphy',
            'Emily Blunt',
            'Matt Damon',
            'Robert Downey Jr.',
            'Florence Pugh',
        ],
        'diretor': 'Christopher Nolan',
        'pais': 'EUA',
    },
    '02': {
        'titulo': 'Nomadland',
        'ano': 2020,
        'elenco': ['Frances McDormand', 'David Strathairn', 'Linda May'],
        'diretor': 'Chloé Zhao',
        'pais': 'EUA',
    },
}

# --- obj com aninhamento ---
obj = {
    'lista': {'nomes': ['Andre', 'luciano']},
    'idade': 44,
}

# console.log(filmesObj['01'].titulo)  →  acesso por chave
# print(filmes_obj['01']['titulo'])

# # console.log(obj.lista.nomes)  →  acesso aninhado por chave
# print(obj['lista']['nomes'])

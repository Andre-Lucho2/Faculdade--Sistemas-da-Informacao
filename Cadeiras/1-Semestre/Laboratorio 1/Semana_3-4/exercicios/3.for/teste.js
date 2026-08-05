const obj1 = {
  nomes: ['andre', 'larissa', 'geovane', 'gustavo'],
  idades: [44, 23, 32, 16],
};

obj1.nomes.map((n) => console.log(n));

const filmes = [
  {
    titulo: 'Oppenheimer',
    ano: 2023,
    elenco: [
      'Cillian Murphy',
      'Emily Blunt',
      'Matt Damon',
      'Robert Downey Jr.',
      'Florence Pugh',
    ],
    diretor: 'Christopher Nolan',
    pais: 'EUA',
  },
  {
    titulo: 'Nomadland',
    ano: 2020,
    elenco: ['Frances McDormand', 'David Strathairn', 'Linda May'],
    diretor: 'Chloé Zhao',
    pais: 'EUA',
  },
  {
    titulo: 'Parasite',
    ano: 2019,
    elenco: ['Song Kang-ho', 'Lee Sun-kyun', 'Cho Yeo-jeong', 'Choi Woo-shik'],
    diretor: 'Bong Joon-ho',
    pais: 'Coreia do Sul',
  },
  {
    titulo: 'Moonlight: Sob a Luz do Luar',
    ano: 2017,
    elenco: ['Mahershala Ali', 'Naomie Harris', 'Trevante Rhodes'],
    diretor: 'Barry Jenkins',
    pais: 'EUA',
  },
  {
    titulo: 'Zona de Interesse',
    ano: 2024,
    elenco: [
      'Christian Friedel',
      'Sandra Hüller',
      'Freya Kreutzkam',
      'Max Beck ',
      'Steffi Krause',
    ],
    diretor: 'Jonathan Glazer',
    pais: 'Reino Unido',
  },
];

filmes.forEach((n) => console.log(n.titulo));

filmes.map((n) => {
  if (n.pais !== 'EUA') console.log(n.diretor);
});
// retorno strings

const a = filmes.filter((n) => n.pais !== 'EUA').map((n) => n.diretor);
console.log(a);
// retorno array com strings

const filmesObj = {
  '01': {
    titulo: 'Oppenheimer',
    ano: 2023,
    elenco: [
      'Cillian Murphy',
      'Emily Blunt',
      'Matt Damon',
      'Robert Downey Jr.',
      'Florence Pugh',
    ],
    diretor: 'Christopher Nolan',
    pais: 'EUA',
  },
  '02': {
    titulo: 'Nomadland',
    ano: 2020,
    elenco: ['Frances McDormand', 'David Strathairn', 'Linda May'],
    diretor: 'Chloé Zhao',
    pais: 'EUA',
  },
};

const obj = {
  lista: { nomes: ['Andre', 'luciano'] },
  idade: 44,
};

console.log(filmesObj['01'].titulo);
console.log(obj.lista.nomes);

# Construção de uma Tabela Verdade de um circuito lógico

A analogia do odômetro (ou do relógio) é excelente porque ela explica o **mecanismo automático** que garante que você liste todas as combinações possíveis sem esquecer nenhuma e sem repetir nenhuma.

### 1. O conceito de "Estouro de Base" (Carry Over)

No odômetro do seu carro (que usa a base decimal, de 0 a 9):

* O primeiro disquinho da direita gira: `0, 1, 2, 3, 4, 5, 6, 7, 8, 9`.
* Quando ele chega no limite (`9`) e vai voltar para o `0`, ele "empurra" o disco do lado esquerdo para avançar 1 número.

Na tabela verdade, a base é **binária** (só tem `0` e `1`). O limite é o `1`.

* A coluna **D** (direita) começa em `0` e vai para `1` (atingiu o limite).
* Na próxima linha, a coluna **D** volta para `0` e "empurra" a coluna **C** para virar `1`.

Se você olhar a tabela linha por linha, verá que estamos apenas somando `+1` em binário a cada linha, exatamente como um odômetro soma `+1 km` a cada metro rodado.

### 2. Padrão Visual e Produtividade

**Número de linhas == 2n --> n- numeros de variáveis de entrada**

Pensar na engrenagem do odômetro cria o padrão visual das metades:
Inicia-se pela última coluna( + a direta):

* A última coluna muda a cada **1** linha (2^0) ==> tenho:  0, 1, 0, 1...
* A penúltima coluna muda a cada **2** linhas (2^1) ==> tenho: 0, 0, 1, 1...
* A segunda muda a cada **4** linhas (2^2) ==> tenho: 0, 0, 0, 0, 1, 1 ,1 ,1...
* A primeira muda a cada **8** linhas (2^3) ==> tenho: 0, 0, 0, 0, 0, 0, 0, 0, 1, 1 ,1 ,1, 1, 1, 1, 1....
* assim por diante

### 3. Conexão direta com a Arquitetura de Computadores

Mais para a frente no seu curso, você estudará circuitos chamados **Contadores Binários** (feitos com Flip-Flops). O comportamento físico desses componentes em hardware é exatamente esse: um sinal de clock faz o primeiro bit oscilar rápido, e a saída desse bit serve de gatilho para fazer o segundo bit oscilar na metade da velocidade, e assim por diante.
# Funcionamento e Arquitetura da CPU

## 1. Visão Geral da CPU

* **Conceito:** A CPU (*Central Processing Unit* / Unidade Central de Processamento) é considerada o "cérebro" do computador.
* **Componentes Básicos Externos:** Conecta-se à placa-mãe por meio de pinos de entrada e saída (*pins*) para comunicação com os demais periféricos e memórias.
* **Clock (Relógio do Sistema):**
* É um sinal elétrico que alterna entre ligado e desligado a uma taxa constante para sincronizar todas as operações internas.
* **Unidades de Medida:**
* Processadores antigos (ex.: MOS 6502): Operavam em frequências de poucos Hertz ou Megahertz (ex.: ~2 pulsos por segundo na simulação).
* Processadores Modernos: Medidos em **Gigahertz (GHz)** (bilhões de ciclos/pulsos por segundo).


* **Velocidade:** Permite executar bilhões de instruções simples por segundo.

---

## 2. Interação entre CPU, RAM e Periféricos

### 2.1. Memória RAM (*Random Access Memory*)

* Contém os dados e instruções que estão sendo processados pela CPU.
* Estruturada como uma lista de **endereços de memória**, onde cada endereço armazena um dado.
* **Acesso Aleatório:** A CPU costuma ler sequencialmente, mas pode saltar e acessar qualquer endereço de forma direta/aleatória.
* **Linhas de Controle da RAM:**
* **Fio *Enable* (Habilitar):** Quando ativado pela CPU, a RAM lê o endereço solicitado e envia o dado de volta para a CPU.
* **Fio *Set* (Definir/Gravar):** Quando ativado pela CPU junto a um endereço e um dado, a RAM sobrescreve o conteúdo daquele endereço com o novo dado.

### 2.2. Conteúdo Armazenado na RAM

Os dados (representados por sequências binárias de `0`s e `1`s) podem representar:

1. **Instruções:** Comandos a serem executados pela CPU.
2. **Números:** Valores matemáticos para operações.
3. **Endereços:** Referências a outros locais da memória RAM ou identificadores de portas de dispositivos de entrada/saída (ex.: monitor, impressora).
4. **Caracteres/Texto:** Armazenados via códigos de caracteres (ex.: ASCII/Unicode), onde padrões de bits correspondem a letras específicas.

---

## 3. Conjunto de Instruções (*Instruction Set*)

Cada arquitetura de CPU possui um conjunto de instruções próprio que é capaz de entender e executar.

* **Instruções Comuns:**
* **`LOAD`:** Carrega um dado da RAM para os registradores da CPU.
* **`ADD`:** Soma valores carregados.
* **`STORE`:** Grava o resultado de uma operação de volta na RAM.
* **`COMPARE`:** Compara dois valores na ULA (verifica se um é maior ou se são iguais).
* **`JUMP` / `JUMP IF`:** Altera o fluxo de execução sequencial, desviando para outro endereço de memória (condicional ou incondicionalmente).
* **`IN` / `OUT`:** Lê dados de dispositivos de entrada (ex.: teclado) ou envia dados para dispositivos de saída (ex.: monitor).

---

## 4. Arquitetura Interna da CPU (Modelo Scott CPU)

### 4.1. Unidade de Controle (*Control Unit - CU*)

* Atua como o "comando central" da CPU.
* Decodifica as instruções recebidas da RAM e envia sinais de controle (ligando/desligando fios *set* e *enable*) para coordenar os outros componentes.

### 4.2. Unidade Lógica e Aritmética (*Arithmetic Logic Unit - ALU / ULA*)

* Executa todas as operações matemáticas e lógicas.
* Possui duas entradas principais (**Entrada A** e **Entrada B**).
* **Sinalizadores de Condição (*Flags*):**
* Em operações como `COMPARE`, a ULA não produz um resultado numérico no barramento, mas ativa *flags* (ex.: *Flag Igual*, *Flag A é Maior*).
* As *flags* são salvas no **Registrador de *Flags*** e usadas por instruções de desvio (`JUMP IF`).


### 4.3. Registradores (*Registers*)

Pequenas unidades de memória internas de altíssima velocidade usadas para armazenar dados temporariamente durante a execução.

* **Registradores Gerais:** Armazenam dados intermediários das operações.
* **Registrador Temporário:** Armazena uma das entradas da ULA (Entrada B) sem passar pelo barramento principal.
* **Registrador de Instrução (*Instruction Register*):** Armazena a instrução atual que está sendo executada.
* **Registrador de Endereço de Instrução (*Instruction Address Register* / *Program Counter*):** Armazena o endereço da próxima instrução a ser buscada na RAM.
* **Registrador de Endereço de Memória (*Memory Address Register*):** Interface que envia o endereço desejado diretamente para a RAM.

### 4.4. Barramento (*Bus*)

* Conjunto de fios compartilhados que conecta os registradores e componentes internos da CPU.
* **Limitação:** Permite o tráfego de apenas **um dado por vez**.
* O controle do fluxo no barramento é feito ativando os fios de controle (*enable* para colocar o dado no barramento, *set* para gravar o dado do barramento em um registrador).

---

## 5. Armazenamento Permanente vs. Volátil

* **RAM (Memória Volátil):** Perde todo o seu conteúdo quando a alimentação elétrica do computador é desligada.
* **Disco Rígido / SSD (Memória Não Volátil):** Utilizado para armazenar programas e dados de forma permanente quando o computador está desligado.
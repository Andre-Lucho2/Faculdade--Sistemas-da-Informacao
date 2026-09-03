# Algoritmos de escalonamento

## FCFS
- First-Come, Firts-Served

### Caracteristicas
- Os processos que chegam primeiro, sao atendidos primeiro
- O tempo médio de espera entre processos geralmente é bem longo
- Pune processos pequenos:
        Se eles chagerem depois, mesmo que ele aloque um pequeno tempo de CPU, ele deve esperar os demais serem processados
        Ruim especialmente quando temos processos grandes antes
        
- Efeito comboio: todos os outros processos esperam que o grande processo
saia da CPU. Menor utilização da CPU e dos dispositivos.
- Não tem preempção

## SJS
- Shortest-Job Firts

### Caracteristicas
- Prioridade aos processos pequenos
- Tempo medio de espera entre processos tende a ser menor que o FCFS
- Pune processos grandes:
        Se temos mtos processos pequenos e 1 grande, o processo grande vai ter de espera indefinidamente para ser processado
- pode ou nao ter preempçao

## Scheduling por Prioridades
- O algoritmo SJF é um caso especial do algoritmo geral de scheduling por prioridades

### Caracteristicas
- Uma prioridade é associada a cada processo, e a CPU é alocada ao processo com a prioridade mais alta. 
- Processos com prioridades iguais = FCFS. 
- A prioridade (p) é o inverso do próximo pico de CPU (previsto). Quanto maior o pico de CPU, menor a prioridade, e vice-versa. 
- Pode ou nao ter preempçao
- Pode deixar alguns processos de baixa prioridade esperando indefinidamente

## Scheduling Round-Robin
- Projetado para sistemas de tempo compartilhado

### Caracteristicas
A fila de prontos é tratada como uma fila circular. O scheduler da CPU percorre a fila de prontos, alocando a CPU a cada processo por um intervalo de até um quantum de tempo.
- Tem preempção
- O desempenho do RR depende do tamanho do quantum de tempo - se o quantum de tempo é extremamente longo, a política RR é igual à política FCFS. Por outro lado, quando o quantum de tempo é extremamente curto (digamos, 1 milissegundo), a abordagem RR pode resultar em um grande número de mudanças de contexto
- Possui maior tempo médio de processamento do que o SJf, mas uma melhor resposta

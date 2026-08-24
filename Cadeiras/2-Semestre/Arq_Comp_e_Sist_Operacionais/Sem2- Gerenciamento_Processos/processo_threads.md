O Processo é uma unidade de alocação de recursos que possui seu próprio espaço de endereçamento isolado, tabela de arquivos e permissões.
A Thread é a menor unidade programável de execução na CPU. Threads de um mesmo processo compartilham o espaço de memória e código, mas
mantêm sua própria pilha (stack) e registradores.


Exemplo threads em Python

import threading
import multiprocessing
import os
import time
 
 
def tarefa_thread(nome):
    print(f"Thread {nome}")
    print(f"Processo atual: {os.getpid()}")
    time.sleep(2)
    print(f"Thread {nome} terminou")
 
 
def tarefa_processo(nome):
    print(f"Processo {nome}")
    print(f"PID: {os.getpid()}")
    time.sleep(2)
    print(f"Processo {nome} terminou")
 
 
if __name__ == "__main__":
 
    print("=== EXEMPLO COM THREADS ===")
 
    thread1 = threading.Thread(
        target=tarefa_thread,
        args=("A",)
    )
 
    thread2 = threading.Thread(
        target=tarefa_thread,
        args=("B",)
    )
 
    thread1.start()
    thread2.start()
 
    thread1.join()
    thread2.join()
 
    print("\n=== EXEMPLO COM PROCESSOS ===")
 
    processo1 = multiprocessing.Process(
        target=tarefa_processo,
        args=("1",)
    )
 
    processo2 = multiprocessing.Process(
        target=tarefa_processo,
        args=("2",)
    )
 
    processo1.start()
    processo2.start()
 
    processo1.join()
    processo2.join()
 
    print("\nPrograma principal terminou.")

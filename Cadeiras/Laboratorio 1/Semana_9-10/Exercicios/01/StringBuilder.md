## 1. O que é o StringBuilder?

### Diferente da sua versão anterior (que está comentada no código), onde você usava a concatenação direta com o operador +, agora você utiliza a classe StringBuilder.

### - Por que usar: Em Java, strings são "imutáveis". Cada vez que você faz string1 + string2, o Java cria um novo objeto na memória. Em um loop (como o seu for), isso pode gastar muita memória desnecessariamente.

### - Como funciona: O StringBuilder funciona como um "caderno de rascunho". Você vai adicionando textos a ele com o método .append() e, somente no final, ele gera a String definitiva com o .toString().

## 2. Passo a Passo da Implementação

Abaixo está a análise do bloco de código atual:

```
@Override
public String toString() {
    // 1. Inicializa o construtor de strings com o nome da sala
    StringBuilder sb = new StringBuilder("Sala: " + nome);

    // 2. Percorre o array de cadeiras dinamicamente
    for (int i = 0; i < cadeiras.length; i++) {
        // 3. Monta a linha de cada cadeira
        sb.append("\ncadeira0").append(i + 1).append("= ").append(cadeiras[i]);
    }

    // 4. Converte o rascunho em uma String final para o retorno
    return sb.toString();
}

```

## As Vantagens dessa Nova Abordagem

- ### Escalabilidade: Na versão anterior, se a sala passasse a ter 10 cadeiras, você teria que digitar cadeira05, cadeira06, etc., manualmente. Com o for e o array cadeiras, o método funciona automaticamente para qualquer número de cadeiras.
- ### Polimorfismo em Ação: Note que você faz .append(cadeiras[i]). Como o seu array é do tipo Cadeira, mas contém objetos que podem ser CadeiraComMesa ou CadeiraComRodinhas, o Java decide automaticamente qual toString chamar (o da classe mãe ou das classes filhas) para cada item.
- ### Organização Visual: O uso de \n garante que cada cadeira apareça em uma linha nova, facilitando a leitura no terminal quando você chama o comando na sua classe Principal.

## Observação Técnica Importante

### No seu código da Sala.java, note que você agora sincroniza os atributos individuais (cadeira01, etc.) com o array através do método setCadeira. <br>O seu novo toString é mais seguro porque ele lê diretamente do array cadeiras, garantindo que se você alterar uma posição via índice no seu loop da classe Principal, o toString refletirá essa mudança imediatamente

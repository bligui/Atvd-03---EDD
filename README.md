## Exercício 1
(utilizar pilha na resolução do problema)

Em um data center, há uma série de servidores alinhados em uma fileira. Cada servidor tem uma certa carga de trabalho registrada como um número inteiro.
A regra de funcionamento do data center é a seguinte:

✓ Ao final de cada dia, se um servidor tiver uma carga de trabalho maior do que a do servidor imediatamente à sua esquerda, ele sofrerá um overload e será desligado.
✓ Esse processo se repete dia após dia até que nenhum servidor precise ser desligado, ou seja, quando nenhum servidor tiver carga maior do que o servidor à sua esquerda.

Objetivo: dado um vetor com as cargas iniciais de trabalho dos servidores, determine o número de dias após os quais nenhum servidor é desligado.

Exemplo
Suponha que tenhamos a seguinte sequência de cargas:
7
30 25 40 20 35 50 45

Explicação:
• Dia 0 (inicial):
[30, 25, 40, 20, 35, 50, 45]
Servidores que serão desligados no dia 1:
o Servidor no índice 2 (40 > 25)
o Servidor no índice 4 (35 > 20)
o Servidor no índice 5 (50 > 35)

• Dia 1:
Após desligamentos: [30, 25, 20, 45]
Agora, o servidor no índice 3 (45 > 20) será desligado no dia 2.

• Dia 2:
Após desligamentos: [30, 25, 20]
Não há mais servidor com carga maior que o servidor à sua esquerda,
portanto, o processo termina.

Resultado esperado: 2 dias até que nenhum servidor mais seja desligado

## Exercício 2
(utilizar fila na resolução)

Durante uma festa virtual organizada em um servidor de jogos, os participantes entram em uma sala para um jogo de cadeira musical virtual. A dinâmica é a seguinte:

✓ Todos os participantes são numerados de 1 até n, e entram na sala em ordem, formando uma fila.
✓ A música começa a tocar e, a cada k batidas, um participante é eliminado (ele "perde a cadeira").
✓ O jogo continua com os demais participantes, e a contagem reinicia a partir do próximo da fila, que se reorganiza em círculo automaticamente.
✓ O processo continua até restar apenas um participante.

Escreva um programa que simule esse processo e imprima o número do participante que vence o jogo.

## Exercício 3

Escreva um programa que permite armazenar números inteiros em duas listas encadeadas (utilizar a classe LinkedList do Java). Um método deverá receber as duas listas e retornar uma nova lista contendo os elementos das duas listas intercaladas e em ordem crescente.
Observação: você não poderá aplicar nenhum algoritmo de ordenação. Os elementos devem ficar ordenados conforme são intercalados.
As duas listas iniciais deverão estar em ordem crescente.

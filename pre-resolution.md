Exercício 2 – Implemente um tipo de um quebra-cabeças (inspirado no Torres de 
Hanoi) em que existem 3 pilhas, sendo que duas delas são totalmente preenchidas 
com números aleatórios e a terceira está totalmente vazia.
O objetivo é, manualmente, através de operações de pop-push, separe-se a metade 
dos números menores em uma das pilhas e a metade dos maiores fique em outra 
pilha.
Observações:
 O jogo é inicializado com o preenchimento das pilhas 1 e 2 com números 
aleatórios.
 Ao final do jogo, a metade dos números menores deverá ficar na pilha 1.
 A metade dos números maiores deverá ficar na pilha 2.
 A pilha 3 será utilizada para as manobras.
 O jogador deve especificar de onde vai fazer o pop e para onde vai fazer o 
push. 
 Tente implementar uma inteligência no programa, de forma que ele verifique 
quando o jogo de fato se encerrou (todas as regras cumpridas).


primeiro criar as 3 classes

    ---pilha 1 aleatoria---  ---pilha 2 vazia--- ---pilha 3 aleatoria---

                            aqui faz a troca 1,3

**Lembrando que a pilha entra e sai apenas por 1 lado, sendo assim, é necessario a pilha vazia pra armazenar temporariamente o numero retirado de uma pilha preenchida. O primeiro vetor esta na posição(indice) ZERO 0, ou seja, para acessarmos o topo precisamos dizer que ele é -1 da lista pois depois de incrementar inicia-se o vetor corretamente, o -1 indica a pilha vazia.  
-Assim que iniciar ja devem ser preenchidas as pilhas. -> RANDOM JAVA OK!
-Verificar se cada elemento da pilha 1 é menor que na pilha 2 que devem ter os numeros maiores.
-
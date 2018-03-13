algoritmo "semnome"
// Função : encontrar o menor valor da matriz
// Autor :Allan de souza melo
// Data : 9/11/2015
// Seção de Declarações 
var
matriz : vetor [1..7,1..4] de inteiro
i : inteiro
k : inteiro
menorvalor : inteiro
inicio
menorvalor <- 99999
escreval ("programa que encontra o menor valor dentro de uma matriz")
escreval ("para encontrar o menor valor da matriz")
para i de 1 ate 7 faca
escreva ("digite o valor de (",i,",1 ) : ")
leia (matriz[i,1])
se (matriz[i,1] <= menorvalor) entao
menorvalor <- matriz[i,1]
fimse
fimpara
para i de 1 ate 7 faca
escreva ("digite o valor de (",i,",2 ) : ")
leia (matriz[i,2])
se (matriz[i,2] <= menorvalor) entao
menorvalor <- matriz[i,2]
fimse
fimpara
para i de 1 ate 7 faca
escreva ("digite o valor de (",i,",3 ) : ")
leia (matriz[i,3])
se (matriz[i,3] <= menorvalor) entao
menorvalor <- matriz[i,3]
fimse
fimpara
para i de 1 ate 7 faca
escreva ("digite o valor de (",i,",4 ) : ")
leia (matriz[i,4])
se (matriz[i,4] <= menorvalor) entao
menorvalor <- matriz[i,4]
fimse
fimpara
escreval ("******************matriz********************")
escreval (matriz[1,1],matriz[2,1],matriz[3,1],matriz[4,1],matriz[5,1],matriz[6,1],matriz[7,1])
escreval (matriz[1,2],matriz[2,2],matriz[3,2],matriz[4,2],matriz[5,2],matriz[6,2],matriz[7,2])
escreval (matriz[1,3],matriz[2,3],matriz[3,3],matriz[4,3],matriz[5,3],matriz[6,3],matriz[7,3])
escreval (matriz[1,4],matriz[2,4],matriz[3,4],matriz[4,4],matriz[5,4],matriz[6,4],matriz[7,4])
escreval ("********************************************")
escreval ("O menor valor da matriz e igual a : ",menorvalor)
fimalgoritmo

algoritmo "minimax"
// Função : encontrar o elemento minimax dentro de uma matriz
// Autor : Allan de souza melo
// Data : 9/12/2015
// Seção de Declarações 
var
A : vetor [1..10,1..10] de inteiro
i : inteiro
minimax : inteiro
maiorelemento : inteiro
linha : inteiro
inicio
escreval ("programa que encontra o elemento minimax de uma matriz (10,10)")
maiorelemento <- 0
para i de 1 ate 10 faca
escreva ("digite o valor do elemento A (",i,",1 ) : ")
leia (A[i,1])
se (A[i,1] > maiorelemento) entao
maiorelemento <- A[i,1]
linha <- 1
fimse
fimpara
para i de 1 ate 10 faca
escreva ("digite o valor do elemento A (",i,",2 ) : ")
leia (A[i,2])
se (A[i,2] > maiorelemento) entao
maiorelemento <- A[i,2]
linha <- 2
fimse
fimpara
para i de 1 ate 10 faca
escreva ("digite o valor do elemento A (",i,",3 ) : ")
leia (A[i,3])
se (A[i,3] > maiorelemento) entao
maiorelemento <- A[i,3]
linha <- 3
fimse
fimpara
para i de 1 ate 10 faca
escreva ("digite o valor do elemento A (",i,",4 ) : ")
leia (A[i,4])
se (A[i,4] > maiorelemento) entao
maiorelemento <- A[i,4]
linha <- 4
fimse
fimpara
para i de 1 ate 10 faca
escreva ("digite o valor do elemento A (",i,",5 ) : ")
leia (A[i,5])
se (A[i,5] > maiorelemento) entao
maiorelemento <- A[i,5]
linha <- 5
fimse
fimpara
para i de 1 ate 10 faca
escreva ("digite o valor do elemento A (",i,",6 ) : ")
leia (A[i,6])
se (A[i,6] > maiorelemento) entao
maiorelemento <- A[i,6]
linha <- 6
fimse
fimpara
para i de 1 ate 10 faca
escreva ("digite o valor do elemento A (",i,",7 ) : ")
leia (A[i,7])
se (A[i,7] > maiorelemento) entao
maiorelemento <- A[i,7]
linha <- 7
fimse
fimpara
para i de 1 ate 10 faca
escreva ("digite o valor do elemento A (",i,",8 ) : ")
leia (A[i,8])
se (A[i,8] > maiorelemento) entao
maiorelemento <- A[i,8]
linha <- 8
fimse
fimpara
para i de 1 ate 10 faca
escreva ("digite o valor do elemento A (",i,",9 ) : ")
leia (A[i,9])
se (A[i,9] > maiorelemento) entao
maiorelemento <- A[i,9]
linha <- 9
fimse
fimpara
para i de 1 ate 10 faca
escreva ("digite o valor do elemento A (",i,",10 ) : ")
leia (A[i,10])
se (A[i,10] > maiorelemento) entao
maiorelemento <- A[i,10]
linha <- 10
fimse
fimpara
minimax <- A[1,linha]
para i de 1 ate 10 faca
se A[i,linha] < minimax entao
minimax <- A[i,linha]
fimse
fimpara
escreval ("***************matriz*****************")
escreval (A[1,1],A[2,1],A[3,1],A[4,1],A[5,1],A[6,1],A[7,1],A[8,1],A[9,1],A[10,1])
escreval (A[1,2],A[2,2],A[3,2],A[4,2],A[5,2],A[6,2],A[7,2],A[8,2],A[9,2],A[10,2])
escreval (A[1,3],A[2,3],A[3,3],A[4,3],A[5,3],A[6,3],A[7,3],A[8,3],A[9,3],A[10,3])
escreval (A[1,4],A[2,4],A[3,4],A[4,4],A[5,4],A[6,4],A[7,4],A[8,4],A[9,4],A[10,4])
escreval (A[1,5],A[2,5],A[3,5],A[4,5],A[5,5],A[6,5],A[7,5],A[8,5],A[9,5],A[10,5])
escreval (A[1,6],A[2,6],A[3,6],A[4,6],A[5,6],A[6,6],A[7,6],A[8,6],A[9,6],A[10,6])
escreval (A[1,7],A[2,7],A[3,7],A[4,7],A[5,7],A[6,7],A[7,7],A[8,7],A[9,7],A[10,7])
escreval (A[1,8],A[2,8],A[3,8],A[4,8],A[5,8],A[6,8],A[7,8],A[8,8],A[9,8],A[10,8])
escreval (A[1,9],A[2,9],A[3,9],A[4,9],A[5,9],A[6,9],A[7,9],A[8,9],A[9,9],A[10,9])
escreval (A[1,10],A[2,10],A[3,10],A[4,10],A[5,10],A[6,10],A[7,10],A[8,10],A[9,10],A[10,10])
escreval ("***************************************")
escreval ("maior elemento = ",maiorelemento)
escreval ("linha do maior elemento = ",linha)
escreval ("minimax = ",minimax)
fimalgoritmo

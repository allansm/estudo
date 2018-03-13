algoritmo "semnome"
// Função : calcular a media dos valores pares de uma matriz
// Autor : Allan de souza melo
// Data : 9/10/2015
// Seção de Declarações 
var
matriz :vetor [1..5,1..6] de inteiro
media : real
i : inteiro
k : inteiro
par : inteiro
p : inteiro
soma : real
divisor : inteiro
inicio
escreval ("programa que calcula a media dos valores pares de uma matriz")
escreval ("para calcular a media dos valores pares de uma matriz : ")
para i de 1 ate 5 faca
escreva ("digite o valor de (",i,",1 ) : ")
leia (matriz[i,1])
fimpara
para i de 1 ate 5 faca
escreva ("digite o valor de (",i,",2 ) : ")
leia (matriz[i,2])
fimpara
para i de 1 ate 5 faca
escreva ("digite o valor de (",i,",3 ) : ")
leia (matriz[i,3])
fimpara
para i de 1 ate 5 faca
escreva ("digite o valor de (",i,",4 ) : ")
leia (matriz[i,4])
fimpara
para i de 1 ate 5 faca
escreva ("digite o valor de (",i,",5 ) : ")
leia (matriz[i,5])
fimpara
para i de 1 ate 5 faca
escreva ("digite o valor de (",i,",6 ) : ")
leia (matriz[i,6])
fimpara
escreval ("*********************Matriz************************")
escreval (matriz[1,1],matriz[2,1],matriz[3,1],matriz[4,1],matriz[5,1])
escreval (matriz[1,2],matriz[2,2],matriz[3,2],matriz[4,2],matriz[5,2])
escreval (matriz[1,3],matriz[2,3],matriz[3,3],matriz[4,3],matriz[5,3])
escreval (matriz[1,4],matriz[2,4],matriz[3,4],matriz[4,4],matriz[5,4])
escreval (matriz[1,5],matriz[2,5],matriz[3,5],matriz[4,5],matriz[5,5])
escreval (matriz[1,6],matriz[2,6],matriz[3,6],matriz[4,6],matriz[5,6])
escreval ("***************************************************")
divisor <- 0
soma <- 0
para k de 1 ate 6 faca
para i de 1 ate 5 faca
para p de 0 ate matriz[i,k] passo 2 faca
se (matriz[i,k] = p) entao
par <- p
divisor <- divisor + 1
soma <- soma + p
fimse
fimpara
fimpara
fimpara
media <- (soma/divisor)
Escreval ("A media dos valores pares da matriz é :",media)
fimalgoritmo

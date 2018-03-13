algoritmo "semnome"
// Função : gerar e escrever o quadrado magico de ordem 7
// Autor :Allan de souza melo
// Data : 9/12/2015
// Seção de Declarações 
var
quadm : vetor [1..7,1..7] de inteiro
i : inteiro
n2 : numerico
j : inteiro
k : inteiro
n : inteiro
nm : inteiro
inicio
escreval ("programa que gera o quadrado magico de ordem 7 : ")
n <- 7
k <- 7
para i de 1 ate 49 faca
se (i = 8) ou (i = 15) ou (i = 22) ou (i = 29) ou (i = 36) ou (i = 43) entao
k <- k + 1
fimse
se (n < 1) entao
n <- 7
fimse
se k < 1 entao
k <- 7
fimse
se i = 8 entao
n <- 1
k <- 2
fimse
se i = 15 entao
n <- 2
k <- 4
fimse
se i = 22 entao
n <- 3
k <- 6
fimse
se i = 29 entao
n <- 4
k <- 1
fimse
se i = 36 entao
n <- 5
k <- 3
fimse
se i = 43 entao
n <- 6
k <- 5
fimse
quadm[n,k] <- i
n <- n - 1
k <- k - 1
fimpara
escreval ("**********quadrado magico************")
escreval (quadm[1,1],quadm[2,1],quadm[3,1],quadm[4,1],quadm[5,1],quadm[6,1],quadm[7,1])
escreval (quadm[1,2],quadm[2,2],quadm[3,2],quadm[4,2],quadm[5,2],quadm[6,2],quadm[7,2])
escreval (quadm[1,3],quadm[2,3],quadm[3,3],quadm[4,3],quadm[5,3],quadm[6,3],quadm[7,3])
escreval (quadm[1,4],quadm[2,4],quadm[3,4],quadm[4,4],quadm[5,4],quadm[6,4],quadm[7,4])
escreval (quadm[1,5],quadm[2,5],quadm[3,5],quadm[4,5],quadm[5,5],quadm[6,5],quadm[7,5])
escreval (quadm[1,6],quadm[2,6],quadm[3,6],quadm[4,6],quadm[5,6],quadm[6,6],quadm[7,6])
escreval (quadm[1,7],quadm[2,7],quadm[3,7],quadm[4,7],quadm[5,7],quadm[6,7],quadm[7,7])
escreval ("*************************************")
fimalgoritmo

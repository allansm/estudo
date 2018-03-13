algoritmo "semnome"
// Função :
// Autor :Allan de souza melo
// Data : 9/13/2015
// Seção de Declarações 
var
m : vetor [1..10,1..10] de inteiro
l : inteiro
c : inteiro
n : vetor [1..9,1..9] de inteiro
i : inteiro
j : inteiro
k : inteiro
v : inteiro
procedimento s () de inteiro
inicio
escreval ("programa que le uma matriz M(10,10)")
escreval ("remove uma linha e uma coluna desejada")
escreval ("e escreve uma matriz N(9,9) resultante da remoção da linha e da coluna")
para i de 1 ate 10 faca
escreva ("digite o valor de M(",i,",1 ) : ")
leia (m[i,1])
fimpara
para i de 1 ate 10 faca
escreva ("digite o valor de M(",i,",2 ) : ")
leia (m[i,2])
fimpara
para i de 1 ate 10 faca
escreva ("digite o valor de M(",i,",3 ) : ")
leia (m[i,3])
fimpara
para i de 1 ate 10 faca
escreva ("digite o valor de M(",i,",4 ) : ")
leia (m[i,4])
fimpara
para i de 1 ate 10 faca
escreva ("digite o valor de M(",i,",5 ) : ")
leia (m[i,5])
fimpara
para i de 1 ate 10 faca
escreva ("digite o valor de M(",i,",6 ) : ")
leia (m[i,6])
fimpara
para i de 1 ate 10 faca
escreva ("digite o valor de M(",i,",7 ) : ")
leia (m[i,7])
fimpara
para i de 1 ate 10 faca
escreva ("digite o valor de M(",i,",8 ) : ")
leia (m[i,8])
fimpara
para i de 1 ate 10 faca
escreva ("digite o valor de M(",i,",9 ) : ")
leia (m[i,9])
fimpara
para i de 1 ate 10 faca
escreva ("digite o valor de M(",i,",10 ) : ")
leia (m[i,10])
fimpara
escreva ("escolha a linha que deseja remover : ")
leia (l)
escreva ("A coluna que deseja remover : ")
leia (c)
j <- 1
k <- 1
v <- 1
se l <> 1 entao
para i de 1 ate 9 faca
n[i,k] <- m[v,j]
v <- v + 1
se v = c entao
v <- v + 1
fimse
fimpara
k <- k + 1
fimse
j <- j + 1
v <- 1
se l <> 2 entao
para i de 1 ate 9 faca
n[i,k] <- m[v,j]
v <- v + 1
se v = c entao
v <- v + 1
fimse
fimpara
k <- k + 1
fimse
j <- j + 1
v <- 1
se l <> 3 entao
para i de 1 ate 9 faca
n[i,k] <- m[v,j]
v <- v + 1
se v = c entao
v <- v + 1
fimse
fimpara
k <- k + 1
fimse
j <- j + 1
v <- 1
se l <> 4 entao
para i de 1 ate 9 faca
n[i,k] <- m[v,j]
v <- v + 1
se v = c entao
v <- v + 1
fimse
fimpara
k <- k + 1
fimse
j <- j + 1
v <- 1
se l <> 5 entao
para i de 1 ate 9 faca
n[i,k] <- m[v,j]
v <- v + 1
se v = c entao
v <- v + 1
fimse
fimpara
k <- k + 1
fimse
j <- j + 1
v <- 1
se l <> 6 entao
para i de 1 ate 9 faca
n[i,k] <- m[v,j]
v <- v + 1
se v = c entao
v <- v + 1
fimse
fimpara
k <- k + 1
fimse
j <- j + 1
v <- 1
se l <> 7 entao
para i de 1 ate 9 faca
n[i,k] <- m[v,j]
v <- v + 1
se v = c entao
v <- v + 1
fimse
fimpara
k <- k + 1
fimse
j <- j + 1
v <- 1
se l <> 8 entao
para i de 1 ate 9 faca
n[i,k] <- m[v,j]
v <- v + 1
se v = c entao
v <- v + 1
fimse
fimpara
k <- k + 1
fimse
j <- j + 1
v <- 1
se l <> 9 entao
para i de 1 ate 9 faca
n[i,k] <- m[v,j]
v <- v + 1
se v = c entao
v <- v + 1
fimse
fimpara
k <- k + 1
fimse
j <- j + 1
v <- 1
se (n[1,9] = 0) e (n[9,9] = 0) entao
para i de 1 ate 9 faca
n[i,k] <- m[v,j]
v <- v + 1
se v = c entao
v <- v + 1
fimse
fimpara
fimse
fimprocedimento
inicio
s ()
escreval ("matriz M(10,10)")
escreval (m[1,1],m[2,1],m[3,1],m[4,1],m[5,1],m[6,1],m[7,1],m[8,1],m[9,1],m[10,1])
escreval (m[1,2],m[2,2],m[3,2],m[4,2],m[5,2],m[6,2],m[7,2],m[8,2],m[9,2],m[10,2])
escreval (m[1,3],m[2,3],m[3,3],m[4,3],m[5,3],m[6,3],m[7,3],m[8,3],m[9,3],m[10,3])
escreval (m[1,4],m[2,4],m[3,4],m[4,4],m[5,4],m[6,4],m[7,4],m[8,4],m[9,4],m[10,4])
escreval (m[1,5],m[2,5],m[3,5],m[4,5],m[5,5],m[6,5],m[7,5],m[8,5],m[9,5],m[10,5])
escreval (m[1,6],m[2,6],m[3,6],m[4,6],m[5,6],m[6,6],m[7,6],m[8,6],m[9,6],m[10,6])
escreval (m[1,7],m[2,7],m[3,7],m[4,7],m[5,7],m[6,7],m[7,7],m[8,7],m[9,7],m[10,7])
escreval (m[1,8],m[2,8],m[3,8],m[4,8],m[5,8],m[6,8],m[7,8],m[8,8],m[9,8],m[10,8])
escreval (m[1,9],m[2,9],m[3,9],m[4,9],m[5,9],m[6,9],m[7,9],m[8,9],m[9,9],m[10,9])
escreval (m[1,10],m[2,10],m[3,10],m[4,10],m[5,10],m[6,10],m[7,10],m[8,10],m[9,10],m[10,10])

escreval ("matriz N(9,9)")
escreval (n[1,1],n[2,1],n[3,1],n[4,1],n[5,1],n[6,1],n[7,1],n[8,1],n[9,1])
escreval (n[1,2],n[2,2],n[3,2],n[4,2],n[5,2],n[6,2],n[7,2],n[8,2],n[9,2])
escreval (n[1,3],n[2,3],n[3,3],n[4,3],n[5,3],n[6,3],n[7,3],n[8,3],n[9,3])
escreval (n[1,4],n[2,4],n[3,4],n[4,4],n[5,4],n[6,4],n[7,4],n[8,4],n[9,4])
escreval (n[1,5],n[2,5],n[3,5],n[4,5],n[5,5],n[6,5],n[7,5],n[8,5],n[9,5])
escreval (n[1,6],n[2,6],n[3,6],n[4,6],n[5,6],n[6,6],n[7,6],n[8,6],n[9,6])
escreval (n[1,7],n[2,7],n[3,7],n[4,7],n[5,7],n[6,7],n[7,7],n[8,7],n[9,7])
escreval (n[1,8],n[2,8],n[3,8],n[4,8],n[5,8],n[6,8],n[7,8],n[8,8],n[9,8])
escreval (n[1,9],n[2,9],n[3,9],n[4,9],n[5,9],n[6,9],n[7,9],n[8,9],n[9,9])
fimalgoritmo

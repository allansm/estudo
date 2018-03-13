algoritmo "semnome"
// Função :
// Autor :
// Data : 08/09/2015
// Seção de Declarações 
var
g : vetor[1..13] de inteiro
c1,c2,c3 : vetor [1..13]de inteiro
cartao :vetor [1..13]de inteiro
r1,r2,r3 : vetor [1..13] de inteiro
i : inteiro
x : inteiro
apostadores : inteiro
inicio
para i de 1 ate 13 faca
c1[i] <- 0
c2[i] <- 0
c3[i] <- 0
x <- 2
fimpara
para i de 1 ate 13 faca
g[i] <- i
fimpara
para i de 1 ate 13 passo 3 faca
c1[i] <- i
fimpara
para i de 2 ate 13 passo 3 faca
c2[i] <- i
fimpara
para i de 3 ate 13 passo 3 faca
c3[i] <- i
fimpara
repita
se x = 3 entao
x <- 1
fimse
para i de x ate 13 passo 3 faca
r1[i] <- i
fimpara
para i de x ate 13 passo 3 faca
r2[i] <- i
fimpara
para i de x ate 13 passo 3 faca
r3[i] <- i
fimpara
para i de 1 ate 13 faca
escreval (i,"°",c1[i],c2[i],c3[i])
fimpara
se x = 1 entao
x <- x -1
fimse
se x = 2 entao
x <- x + 1
fimse
ate x = 0
para i de 1 ate 13 faca
escreval (i,"°",r1[i],r2[i],r3[i])
fimpara
para i de 1 ate 13 faca
se (c1[i]=r1[i]) e (c2[i]=r2[i]) e (c3[i]=r3[i]) entao
escreval ("apostador : ",i, "
fimalgoritmo

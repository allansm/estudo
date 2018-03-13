algoritmo "loteria esportiva"
// Função : gerer um gabarito de bilhete de loteria e dizer o ganhador
// Autor : allan de souza melo
// Data : 08/09/2015
// Seção de Declarações 
var
g : vetor[1..13] de inteiro
c1,c2,c3 : vetor [1..13]de inteiro
cartao :vetor [1..13]de inteiro
r1,r2,r3 : vetor [1..13,1..3] de inteiro
i,j : inteiro
x,y,z : inteiro
apostadores : inteiro
inicio
escreval ("programa que gera um gabarito de bilhete de loteria esportiva")
escreval (" e diz o numero do cartao ganhador ")
para i de 1 ate 13 faca
c1[i] <- 0
c2[i] <- 0
c3[i] <- 0
x <- 0
y <- 0
z <- 0
fimpara
para i de 1 ate 13 faca
g[i] <- i
fimpara
escreval ("***********gabarito************")
para i de 1 ate 13 passo 3 faca
c1[i] <- i
fimpara
para i de 2 ate 13 passo 3 faca
c2[i] <- i
fimpara
para i de 3 ate 13 passo 3 faca
c3[i] <- i
fimpara
j <- 1
repita
se j = 1 entao
cartao[1] <- 231
x <- 2
y <- 3
z <- 1
fimse
se j = 2 entao
cartao[2] <- 123
x <- 1
y <- 2
z <- 3
fimse
se j = 3 entao
cartao [3] <- 132
x <- 1
y <- 3
z <- 2
fimse
para i de x ate 13 passo 3 faca
r1[i,j] <- i
fimpara
para i de y ate 13 passo 3 faca
r2[i,j] <- i
fimpara
para i de z ate 13 passo 3 faca
r3[i,j] <- i
fimpara
j <- j + 1
ate j = 4
para i de 1 ate 13 faca
escreval (i,"°",c1[i],c2[i],c3[i])
fimpara
escreval ("bilhete : ",cartao[1])
para i de 1 ate 13 faca
escreval (i,"°",r1[i,1],r2[i,1],r3[i,1])
fimpara
escreval ("bilhete : ",cartao[2])
para i de 1 ate 13 faca
escreval (i,"°",r1[i,2],r2[i,2],r3[i,2])
fimpara
escreval ("bilhete : ",cartao[3])
para i de 1 ate 13 faca
escreval (i,"°",r1[i,3],r2[i,3],r3[i,3])
fimpara
para i de 1 ate 13 faca
para j de 1 ate 3 faca
se (c1[i]=r1[i,j]) e (c2[i]=r2[i,j]) e (c3[i]=r3[i,j]) entao
escreval ("apostador : ",cartao[j], " GANHADOR,PARABENS ")
fimse
fimpara
fimpara
fimalgoritmo

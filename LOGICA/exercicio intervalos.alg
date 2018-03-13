algoritmo "exercicio intervalos"
// Função :
// Autor :
// Data : 9/4/2015
// Seção de Declarações 
var
x : numerico
y : inteiro
v1,v2,v3,v4 : inteiro
inicio
escreval ("programa que lê numeros desconhecidos um de cada vez ")
escreval ("e conta quantos valores tem em cada intervalo")
escreval ("os intervalos são 0-25,25-50,-50-75,75-100")
v1 <- 0
v2 <- 0
v3 <- 0
v4 <- 0
Escreva ("digite a quantidade de numeros : ")
leia (y)
repita
escreva ("digite o valor do numero : ")
leia (x)
se (x >= 0) e (x <= 25) entao
v1 <- v1+1
fimse
se (x >= 25)e (x <= 50) entao
v2 <- v2+1
fimse
se (x >= 50)e (x <= 75) entao
v3 <- v3+1
fimse
se (x >=75)e (x <= 100) entao
v4 <- v4+1
fimse
y <- y-1
ate y = 0
escreval ("numero de intervalos de 0-25 : ",v1)
escreval ("numero de intervalos de 25-50 : ",v2)
escreval ("numero de intervalos de 50-75 : ",v3)
escreval ("numero de intervalos de 75-100 : ",v4)
fimalgoritmo

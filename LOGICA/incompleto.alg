algoritmo "semnome"
// Função :
// Autor :
// Data : 9/7/2015
// Seção de Declarações 
var
x : vetor [1..10] de inteiro
i : inteiro
primo : inteiro
v : inteiro
contador : real
divisores : inteiro
calculo : inteiro
inteiros : inteiro
j : inteiro
inicio
divisores <- 0
contador <- 100
para i de 1 ate contador faca
inteiros <- i
fimpara
x[10] <-0
repita
para i de 1 ate contador passo 1 faca
se (contador % i = 0) entao
divisores <- divisores +1
fimse
fimpara
para i de 1 ate 10 faca
se divisores = 2 entao
N[i] <- contador
senao
contador <- contador + 1
fimpara
fimse
divisores <- 0
ate x[10] <> 0
fimalgoritmo

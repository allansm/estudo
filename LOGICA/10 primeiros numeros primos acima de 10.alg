algoritmo "10 primeiros primos acima de 100"
// Função :gerar os 10 primeiros numeros primos acima de 10
// Autor :Allan de souza melo
// Data : 9/8/2015
// Seção de Declarações 
var
x : vetor [1..10]de inteiro
i : inteiro
contador : inteiro
divisores : inteiro
j : inteiro
y : inteiro
inicio
escreval ("programa que gera os 10 primeiros numeros primos acima de 100")
j <- 1
divisores <- 0
contador <- 101
x[10] <- 0
repita
para i de 1 ate contador faca
se (contador % i = 0) entao
divisores <- divisores +1
fimse
fimpara
se (divisores <> 2) entao
contador <- contador + 1
divisores <- 0
fimse
se (divisores = 2) entao
divisores <- 0
x[j] <- contador
contador <- contador + 1
j <- j + 1
fimse
ate x[10] <> 0
para i de 1 ate 10 faca
escreval ("vetor x",i, " : ",x[i])
fimpara
fimalgoritmo

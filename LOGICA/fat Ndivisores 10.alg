algoritmo "semnome"
// Função : ler um numero indeterminado de valores para m e se for menor que 10 fazer seu fatorial se nao dizer seu numero de divisores
// Autor : allan de souza melo
// Data : 9/13/2015
// Seção de Declarações 
var
m : inteiro
i: inteiro
result : inteiro
cont : inteiro
A: inteiro
b: inteiro
d : inteiro
funcao fat (m : inteiro):inteiro
inicio
result <- 1
para i de 1 ate m faca
result <- result*i
fimpara
retorne result
fimfuncao
funcao divisores (m : inteiro ): inteiro
inicio
d <- 0
para i de 1 ate m faca
se (m % i = 0) entao
d <- d + 1
fimse
fimpara
retorne d
fimfuncao
inicio
escreval ("programa que le um numero não determinado de valores de m")
escreval ("se m for menor 10 ele faz seu fatorial")
escreval ("se m for maior que 10 ele encontra seu numero de divisores")
cont <- 0
repita
escreva ("digite o valor de m : ")
leia (m)
se m < 10 entao
b <- fat(m)
escreval ("fatorial de m igual a : ",b)
senao
b <- divisores(m)
escreval ("divisores de m igual a : ",b)
fimse
ate cont > 0
fimalgoritmo

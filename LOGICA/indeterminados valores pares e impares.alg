algoritmo "programa que le numeros nao determinados de valores e opera uma equação dependendo do valor"
// objetivo : ler numeros nao determinados se x=par encontrar os divisores se x=impar>12 somar os valores inteiros de 1 ate x se x=impar<12 escrever fatorial de x
// Autor : allan de souza melo
// Data : 9/6/2015
// Seção de Declarações 
var
m,i,fatorial : inteiro
impar : inteiro
soma : inteiro
v : inteiro
par : inteiro
divisores :real
nd : inteiro
inteiros : inteiro
divisao : real
k : inteiro
inicio
escreval ("programa que lê um número não determinado de valores para X")
escreval ("todos inteiros e positivos, um de cada vez.")
escreval ("Se X for par,ele verifica quantos divisores possui e escrever esta informação.")
escreval ("Se X for ímpar e menor do que 12 calcula e escrever o fatorial de X.")
escreval ("Se X for ímpar e maior ou igual a 12 calcula e escrever")
escreval ("a soma dos inteiros de 1 até numero lido.")
impar <- 1
soma <- 1
par <- 0
nd <- 0
divisores <- 0
escreva ("digite a quantidade de valores de X : ")
leia (v)
repita
escreva ("digite o valor de X : ")
leia (m)
para i de 1 ate m faca
inteiros <- i
fimpara
para i de 0 ate m passo 2 faca
par <- i
fimpara
para i de 1 ate m passo 2 faca
impar <- i
fimpara
se (m = par) entao
para i de 1 ate m passo 1 faca
se (m % i = 0) entao
divisores <- divisores + 1
escreval ("o numero ",m," tem : ",divisores," divisores ")
fimse
fimpara
fimse
divisores <- 0
se (m = impar) e (m > 12) entao
para i de 1 ate m faca
soma <- soma + i
escreval ("a soma dos numeros inteiros de 1 a x são : ",soma)
fimpara
fimse
se (m = impar) e (m < 12) entao
fatorial <- 1
para i de 1 ate m faca
fatorial <- fatorial *i
fimpara
escreval ("O fatorial de ",m," e ",fatorial)
fimse
v <- v - 1
ate v = 0
fimalgoritmo

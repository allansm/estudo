algoritmo "semnome"
// Função :
// Autor :
// Data : 9/6/2015
// Seção de Declarações 
var
m : inteiro
divisores,v,fat : inteiro
par : vetor [0..99999]de inteiro
p : inteiro
n : inteiro
l : inteiro
impar : vetor [0..99999]de inteiro
inicio
p <- 1
l <- 0
n <- 0
par[n] <- 0
impar[n] <- 0
repita
l <- l + 2
p <- p + 2
par[n] <- par[n] + l
impar[n] <- impar[n] + p
n <- n + 1
ate n = 99999
escreval ("programa que le um numero não determinado de valores para X")
escreval ("todos inteiros e positivos um de cada vez")
escreval ("se X for par ele verifica quantos divisores possui e escreve esta informaçao")
escreval ("se X for impar e menor que 12 calcula e escreve seu fatorial")
escreval ("se X for impar e maior ou igual a 12 calcular e escrever a soma")
escreval ("dos inteiros de 1 ate o numero lido")
escreva ("digite a quantidade de valores")
leia (v)
escreva ("digite o valor de X",v)
leia (m)
fimalgoritmo

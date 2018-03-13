algoritmo "semnome"
// Função :
// Autor :
// Data : 8/31/2015
// Seção de Declarações 
var
numero : inteiro
pn : literal
impar,par,ip : inteiro
np : literal
inicio
escreval ("programa que le um numero e diz se ele e positivo ou negativo par ou impar")
escreva (" digite um numero : ")
Leia (numero)
escolha numero
caso 1,3,5,7,9,11,13,15,19,21
np <- "impar"
caso 2,4,6,8,10,12,14,16,18,20,22
np <- "par"
fimescolha
se numero >0 entao
escreva ("este numero é ",np)
senao
escreva ("este numero não é positivo")
fimse
fimalgoritmo

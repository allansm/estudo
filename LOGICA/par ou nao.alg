algoritmo "semnome"
// Função : dizer se um numero e par ou nao
// Autor : allan de souza melo
// Data : 9/12/2015
// Seção de Declarações 
var
numero : inteiro
par : caractere
impar : caractere
i : inteiro
p : inteiro
ip : logico
inicio
escreval ("programa que determina se o numero digitado e par ou nao")
escreva ("digite um valor : ")
leia (numero)
para i de 0 ate numero passo 2 faca
p <- i
se numero = p entao
par <- "sim"
senao
par <- "nao"
fimse
fimpara
se par = "sim" entao
impar <- "nao"
senao
impar <- "sim"
fimse
escreval ("o numero digitado é par ? ")
escreval (par)
fimalgoritmo

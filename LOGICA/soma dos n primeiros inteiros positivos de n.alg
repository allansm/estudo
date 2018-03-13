algoritmo "semnome"
// Função : calcular a soma dos n primeiros inteiros positivos de n
// Autor :allan de souza melo
// Data : 9/14/2015
// Seção de Declarações 
var
n : inteiro
i : inteiro
procedimento soma () : inteiro
var
result: inteiro
inicio
result <- 0
escreva ("digite o valor de N : ")
leia (n)
para i de 1 ate n faca
se n > 0 entao
result <- result + i
fimse
fimpara
escreval ("soma dos n primeiros inteiros positivos de n igual a  : ",result)
fimprocedimento
inicio
escreval ("programa que utiliza um subalgoritmo recursivo para calcular a soma dos N primeiros inteiros")
escreval (" sendo N um valor fornecido pelo usuario ")
soma ()
fimalgoritmo

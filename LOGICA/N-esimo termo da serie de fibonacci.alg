algoritmo "semnome"
// Função :
// Autor : Allan de souza melo
// Data : 9/14/2015
// Seção de Declarações 
var
Nesimo : inteiro
i : inteiro
x,x1,x2,b,c: numerico
serie : inteiro
R: numerico
procedimento fibonacci() numerico
inicio
leia (Nesimo)
x1 <- 0
escreval (" 1° termo : ",x1)
x2 <- 1
escreval (" 2° termo : ",x2)
para i de 3 ate Nesimo faca
R <- x1+x2
x1 <- x2
x2 <- R
escreval (i,"° termo : ",R)
se (i < Nesimo) entao
R <- 0
fimse
fimpara
escreval ("N-esimo termo da equaçao de fibonacci : ", R)
fimprocedimento
inicio
escreval ("programa que calcula o N-esimo termo da equação de fibonacci")
escreva ("digite o N-esimo termo  : ")
fibonacci ()
fimalgoritmo

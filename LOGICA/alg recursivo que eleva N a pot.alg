algoritmo "semnome"
// Função :subalgoritmo recursivo que eleva determinado numero a determinada potencia
// Autor : Allan de souza melo
// Data : 9/14/2015
// Seção de Declarações 
var
N : inteiro
potencia : inteiro
result : real
funcao elev (x,y : real) : real
var
aux : real
inicio
se (x > 0)  e (y > 0) entao
aux <- x^y
retorne aux
senao
escreval ("O valor ou potencia digitado e igual a 0 operação incorreta ")
fimse
fimfuncao
inicio
escreval ("subalgoritmo recursivo que eleva determinado numero a determinada potencia")
escreva ("digite o valor : ")
leia (N)
escreva ("digite a potencia : ")
leia (potencia)
result <- elev (N,potencia)
se (N > 0) e (potencia > 0) entao
escreval (N," elevado a ",potencia," igual a  : ",result)
fimse
fimalgoritmo

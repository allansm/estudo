algoritmo "matriz"
// Função :
// Autor :
// Data : 8/30/2015
// Seção de Declarações 
var
valores : vetor [1..3,1..3] DE real
somalinha3,somacoluna2,somadiagprinc,somadiagsecu,somatudo : real
i,j : inteiro // os indice sempre inteiro
inicio
somalinha3 <- 0
somacoluna2 <- 0
somadiagprinc <- 0
somadiagsecu <- 0
somatudo <- 0
para i de 1 ate 3 faca
para j de 1 ate 3 faca
Escreva ("digite um valor para matriz : ")
Leia (valores[i,j])
somatudo <- valores[i,j] + somatudo
se i=3 entao
somalinha3 <- valores[i,j] + somalinha3
fimse
se j=2 entao
somacoluna2 <- valores[i,j] + somacoluna2
fimse
se i=j entao
somadiagprinc <- valores [i,j] + somadiagprinc
fimse
se j=4-i entao
somadiagsecu <- valores [i,j] + somadiagsecu
fimse
fimpara
fimpara
para i de 1 ate 3 faca
para j de 1 ate 3 faca
escreval (valores [i,j])
fimpara
fimpara
Escreval ("soma de todos os elementos é : " ,somatudo)
Escreval ("soma de elementos da linha 3 e igual a : " ,somalinha3)
Escreval ("soma de elementos da coluna 2 é : " ,somacoluna2)
Escreval ("soma de elementos  da diagonal principal é : ",somadiagprinc)
Escreval ("soma de elementos da diagonal secundaria é : ",somadiagsecu)
fimalgoritmo

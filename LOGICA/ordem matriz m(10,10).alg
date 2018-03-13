algoritmo "semnome"
// Função :ordenar os valores de cada linha de uma matriz
// Autor :Allan de souza melo
// Data : 9/12/2015
// Seção de Declarações 
var
m : vetor [1..10,1..10] de inteiro
i : inteiro
k : inteiro
l : inteiro
ordem : inteiro
z : inteiro
procedimento troca (var x,y : inteiro)
var
z: inteiro
inicio
z <- x
x <- y
y <- z
fimprocedimento
inicio
escreval ("programa que ordena os valores de cada linha de uma matriz ( 10,10 )")
para i de 1 ate 10 faca
escreva ("digite o valor de (",i,",1 ) : ")
leia (m[i,1])
fimpara
para i de 1 ate 10 faca
escreva ("digite o valor de (",i,",2 ) : ")
leia (m[i,2])
fimpara
para i de 1 ate 10 faca
escreva ("digite o valor de (",i,",3 ) : ")
leia (m[i,3])
fimpara
para i de 1 ate 10 faca
escreva ("digite o valor de (",i,",4 ) : ")
leia (m[i,4])
fimpara
para i de 1 ate 10 faca
escreva ("digite o valor de (",i,",5 ) : ")
leia (m[i,5])
fimpara
para i de 1 ate 10 faca
escreva ("digite o valor de (",i,",6 ) : ")
leia (m[i,6])
fimpara
para i de 1 ate 10 faca
escreva ("digite o valor de (",i,",7 ) : ")
leia (m[i,7])
fimpara
para i de 1 ate 10 faca
escreva ("digite o valor de (",i,",8 ) : ")
leia (m[i,8])
fimpara
para i de 1 ate 10 faca
escreva ("digite o valor de (",i,",9 ) : ")
leia (m[i,9])
fimpara
para i de 1 ate 10 faca
escreva ("digite o valor de (",i,",10 ) : ")
leia (m[i,10])
fimpara
escreval ("************************(matriz)****************************")
escreval (m[1,1],m[2,1],m[3,1],m[4,1],m[5,1],m[6,1],m[7,1],m[8,1],m[9,1],m[10,1])
escreval (m[1,2],m[2,2],m[3,2],m[4,2],m[5,2],m[6,2],m[7,2],m[8,2],m[9,2],m[10,2])
escreval (m[1,3],m[2,3],m[3,3],m[4,3],m[5,3],m[6,3],m[7,3],m[8,3],m[9,3],m[10,3])
escreval (m[1,4],m[2,4],m[3,4],m[4,4],m[5,4],m[6,4],m[7,4],m[8,4],m[9,4],m[10,4])
escreval (m[1,5],m[2,5],m[3,5],m[4,5],m[5,5],m[6,5],m[7,5],m[8,5],m[9,5],m[10,5])
escreval (m[1,6],m[2,6],m[3,6],m[4,6],m[5,6],m[6,6],m[7,6],m[8,6],m[9,6],m[10,6])
escreval (m[1,7],m[2,7],m[3,7],m[4,7],m[5,7],m[6,7],m[7,7],m[8,7],m[9,7],m[10,7])
escreval (m[1,8],m[2,8],m[3,8],m[4,8],m[5,8],m[6,8],m[7,8],m[8,8],m[9,8],m[10,8])
escreval (m[1,9],m[2,9],m[3,9],m[4,9],m[5,9],m[6,9],m[7,9],m[8,9],m[9,9],m[10,9])
escreval (m[1,10],m[2,10],m[3,10],m[4,10],m[5,10],m[6,10],m[7,10],m[8,10],m[9,10],m[10,10])
escreval ("************************************************************")
para l de 3 ate 10 faca
para k de 2 ate 10 faca
para i de 1 ate 10 faca
enquanto nao (m[i,1] <= m[k,1]) e (m[k,1] <= m[l,1]) faca
se m[l,1] < m[k,1] entao
troca (m[l,1],m[k,1])
fimse
se m[k,1] < m[i,1] entao
troca (m[k,1],m[i,1])
fimse
fimenquanto
fimpara
fimpara
fimpara
para l de 3 ate 10 faca
para k de 2 ate 10 faca
para i de 1 ate 10 faca
enquanto nao (m[i,2] <= m[k,2]) e (m[k,2] <= m[l,2]) faca
se m[l,2] < m[k,2] entao
troca (m[l,2],m[k,2])
fimse
se m[k,2] < m[i,2] entao
troca (m[k,2],m[i,2])
fimse
fimenquanto
fimpara
fimpara
fimpara
para l de 3 ate 10 faca
para k de 2 ate 10 faca
para i de 1 ate 10 faca
enquanto nao (m[i,3] <= m[k,3]) e (m[k,3] <= m[l,3]) faca
se m[l,3] < m[k,3] entao
troca (m[l,3],m[k,3])
fimse
se m[k,3] < m[i,3] entao
troca (m[k,3],m[i,3])
fimse
fimenquanto
fimpara
fimpara
fimpara
para l de 3 ate 10 faca
para k de 2 ate 10 faca
para i de 1 ate 10 faca
enquanto nao (m[i,4] <= m[k,4]) e (m[k,4] <= m[l,4]) faca
se m[l,4] < m[k,4] entao
troca (m[l,4],m[k,4])
fimse
se m[k,4] < m[i,4] entao
troca (m[k,4],m[i,4])
fimse
fimenquanto
fimpara
fimpara
fimpara
para l de 3 ate 10 faca
para k de 2 ate 10 faca
para i de 1 ate 10 faca
enquanto nao (m[i,5] <= m[k,5]) e (m[k,5] <= m[l,5]) faca
se m[l,5] < m[k,5] entao
troca (m[l,5],m[k,5])
fimse
se m[k,5] < m[i,5] entao
troca (m[k,5],m[i,5])
fimse
fimenquanto
fimpara
fimpara
fimpara
para l de 3 ate 10 faca
para k de 2 ate 10 faca
para i de 1 ate 10 faca
enquanto nao (m[i,6] <= m[k,6]) e (m[k,6] <= m[l,6]) faca
se m[l,6] < m[k,6] entao
troca (m[l,6],m[k,6])
fimse
se m[k,6] < m[i,6] entao
troca (m[k,6],m[i,6])
fimse
fimenquanto
fimpara
fimpara
fimpara
para l de 3 ate 10 faca
para k de 2 ate 10 faca
para i de 1 ate 10 faca
enquanto nao (m[i,7] <= m[k,7]) e (m[k,7] <= m[l,7]) faca
se m[l,7] < m[k,7] entao
troca (m[l,7],m[k,7])
fimse
se m[k,7] < m[i,7] entao
troca (m[k,7],m[i,7])
fimse
fimenquanto
fimpara
fimpara
fimpara
para l de 3 ate 10 faca
para k de 2 ate 10 faca
para i de 1 ate 10 faca
enquanto nao (m[i,8] <= m[k,8]) e (m[k,8] <= m[l,8]) faca
se m[l,8] < m[k,8] entao
troca (m[l,8],m[k,8])
fimse
se m[k,8] < m[i,8] entao
troca (m[k,8],m[i,8])
fimse
fimenquanto
fimpara
fimpara
fimpara
para l de 3 ate 10 faca
para k de 2 ate 10 faca
para i de 1 ate 10 faca
enquanto nao (m[i,9] <= m[k,9]) e (m[k,9] <= m[l,9]) faca
se m[l,9] < m[k,9] entao
troca (m[l,9],m[k,9])
fimse
se m[k,9] < m[i,9] entao
troca (m[k,9],m[i,9])
fimse
fimenquanto
fimpara
fimpara
fimpara
para l de 3 ate 10 faca
para k de 2 ate 10 faca
para i de 1 ate 10 faca
enquanto nao (m[i,10] <= m[k,10]) e (m[k,10] <= m[l,10]) faca
se m[l,10] < m[k,10] entao
troca (m[l,10],m[k,1])
fimse
se m[k,10] < m[i,10] entao
troca (m[k,10],m[i,10])
fimse
fimenquanto
fimpara
fimpara
fimpara
escreval ("****************(matriz em ordem crescente)******************")
escreval (m[1,1],m[2,1],m[3,1],m[4,1],m[5,1],m[6,1],m[7,1],m[8,1],m[9,1],m[10,1])
escreval (m[1,2],m[2,2],m[3,2],m[4,2],m[5,2],m[6,2],m[7,2],m[8,2],m[9,2],m[10,2])
escreval (m[1,3],m[2,3],m[3,3],m[4,3],m[5,3],m[6,3],m[7,3],m[8,3],m[9,3],m[10,3])
escreval (m[1,4],m[2,4],m[3,4],m[4,4],m[5,4],m[6,4],m[7,4],m[8,4],m[9,4],m[10,4])
escreval (m[1,5],m[2,5],m[3,5],m[4,5],m[5,5],m[6,5],m[7,5],m[8,5],m[9,5],m[10,5])
escreval (m[1,6],m[2,6],m[3,6],m[4,6],m[5,6],m[6,6],m[7,6],m[8,6],m[9,6],m[10,6])
escreval (m[1,7],m[2,7],m[3,7],m[4,7],m[5,7],m[6,7],m[7,7],m[8,7],m[9,7],m[10,7])
escreval (m[1,8],m[2,8],m[3,8],m[4,8],m[5,8],m[6,8],m[7,8],m[8,8],m[9,8],m[10,8])
escreval (m[1,9],m[2,9],m[3,9],m[4,9],m[5,9],m[6,9],m[7,9],m[8,9],m[9,9],m[10,9])
escreval (m[1,10],m[2,10],m[3,10],m[4,10],m[5,10],m[6,10],m[7,10],m[8,10],m[9,10],m[10,10])
escreval ("*************************************************************")
fimalgoritmo

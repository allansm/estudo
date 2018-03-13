algoritmo "semnome"
// Função :
// Autor :
// Data : 11/09/2015
// Seção de Declarações 
var
m : vetor [1..6,1..6] de inteiro
i : inteiro
soma : inteiro
img : vetor [1..8] de inteiro
inicio
im8 : inteiro
para i de 1 ate 6 faca
leia (m[i,1])
fimpara
para i de 1 ate 6 faca
leia (m[i,2])
fimpara
para i de 1 ate 6 faca
leia (m[i,3])
fimpara
para i de 1 ate 6 faca
leia (m[i,4])
fimpara
para i de 1 ate 6 faca
leia (m[i,5])
fimpara
para i de 1 ate 6 faca
leia (m[i,6])
fimpara
escreval ("***********matriz*************")
escreval (m[1,1],m[2,1],m[3,1],m[4,1],m[5,1],m[6,1])
escreval (m[1,2],m[2,2],m[3,2],m[4,2],m[5,2],m[6,2])
escreval (m[1,3],m[2,3],m[3,3],m[4,3],m[5,3],m[6,3])
escreval (m[1,4],m[2,4],m[3,4],m[4,4],m[5,4],m[6,4])
escreval (m[1,5],m[2,5],m[3,5],m[4,5],m[5,5],m[6,5])
escreval (m[1,6],m[2,6],m[3,6],m[4,6],m[5,6],m[6,6])
escreval ("******************************")
img[1] <- m[2,1]+m[3,1]+m[4,1]+m[5,1]+m[6,1]+m[3,2]+m[4,2]+m[5,2]+m[6,2]+m[4,3]+m[5,3]+m[6,3]+m[5,4]+m[6,4]+m[6,5]
fimalgoritmo

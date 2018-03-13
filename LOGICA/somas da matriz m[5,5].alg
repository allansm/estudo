algoritmo "semnome"
// Função : calcular a soma da linha, coluna e diagonais definidas e a soma total da matriz
// Autor :allan de souza melo
// Data : 9/11/2015
// Seção de Declarações 
var
m : vetor [1..5,1..5] de inteiro
sl4 :inteiro
sc2 : inteiro
sdp :inteiro
sds : inteiro
stotal : inteiro
i : inteiro
inicio
escreval ("programa que calcula a soma da linha 4 da coluna 2 ")
escreval ("da diagonal principal da diagonal secundaria ")
escreval ("e a soma total da matriz")
para i de 1 ate 5 faca
escreva ("digite o valor de (",i,",1 ) : ")
leia (m[i,1])
fimpara
para i de 1 ate 5 faca
escreva ("digite o valor de (",i,",2 ) : ")
leia (m[i,2])
fimpara
para i de 1 ate 5 faca
escreva ("digite o valor de (",i,",3 ) : ")
leia (m[i,3])
fimpara
para i de 1 ate 5 faca
escreva ("digite o valor de (",i,",4 ) : ")
leia (m[i,4])
fimpara
para i de 1 ate 5 faca
escreva ("digite o valor de (",i,",5 ) : ")
leia (m[i,5])
fimpara
escreval ("************matriz**************")
escreval (m[1,1],m[2,1],m[3,1],m[4,1],m[5,1])
escreval (m[1,2],m[2,2],m[3,2],m[4,2],m[5,2])
escreval (m[1,3],m[2,3],m[3,3],m[4,3],m[5,3])
escreval (m[1,4],m[2,4],m[3,4],m[4,4],m[5,4])
escreval (m[1,5],m[2,5],m[3,5],m[4,5],m[5,5])
escreval ("********************************")
sl4 <- (m[1,4]+m[2,4]+m[3,4]+m[4,4]+m[5,4])
escreval ("soma da linha 4 igual a : ",sl4)
sc2 <-  m[2,1]+m[2,2]+m[2,3]+m[2,4]+m[2,5]
escreval ("soma da coluna 2 igual a : ",sc2)
sdp <- m[1,1]+m[2,2]+m[3,3]+m[4,4]+m[5,5]
escreval ("soma da diagonal principal igual a : ",sdp)
sds <- m[5,1]+m[4,2]+m[3,3]+m[2,4]+m[1,5]
escreval ("soma da diagonal secundaria igual a : ",sds)
stotal <- m[1,1]+m[2,1]+m[3,1]+m[4,1]+m[5,1]+m[1,2]+m[2,2]+m[3,2]+m[4,2]+m[5,2]+m[1,3]+m[2,3]+m[3,3]+m[4,3]+m[5,3]+m[1,4]+m[2,4]+m[3,4]+m[4,4]+m[5,4]+m[1,5]+m[2,5]+m[3,5]+m[4,5]+m[5,5]
escreval ("soma total igual a : ",stotal)
fimalgoritmo

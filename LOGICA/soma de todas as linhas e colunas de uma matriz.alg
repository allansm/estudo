algoritmo "semnome"
// Função : calcular a soma de todas as linhas e colunas de uma matriz
// Autor : Allan de souza melo
// Data : 9/11/2015
// Seção de Declarações 
var
m : vetor [1..5,1..5] de inteiro
sl : vetor [1..5] de inteiro
sc : vetor [1..5] de inteiro
i : inteiro
inicio
escreval ("programa que calcula a soma de todas as linhas e colunas de uma matriz : ")
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
escreval ("************matriz*************")
escreval (m[1,1],m[2,1],m[3,1],m[4,1],m[5,1])
escreval (m[1,2],m[2,2],m[3,2],m[4,2],m[5,2])
escreval (m[1,3],m[2,3],m[3,3],m[4,3],m[5,3])
escreval (m[1,4],m[2,4],m[3,4],m[4,4],m[5,4])
escreval (m[1,5],m[2,5],m[3,5],m[4,5],m[5,5])
escreval ("*******************************")
sl[1] <- (m[1,1]+m[2,1]+m[3,1]+m[4,1]+m[5,1])
sl[2] <- (m[1,2]+m[2,2]+m[3,2]+m[4,2]+m[5,2])
sl[3] <- (m[1,3]+m[2,3]+m[3,3]+m[4,3]+m[5,3])
sl[4] <- (m[1,4]+m[2,4]+m[3,4]+m[4,4]+m[5,4])
sl[5] <- (m[1,5]+m[2,5]+m[3,5]+m[4,5]+m[5,5])
sc[1] <- (m[1,1]+m[1,2]+m[1,3]+m[1,4]+m[1,5])
sc[2] <- (m[2,1]+m[2,2]+m[2,3]+m[2,4]+m[2,5])
sc[3] <- (m[3,1]+m[3,2]+m[3,3]+m[3,4]+m[3,5])
sc[4] <- (m[4,1]+m[4,2]+m[4,3]+m[4,4]+m[4,5])
sc[5] <- (m[5,1]+m[5,2]+m[5,3]+m[5,4]+m[5,5])
para i de 1 ate 5 faca
escreval ("soma da linha ",i," igual a : ",sl[i])
fimpara
para i de 1 ate 5 faca
escreval ("soma da coluna ",i," igual a : ",sc[i])
fimpara
fimalgoritmo

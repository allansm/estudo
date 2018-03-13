algoritmo "semnome"
// Função : calcular a soma e a diferença entre as matrizes A e B
// Autor : Allan de souza melo
// Data : 9/11/2015
// Seção de Declarações 
var
n1 : vetor [1..4,1..6] de inteiro
n2 : vetor [1..4,1..6] de inteiro
m1 : vetor [1..4,1..6] de inteiro
m2 : vetor [1..4,1..6] de inteiro
i : inteiro
inicio
escreval ("programa que calcula a soma e a diferença entre as matrizes A e B")
para i de 1 ate 4 faca
escreva ("digite um valor para matriz A (",i,",1 ) : ")
leia (n1[i,1])
fimpara
para i de 1 ate 4 faca
escreva ("digite um valor para matriz A (",i,",2 ) : ")
leia (n1[i,2])
fimpara
para i de 1 ate 4 faca
escreva ("digite um valor para matriz A (",i,",3 ) : ")
leia (n1[i,3])
fimpara
para i de 1 ate 4 faca
escreva ("digite um valor para matriz A (",i,",4 ) : ")
leia (n1[i,4])
fimpara
para i de 1 ate 4 faca
escreva ("digite um valor para matriz A (",i,",5 ) : ")
leia (n1[i,5])
fimpara
para i de 1 ate 4 faca
escreva ("digite um valor para matriz A (",i,",6 ) : ")
leia (n1[i,6])
fimpara
para i de 1 ate 4 faca
escreva ("digite um valor para matriz B (",i,",1 ) : ")
leia (n2[i,1])
fimpara
para i de 1 ate 4 faca
escreva ("digite um valor para matriz B (",i,",2 ) : ")
leia (n2[i,2])
fimpara
para i de 1 ate 4 faca
escreva ("digite um valor para matriz B (",i,",3 ) : ")
leia (n2[i,3])
fimpara
para i de 1 ate 4 faca
escreva ("digite um valor para matriz B (",i,",4 ) : ")
leia (n2[i,4])
fimpara
para i de 1 ate 4 faca
escreva ("digite um valor para matriz B (",i,",5 ) : ")
leia (n2[i,5])
fimpara
para i de 1 ate 4 faca
escreva ("digite um valor para matriz B (",i,",6 ) : ")
leia (n2[i,6])
fimpara
escreval ("**********matriz A***********")
escreval (n1[1,1],n1[2,1],n1[3,1],n1[4,1])
escreval (n1[1,2],n1[2,2],n1[3,2],n1[4,2])
escreval (n1[1,3],n1[2,3],n1[3,3],n1[4,3])
escreval (n1[1,4],n1[2,4],n1[3,4],n1[4,4])
escreval (n1[1,5],n1[2,5],n1[3,5],n1[4,5])
escreval (n1[1,6],n1[2,6],n1[3,6],n1[4,6])
escreval ("*****************************")
escreval ("**********matriz B***********")
escreval (n2[1,1],n2[2,1],n2[3,1],n2[4,1])
escreval (n2[1,2],n2[2,2],n2[3,2],n2[4,2])
escreval (n2[1,3],n2[2,3],n2[3,3],n2[4,3])
escreval (n2[1,4],n2[2,4],n2[3,4],n2[4,4])
escreval (n2[1,5],n2[2,5],n2[3,5],n2[4,5])
escreval (n2[1,6],n2[2,6],n2[3,6],n2[4,6])
escreval ("*****************************")
para i de 1 ate 6 faca
m1[1,i] <- n1[1,i]+n2[1,i]
fimpara
para i de 1 ate 6 faca
m1[2,i] <- n1[2,i]+n2[2,i]
fimpara
para i de 1 ate 6 faca
m1[3,i] <- n1[3,i]+n2[3,i]
fimpara
para i de 1 ate 6 faca
m1[4,i] <- n1[4,i]+n2[4,i]
fimpara
escreval ("****soma de matriz A e B****")
escreval (m1[1,1],m1[2,1],m1[3,1],m1[4,1])
escreval (m1[1,2],m1[2,2],m1[3,2],m1[4,2])
escreval (m1[1,3],m1[2,3],m1[3,3],m1[4,3])
escreval (m1[1,4],m1[2,4],m1[3,4],m1[4,4])
escreval (m1[1,5],m1[2,5],m1[3,5],m1[4,5])
escreval (m1[1,6],m1[2,6],m1[3,6],m1[4,6])
escreval ("*****************************")
para i de 1 ate 6 faca
m2[1,i] <- n1[1,i]-n2[1,i]
fimpara
para i de 1 ate 6 faca
m2[2,i] <- n1[2,i]-n2[2,i]
fimpara
para i de 1 ate 6 faca
m2[3,i] <- n1[3,i]-n2[3,i]
fimpara
para i de 1 ate 6 faca
m2[4,i] <- n1[4,i]-n2[4,i]
fimpara
escreval ("diferença entre a  matriz A e B")
escreval (m2[1,1],m2[2,1],m2[3,1],m2[4,1])
escreval (m2[1,2],m2[2,2],m2[3,2],m2[4,2])
escreval (m2[1,3],m2[2,3],m2[3,3],m2[4,3])
escreval (m2[1,4],m2[2,4],m2[3,4],m2[4,4])
escreval (m2[1,5],m2[2,5],m2[3,5],m2[4,5])
escreval (m2[1,6],m2[2,6],m2[3,6],m2[4,6])
escreval ("******************************")
fimalgoritmo

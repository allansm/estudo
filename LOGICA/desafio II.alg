algoritmo "desafio II"
// Função :
// Autor :
// Data : 8/31/2015
// Seção de Declarações 
var
pagamento,moedas,nnotas,nmoedas,vsp,vep,troco,ncqt,nvt,ndz,ncc,nds,num:real
notas,cqt,vt,dz,cc,ds,um :inteiro
inicio
Escreval ("programa que calcula o numero de moedas e notas a ser dado de troco para um pagamento ")
cqt <- 50
vt <- 20
dz <- 10
cc <- 5
ds <- 2
um <- 1
escreva ("digite o valor a ser pago : ")
leia (vsp)
escreva ("digite o valor efetivamente pago : ")
leia (vep)
troco <- ((vep)-(vsp))
ncqt <- (troco/cqt)
nvt <- (troco/vt)
ndz <- (troco/dz)
ncc <- (troco/cc)
nds <- (troco/ds)
num <- (troco/um)
Escreval ("troco = " ,troco)
escreval ("troco para notas de 50 = ", ncqt," notas ")
escreval ("troco para notas de 20 = ", nvt," notas ")
escreval ("troco para notas de 10 = ", ndz," notas ")
escreval ("troco para notas de 5 = ", ncc," notas ")
escreval ("troco para notas de 2 = ", nds," notas ")
escreval ("troco para notas de 1 = ", num," notas ")
fimalgoritmo

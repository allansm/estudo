algoritmo "numeros perfeitos"
// Função : gerar numeros perfeitos
// Autor :allan de souza melo
// Data : 9/5/2015
// Seção de Declarações 
var
n : vetor [0..4] de real
x : real
y : real
z : real
i : inteiro
l : real
divisor : real
inicio
i <- 0
escreval ("programa que gera numeros perfeitos com base no valor de x e de n")
escreval ("um numero perfeito e aquele que e igual a soma dos seus divisores")
escreval ("formula (((x/x)+(x/x))^(n[i]-1))*((((x/x)+(x/x))^(n[i]))-(1))")
repita
escreva ("digite o valor de x : ")
leia (x)
escreva ("digite o valor de n : ")
leia (n[i])
y <- (((x/x)+(x/x))^(n[i]-1))*((((x/x)+(x/x))^(n[i]))-(1))
z <- (((x/x)+x/x))^(n[i]-1))
l <- (((x/x)+(x/x))^(n[i]))-(1))
escreval ("numero perfeito igual a : ",y)
i <- i + 1
ate i = 4
fimalgoritmo

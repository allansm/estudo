algoritmo "numero 3"
// Função : fazer qualquer valor dentro da minha equação diferente de zero resultar em 3
// Autor : Allan de souza melo
// Data : 8/29/2015
// Seção de Declarações 
var
a,b,c,d,x,y,z,h,p,u,resultado : real
inicio
Escreval ("faço qualquer multiplicação dentro da minha equação resultar 3")
Escreval ("Digite 3 valores e 1 divisor diferente de zero")
Escreva ("Digite o primeiro valor : ")
Leia (a)
Escreva ("Digite o segundo valor : ")
Leia (b)
Escreva ("Digite o terceiro valor : ")
Leia (p)
Escreva ("Digite um divisor : ")
Leia (u)
x <- (a*b*p/u)
c <- (x/x)
d <- (x/(x/2))
y <- (x/(x/4))
z <- (x/(c+c))
h <- ((d+(y))/x)
Escreval (a ," veses ",b," veses ",p," dividido para ",u, " = " ,x)
resultado <- (x/(c+c))*((d+(y))/x)
Escreval (x," dividido para",d," = ",z)
Escreval (z," veses ",h," = ",resultado)
Escreval ("formula (x/(c+c))*((d+(y))/x)")
Escreval ("onde (x/(c+c)) = ",z," e (d+(y))/x) = ",h)
Escreval ("resultado = ",resultado)
fimalgoritmo

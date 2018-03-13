/**
*
*  @autor Allan de souza melo
*
*/

#include <stdio.h>
#include <stdlib.h>
#include "../../classes/calculo.h"
#include <iostream>

void exibir(char val){
	bool flag = true;
	for(int i = 0; i < 10;i++){
		if(val == i){
			printf("%d",val);
			flag = false;
		}
	}
	if(flag){
		printf("%c",val);
	}
}

main(){
	int op;
	printf("Sistema de conversao de numeros binarios e hexadecimais\n\n");
	printf("1 - conversao de binarios\n\n2 - conversao hexadecimal\n\n");
	printf("escolha uma opcao:");
	scanf("%d",&op);
	printf("\n");
	switch(op){
		case 1:
			Calculo calc;
			printf("1 - character 2 - numero decimal :");
			scanf("%d",&op);
			printf("\ndigite o valor a ser convertido para binario:");
			int val1;
			char val2;
			switch(op){
				case 1:
					scanf("%s",&val2);
					printf("\n");
					calc.parseBin(val2);
					break;
				case 2:
					scanf("%d",&val1);
					printf("\n");
					calc.parseBin(val1);
					break;
			}
			printf("\n");
			for(int i = 0; i < 8;i++){
				printf("%c",calc.bin[i]);
				if(i == 3){
					printf(" ");
				}
			}
			break;
		case 2:
			Calculo c;
			int op2;
			printf("1 - character 2 - numero decimal :");
			scanf("%d",&op2);
			printf("\ndigite o valor a ser convertido para hexadecimal : ");
			int x;
			char y;
			switch(op2){
				case 1:
					scanf("%s",&y);
					c.parseBin(y);
					break;
				case 2:
					scanf("%d",&x);
					c.parseBin(x);
					break;
			}
			c.parseHex(c.bin);
			exibir(c.hex[0]);
			exibir(c.hex[1]);
			break;
	}
}

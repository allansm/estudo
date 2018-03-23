#include <stdio.h>
#include <stdlib.h>
#include <windows.h>

int i = 0;
char* vector[5] = {"ping www.google.com","ping www.youtube.com","ping www.skidrowreloaded.com"};

void run(){
	printf("current command:%s\n",vector[i]);
	system(vector[i++]);
	Sleep(5000);
	i = (i>2)?0:i;
	system("cls");
	run();
}
main(){
	system("color a");
	system("cls");
	run();
}

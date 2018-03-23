#include <iostream>
#include <iomanip>
#include <Windows.h>
#include <TlHelp32.h>
#include <stdio.h>
main(){
	const char* processName = "Application.exe" ; 
	DWORD pid = NULL;
	DWORD processAdress = 0xFFFFFFFF;
	PROCESSENTRY32 processEntry;
	HANDLE processSnapShot = CreateToolhelp32Snapshot(TH32CS_SNAPPROCESS,0);
	while(pid == NULL){
		if(Process32First(processSnapShot,&processEntry)){
			do{
				if( !strcmp(processEntry.szExeFile, processName) ){
                    pid = processEntry.th32ProcessID ;
                    break ;
				} 
			}while(Process32Next(processSnapShot,&processEntry));
		}
	}
	
	printf("%d",pid);
}

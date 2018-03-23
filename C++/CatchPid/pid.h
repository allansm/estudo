#include <iostream>
#include <iomanip>
#include <Windows.h>
#include <TlHelp32.h>
#include <stdio.h>

class PID{
	public : int getPID(char* processName){
		DWORD pid = NULL;
		DWORD processAdress = 0xFFFFFFFF;
		PROCESSENTRY32 processEntry;
		HANDLE processSnapShot = CreateToolhelp32Snapshot(TH32CS_SNAPPROCESS,0);
		while(!pid){
			if(Process32First(processSnapShot,&processEntry)){
				do{
					if( !strcmp(processEntry.szExeFile, processName) ){
	                    pid = processEntry.th32ProcessID ;
	                    break ;
					} 
				}while(Process32Next(processSnapShot,&processEntry));
			}
			Sleep(1000);
		}
		return pid;
	}	
};

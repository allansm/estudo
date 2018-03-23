#include <windows.h>
#include <stdio.h>
#include <fstream>
#include <iostream>

class MemoryView{
	public:void searchString(char in[255],char windowName[255]){
		printf("waiting...\n\n");
		printf("Val           Hex           percent\n\n");
		int start = 0x00000000,end = 0x7FFFFFFF;
		HWND hwnd = FindWindow(0,windowName);
		DWORD process_ID;
		GetWindowThreadProcessId(hwnd,&process_ID);
		HANDLE hProcess = OpenProcess(PROCESS_ALL_ACCESS,FALSE,process_ID);
		char val[255];
		for(start;start<=end;start++){
			ReadProcessMemory(hProcess,(LPCVOID)(start),&val,sizeof(val),0);
			if(!strcmp(in,val)){
				printf("FOUND\n");
				Beep(1000,1000);
				printf("%s : %x : %.2f %%\n",val,start,(((float)start/(float)end)*100));
				//system("pause");
			}else{
				//printf("%s : %x : %.2f %%\n",val,start,(((float)start/(float)end)*100));
			}
			Sleep(1);
		}
		printf("finished.");
	}
	public:void searchInt(int in,char windowName[255]){
		printf("waiting...\n\n");
		printf("Val           Hex           percent\n\n");
		int start = 0x00000000,end = 0x7FFFFFFF;
		HWND hwnd = FindWindow(0,windowName);
		DWORD process_ID;
		GetWindowThreadProcessId(hwnd,&process_ID);
		HANDLE hProcess = OpenProcess(PROCESS_ALL_ACCESS,FALSE,process_ID);
		int val = 0;
		for(start;start<=end;start++){
			ReadProcessMemory(hProcess,(LPCVOID)(start),&val,sizeof(val),0);
			if(in == val){
				printf("FOUND\n");
				Beep(1000,1000);
				printf("%d : %x : %.2f %%\n",val,start,(((float)start/(float)end)*100));
				//system("pause");
			}else{
				//printf("%d : %x : %.2f %%\n",val,start,(((float)start/(float)end)*100));
			}
			Sleep(1);
		}
		printf("finished.");
	}
	public:void realTimeValues(int val,char* windowName){
		
	}
};

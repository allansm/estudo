#include <iostream>
#include <iomanip>
#include <Windows.h>
#include <TlHelp32.h>
#include <stdio.h>

class MemoryAddress{
	public:DWORD getMemoryAddress(int pid,char* processName){
		DWORD processAddress = 0xFFFFFFFF;
		HANDLE moduleSnapshotHandle = INVALID_HANDLE_VALUE;
	    MODULEENTRY32 moduleEntry;
	    moduleSnapshotHandle = CreateToolhelp32Snapshot(TH32CS_SNAPMODULE,pid);
	    moduleEntry.dwSize = sizeof(MODULEENTRY32);
	    while(processAddress == 0xFFFFFFFF){
	        do{
	            if(!strcmp(moduleEntry.szModule, processName)){
	                processAddress = (unsigned int)moduleEntry.modBaseAddr;
	                break ;
	            }
	        } while( Module32Next(moduleSnapshotHandle, &moduleEntry) );
	    }
	    CloseHandle(moduleSnapshotHandle);
	    return processAddress;
	}
};

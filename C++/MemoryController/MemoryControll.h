#include "../ProcessMemoryAddress/ProcessMemoryAddress.h"

class MemoryControll{
	private:char* ProcessName;
	private:DWORD MemoryAddress;
	private:ProcessMemoryAddress p;
	private:char* WindowName;
	private:HANDLE hProc;
	public:void setProcName(char* procName){
		ProcessName = procName;
		MemoryAddress = p.getMemoryAddress(ProcessName);
	}
	public:void setWindowName(char* winName){
		WindowName = winName;
		HWND hwnd = FindWindow(0, WindowName);
		DWORD proccess_ID;
		GetWindowThreadProcessId(hwnd, &proccess_ID);
		hProc = OpenProcess(PROCESS_ALL_ACCESS, FALSE, proccess_ID);
	}
	public:DWORD getMemoryAddress(){
		return MemoryAddress;
	}
	public:HANDLE getHProc(){
		return hProc;
	}
	public:void writeFixedInt(int hex,int val){
		WriteProcessMemory(hProc,(LPVOID)MemoryAddress+hex,&val,sizeof(val),NULL);
	}
	public:void writeFixedFloat(int hex,float val){
		WriteProcessMemory(hProc,(LPVOID)MemoryAddress+hex,&val,sizeof(val),NULL);
	}
	public:void writeFixedString(int hex,char* val){
		WriteProcessMemory(hProc,(LPVOID)MemoryAddress+hex,&val,sizeof(val),NULL);
	}
	public:int readFixedInt(int hex,int val){
		ReadProcessMemory(hProc,(LPVOID)MemoryAddress+hex,&val,sizeof(val),0);
		return val;
	}
	public:float readFixedFloat(int hex,float val){
		ReadProcessMemory(hProc,(LPVOID)MemoryAddress+hex,&val,sizeof(val),0);
		return val;
	}
	public:char* readFixedString(int hex,char* val){
		ReadProcessMemory(hProc,(LPVOID)MemoryAddress+hex,&val,sizeof(val),0);
		return val;
	}
};

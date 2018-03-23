#include "../CatchPid/pid.h"
#include "../CatchMemoryAddress/MemoryAddress.h"

class ProcessMemoryAddress{
	public:DWORD getMemoryAddress(char* processName){
		PID p;
		MemoryAddress m;
		return m.getMemoryAddress(p.getPID(processName),processName);
	}
};

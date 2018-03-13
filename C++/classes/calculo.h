/**
*
*  @autor Allan de souza melo
*
*/

class Calculo{
	public : char bin[8];
	public : char hex[2];
	public : void parseBin(int val){
		int base = 128 ;
		char binario[8];
		for(int i = 0;i<8;i++){
			if(val >= base){
				binario[i] = '1';
				val -= base;
				base /= 2;
			}else{
				binario[i] = '0';
				base /= 2;
			}
		}
		for(int i = 0; i < 8; i++){
			bin[i] = binario[i];
		}	
	}
	public : void parseHex(char binario[8]){
		char hex1[4],hex2[4];
		int base = 8,val1=0,val2=0;
		for(int i = 0;i<4;i++){
			hex1[i] = binario[i];
		}
		for(int i = 4;i<8;i++){
			hex2[i-4] = binario[i];
		}
		for(int i = 0;i<4;i++){
			if(hex1[i] == '1'){
				val1 += base;
			}
			if(hex2[i] == '1'){
				val2 += base;
			}
			base/=2;
		}
		if(val1 < 10){
			hex[0] = val1;
		}else{
			if(val1 == 10){
				hex[0] = 'A';
			}
			if(val1 == 11){
				hex[0] = 'B';
			}
			if(val1 == 12){
				hex[0] = 'C';
			}
			if(val1 == 13){
				hex[0] = 'D';
			}
			if(val1 == 14){
				hex[0] = 'E';
			}
			if(val1 == 15){
				hex[0] = 'F';
			}
		}
		if(val2 < 10){
			hex[1] = val2;
		}else{
			if(val2 == 10){
				hex[1] = 'A';
			}
			if(val2 == 11){
				hex[1] = 'B';
			}
			if(val2 == 12){
				hex[1] = 'C';
			}
			if(val2 == 13){
				hex[1]= 'D';
			}
			if(val2 == 14){
				hex[1] = 'E';
			}
			if(val2 == 15){
				hex[1] = 'F';
			}
		}
	}
};

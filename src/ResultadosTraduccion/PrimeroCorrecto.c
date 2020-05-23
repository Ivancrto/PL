#define cte1 23 
#define cte2 04
#define cte3 56.34

void Subrutina1Param( int Sub1Param1 );

void Subrutina1Param(int Sub1Param1){
	float  r1, r2 = 0.2, r3;
	Subrutina0Param();
	r1 = Sub1Param1;
}

void main (void){
	int  i1, i2, i3;
	float r1 = -0.4, r2 = 234e-2, r3 = 23.498e14;
	char c1[2] , c2[2]  = "SI";
	Subrutina1Param(34);
	
}

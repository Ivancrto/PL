#define cte1 23 
#define cte2 04
#define cte3 56.34

void Subrutina0Param( void );
void Subrutina1Param( int Sub1Param1 );
void Subrutina3Param( int Sub3Param1, float *Sub3Param2, char *Sub3Param3 );
int Funcion1Param( float Fun1Param1 );
float Funcion2Param( int Fun2Param1, char Fun2Param2[] );

void Subrutina0Param(void){
	int  i1, i2 = 0, i3;
	i1 = 0b011 + 0o740 * 0o101;
	i3 = 0xA34 - 0x890 / 0x106 + 0x010;
	Subrutina1Param(Funcion1Param(i1) + i2 * i3);
}

void Subrutina1Param(int Sub1Param1){
	float  r1, r2 = 0.2, r3;
	Subrutina0Param();
	r1 = Sub1Param1;
}

void Subrutina3Param(int Sub3Param1, float *Sub3Param2, char *Sub3Param3){
	int  i1, i2 = 0, i3;
	*Sub3Param2 = Funcion1Param(Sub3Param1);
	Subrutina1Param(i2 * i3);
	*Sub3Param3 = *Sub3Param2 + i1;
}

int Funcion1Param(float Fun1Param1){
	float  r1, r2 = 0.2, r3;
	Subrutina0Param();
	return Sub1Param1;
}

float Funcion2Param(int Fun2Param1, char Fun2Param2[]){
	float  r1, r2 = 0.2, r3;
	Subrutina0Param();
	return Sub1Param1;
}

void PruebaIfs(void){
	int  i1, i2 = 0, i3;
	if (1){
		Subrutina0Param();
		
	}
	if (0){
		Subrutina0Param();
		
	}
	if (a==b){
		Subrutina0Param();
		
	}
	if (1 || a<b && b>c !^ c==d){
		Subrutina1Param(Funcion1Param(i1) + i2 * i3);
		concatenacionStrings = "comilla doble \" dentro" + "comilla simple ' dentro";
		
	}
	if (!(0 || a<=b) && (b>=c ^ c!=d)){
		Subrutina1Param(Funcion1Param(i1) + i2 * i3);
		if (1){
			Subrutina0Param();
			
		}
		concatenacionStrings = "comilla doble \" dentro" + "comilla simple ' dentro";
	}
	else {
		Subrutina1Param(Funcion1Param(i1) + i2 * i3);
		if (1 || a<b && b>c !^ c==d){
			Subrutina1Param(Funcion1Param(i1) + i2 * i3);
			concatenacionStrings = "comilla doble \" dentro" + "comilla simple ' dentro";
		}
		else {
			Subrutina1Param(Funcion1Param(i1) + i2 * i3);
			if (1 || a<b && b>c !^ c==d){
				Subrutina1Param(Funcion1Param(i1) + i2 * i3);
				concatenacionStrings = "comilla doble \" dentro" + "comilla simple ' dentro";
				
			}
			
		}
		
	}
}

void PruebaDOs(void){
	int  i1, i2 = 0, i3;
	a = 0;
	for(contador=45; contador!=-3; contador=contador+decremento){
		Subrutina1Param(Funcion1Param(i1) + i2 * i3);
		Subrutina0Param();
		
	}
	
	while (1 || a<b && b>c !^ c==d){
		PruebaIfs();
		contador = contador + 1;
	}
	
	while (1 || a<b && b>c ^ c==d){
		PruebaIfs();
		for(contador=45; contador!=-3; contador=contador+decremento){
			Subrutina1Param(Funcion1Param(i1) + i2 * i3);
			contador = contador + 1;
			PruebaIfs();
			Subrutina0Param();
			
		}
	}
	for(contador=45; contador!=-3; contador=contador+decremento){
		Subrutina1Param(Funcion1Param(i1) + i2 * i3);
		Subrutina0Param();
		
		while (1 || a<b && b>c !^ c==d){
			PruebaIfs();
			contador = contador + 1;
		}
		
	}
}

void PruebaSELECTs(void){
	int  i1, i2 = 0, i3;
	switch (1.23E4 + -000.64E-77 / -045.0e16 * a){
	case "adz":
		Subrutina1Param(Funcion1Param(i1) + i2 * i3);
		contador = contador + 1;
		PruebaIfs();
		Subrutina0Param();
		
		break;
	case "adz":
	case "zzz":
		Subrutina1Param(Funcion1Param(i1) + i2 * i3);
		contador = contador + 1;
		PruebaIfs();
		Subrutina0Param();
		
		break;
	case "a" to "z":
		Subrutina1Param(Funcion1Param(i1) + i2 * i3);
		contador = contador + 1;
		PruebaIfs();
		Subrutina0Param();
		
		break;
		
	}
	switch (1.23E4 + -000.64E-77 / -045.0e16 * a){
	case <1.23E4:
		Subrutina1Param(Funcion1Param(i1) + i2 * i3);
		contador = contador + 1;
		PruebaIfs();
		Subrutina0Param();
		
		break;
	case >-000.64E-77:
		Subrutina1Param(Funcion1Param(i1) + i2 * i3);
		contador = contador + 1;
		PruebaIfs();
		Subrutina0Param();
		
		break;
	default:
		Subrutina1Param(Funcion1Param(i1) + i2 * i3);
		contador = contador + 1;
		PruebaIfs();
		Subrutina0Param();
		
	}
}

void main (void){
	int  i1, i2, i3;
	float r1 = -0.4, r2 = 234e-2, r3 = 23.498e14;
	char c1[2] , c2[2]  = "SI";
	Subrutina0Param();
	Subrutina1Param(34);
	Subrutina3Param(i2,&r1,&c1);
	concatenacionStrings = "comilla doble \" dentro" + "comilla simple ' dentro" + "comilla simple ' dentro" + "comilla doble \" dentro" + "comilla doble \" y simple ' dentro" + "comilla simple ' y doble \" dentro";
	resultado_aritmetico1 = (-45 + entero1) * entero2 - entero3 / entero4;
	otro_resultado_aritmetico = (123.456 * -00.69 + 45.07000) / (-123.456 + Funcion2Param(Funcion1Param(34.2),34) * 123E456) + (-64e-77 * -045e6 - 003E-35) * 1.23E4 + -000.64E-77 / -045.0e16 - 0.03E-35;
	
}
PROGRAM Programa ;

! Declaracion de variables
INTEGER :: i1, i2, i3 ;
REAL :: r1 = -0.4, r2 = 234e-2, r3 = 23.498e14 ;
CHARACTER (2) :: c1, c2 = 'SI' ;

! Declaracion de constantes
INTEGER , PARAMETER :: cte1 = 23, cte2 = 04; ! Contantes enteras
REAL , PARAMETER :: cte3 = 56.34 ; ! Contantes reales

INTERFACE
	SUBROUTINE Subrutina1Param ( Sub1Param1 ) ! ClasesTraduccion.Subrutina con 1 parametro de llamada
		INTEGER , INTENT ( IN ) Sub1Param1 ;
	END SUBROUTINE Subrutina1Param

END INTERFACE

CALL Subrutina1Param (34);
END PROGRAM Programa

SUBROUTINE Subrutina1Param ( Sub1Param1 ) ! ClasesTraduccion.Subrutina con 1 parametro de llamada
	INTEGER , INTENT ( IN ) Sub1Param1 ;
	! Declaración de variables
	REAL :: r1, r2=0.2, r3 ;
	! Sentencias
	CALL Subrutina0Param;
	r1 = Sub1Param1;
END SUBROUTINE Subrutina1Param

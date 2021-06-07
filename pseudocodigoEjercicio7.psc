Algoritmo pseudocodigoEjercicio7
	Definir porPar, porNul, porImp Como Real
	Para i=1 Hasta 15 
		Definir parre, imp Como Real;
		num= Aleatorio(0,36);
		Escribir num;
		si num =0 Entonces
			nul=nul+1
		SiNo
			Si num mod 2=0 Entonces
			pare=pare+1;
		SiNo
			imp= imp+1;
			FinSi
		FinSi
	FinPara
	porPar=pare*(100/15);
	porNul=nul*(100/15);
	porImp=imp*(100/15);
	Escribir "El porcentaje de numeros pares es ",porPar,"%";
	Escribir "El porcentaje de numeros impares es ",porImp,"%";
	Escribir "El porcentaje de ceros es ",porNul,"%";
FinAlgoritmo

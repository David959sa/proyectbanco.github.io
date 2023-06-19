Algoritmo Bancoh
	Definir a, b, c, d, totalsucursales Como Real
	totalsucursales <- 0
	Definir cantidad, i Como Entero
	Definir identiasesor, nombreasesor Como Cadena
	Escribir 'Ingrese identifación Asesor'
	Leer identiasesor
	Escribir 'Ingrese su nombre'
	Leer nombreasesor
	Escribir 'Digite cantidad sucursales a hacer promedio'
	Leer cantidad
	Para i<-1 Hasta cantidad Con Paso 1 Hacer
		Escribir 'ingrese el valor total de mes de PRESTAMOS DE VIVIENDA'
		Leer a
		Escribir 'ingrese el valor total de mes de PRESTAMOS DE ESTUDIO'
		Leer b
		Escribir 'ingrese el valor total de mes de PRESTAMOS DE COMPRA DE CARTERA'
		Leer c
		d <- (a+b+c)/3
		Escribir 'Total promedio sucursal', i, 'es de: ', d, '$'
		totalsucursales <- totalsucursales+d
	FinPara
	Escribir '------PROMEDIO TOTAL DE SUCURSALES------'
	totalsucursales <- totalsucursales/cantidad
	Escribir 'El promedio de prestamos de todas las sucursales es de ', totalsucursales
FinAlgoritmo

package com.clase.ejercicios;

public class ejerciciosFor4 {

	public static void main(String[] args) {
		int numPrimo = 13; //N�mero que revisamos si es primo
		boolean primoSiNo = true; //Booleano que guarda si es o no primo
		//Dividimos este numPrimo por todos sus n�meros inferiores para comprobar si es primo o no
		for(int i=numPrimo-1; i>1; i--) {
			if(numPrimo%i == 0) {
				primoSiNo = false;
			}
		}
		//El resultado final de decir si es primo o no el n�mero
		if (primoSiNo) {
			System.out.printf("El %d es primo o <=1", numPrimo).println();
		} else {
			System.out.printf("El %d no es primo", numPrimo).println(); 
		}
	}
}
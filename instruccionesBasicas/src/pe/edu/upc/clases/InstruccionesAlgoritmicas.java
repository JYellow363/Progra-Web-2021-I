package pe.edu.upc.clases;

import java.util.Scanner;

public class InstruccionesAlgoritmicas {

	public static void main(String[] args) {
		char cOpcion = 'S';
		int iOpcion = 1;
		Scanner objLector = new Scanner(System.in);

		do {
			System.out.println("Menú de opciones básicas Java");
			System.out.println("[1] Condicional Simple");
			System.out.println("[2] Condicional Doble");
			System.out.println("[3] Condicional Anidada");
			System.out.println("[4] Switch");
			System.out.println("[5] For");
			System.out.println("[6] While");
			System.out.println("[7] Do while");
			System.out.println("[8] Break");
			System.out.println("[9] Continue");
			System.out.println("Ingrese su opción: ");
			iOpcion = objLector.nextInt();
			switch (iOpcion) {
			case 1:
				condicionalSimple();
				break;
			case 2:
				condicionalDoble();
				break;
			case 3:
				//
				break;
			case 4:
				//
				break;
			case 5:
				//
				break;
			case 6:
				//
				break;
			case 7:
				//
				break;
			case 8:
				//
				break;
			case 9:
				//
				break;
			}

			System.out.println("Desea Continuar S/N: ");
			cOpcion = objLector.next().charAt(0);
		} while (cOpcion == 'S');
	}

	public static void condicionalSimple() {
		Scanner objLector = new Scanner(System.in);
		float fCapital, fTasa, fInteres, fCapitalFinal;
		fCapitalFinal = 0;
		
		System.out.println("Ingrese cantidad a invertir: ");
		fCapital = objLector.nextFloat();
		
		System.out.println("Ingrese tasa de interés: ");
		fTasa = objLector.nextFloat();
		
		fInteres = (fCapital * fTasa / 100);
		
		if(fInteres > 7000) {
			fCapitalFinal = (fCapital + fInteres);
			System.out.println("El capital a obtener será: " + fCapitalFinal);
		}
	}
	
	public static void condicionalDoble() {
		Scanner objLector = new Scanner(System.in);
		int iEdad;
		iEdad = 0;
		
		System.out.println("Inrgese su edad: ");
		iEdad = objLector.nextInt();
		
		if(iEdad >= 18) {
			System.out.println("Ud. es mayor de edad");
		} else {
			System.out.println("Usted es calichín");
		}
	}
}

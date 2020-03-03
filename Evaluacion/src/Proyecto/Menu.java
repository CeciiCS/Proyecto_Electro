package Proyecto;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcionElectro, opcionTDT=0;
		int precioBase=0;
		String color= "";
		char consumoEnergetico= ' ';
		double peso=0;
		double carga=0;	
		float resolucion=0.0f;
		boolean sintonizadorTDT=false;
		
		//int[] listaElectro = new int [10]; //arreglo con 10 posiciones
		Scanner sc = new Scanner(System.in);
		
		System.out.println("___________________________________________");
		System.out.println("");
		System.out.println("-- BIENVENIDO AL SISTEMA --");
		System.out.println("___________________________________________");
		System.out.println("");		
		
		ArrayList <Electrodomestico> listaElectro= new ArrayList<Electrodomestico>();
		
		for(int i=0 ; i < 10; i++ ) {
			listaElectro.add(i, null);
		
		System.out.println("::: Ingrese electrodoméstico a la lista :::");
		System.out.println("");
		System.out.println("Electrodomestico " + i);
		System.out.println("1. Lavadora   2. Televisor   3. Otro");
		
		opcionElectro=sc.nextInt();
		
		System.out.println("::: Ingrese color del electrodoméstico :::");
		color=sc.next();
		Electrodomestico color1 = new Electrodomestico();
		color1.comprobarColor(color);
		
		System.out.println("::: Tipo de consumo energético (letras de la A hasta la F en mayúscula) :::");	
		consumoEnergetico=sc.next().charAt(0);
		Electrodomestico cEnerg = new Electrodomestico();
		cEnerg.comprobarConsumoEnergetico(consumoEnergetico);
		
		/*switch (consumoEnergetico) {
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
			System.out.println("** Ingreso correcto **");
			break;
		default:
			System.out.println("** Error: Favor de ingresar letra correcta y en mayúscula **");
			break;
		
		}*/
		
		System.out.println("::: Peso del electrodoméstico :::");
		peso=sc.nextDouble();
		
		
		if (opcionElectro==1) {
			System.out.println("** Ingrese carga de la lavadora **");
			carga=sc.nextDouble();
		}else if (opcionElectro==2) {
			System.out.println("");
			System.out.println("** Se le solicitará la resolución del televisor **");
		}
		
		if (opcionElectro==2) {
			System.out.println("::: Resolución del televisor :::");
			resolucion=sc.nextFloat();
			System.out.println("::: Sintonizador de TDT :::");
			System.out.println("1. SI   2.NO");
			opcionTDT=sc.nextInt();
		}
		
		
		
			
		}

	}

	}



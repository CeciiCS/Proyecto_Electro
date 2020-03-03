package Proyecto;

import java.util.Scanner;

public class Lavadora extends Electrodomestico{

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	private double carga;

	public double getCarga() {
		return carga;
	}

	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + ", precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}

	public Lavadora() {
		super();
		// TODO Auto-generated constructor stub
		this.carga=5;
	}

	public Lavadora(int precioBase, int peso) {
		super(precioBase, peso);
		// TODO Auto-generated constructor stub
		this.carga=5;
	}

	public Lavadora(int carga, int precioBase, String color, char consumoEnergetico, int peso) {
		super(precioBase, color, consumoEnergetico, peso);
		// TODO Auto-generated constructor stub
		this.carga=carga;
	}
	
	public double carga() {
		Scanner sc = new Scanner(System.in);
		int pCarga=0;
		//System.out.println("Ingrese carga/peso de la lavadora");
		carga=sc.nextInt();
		
		if(carga > 30) {
			pCarga=50;
		}
		
		sc.close();
		
		this.precioBase += pCarga;
		
		return this.precioBase;
		
		} 
		
		
	} 
	
		
	


	
	


	
	
		
		
		
		
	

	

	

	
	
	



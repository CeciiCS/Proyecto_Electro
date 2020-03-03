package Proyecto;

import java.util.Scanner;

public class Television extends Electrodomestico{
	
	private float resolucion;
	private boolean sintonizadorTDT;
	
	public float getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	
	@Override
	public String toString() {
		return "Television [resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + ", precioBase="
				+ precioBase + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + "]";
	}

	public Television() {
		super();
		// TODO Auto-generated constructor stub
		this.resolucion=20;
		this.sintonizadorTDT=false;
		
	}

	public Television(int precioBase, int peso) {
		super(precioBase, peso);
		// TODO Auto-generated constructor stub
		this.resolucion=20;
		this.sintonizadorTDT=false;
	}

	public Television(float resolucion, boolean sintonizadorTDT, int precioBase, String color, char consumoEnergetico, int peso) {
		super(precioBase, color, consumoEnergetico, peso);
		// TODO Auto-generated constructor stub
		this.resolucion=resolucion;
		this.sintonizadorTDT=sintonizadorTDT;
	}
	
	public void resolucion(){
		Scanner sc = new Scanner(System.in);
		double pRes;
		System.out.println("Ingrese resolucion de televisor");
		resolucion=sc.nextFloat();
		
		if(resolucion > 40) {
			pRes=(this.precioBase*1.30)+this.precioBase;
	
		System.out.println("Con esa resolución, el valor es de: " +pRes);
			
		} else if (resolucion <= 40) {
			pRes=(this.precioBase);
		
		System.out.println("Con resolución menor o igual a 40, el valor es de: " + precioBase);
			
		} sc.close();
	}
	
	
	public void sintonizadorTDT() {
		Scanner scn = new Scanner(System.in);
		int opcion;
		double pSint;
		//double pRes;
		
		System.out.println("¿Tiene sintonizador TDT?");
		
		System.out.println("1. SI   2. NO");
		opcion=scn.nextInt();
		switch(opcion) {
		case 1:
			System.out.println("SI");
			break;
		case 2:
			System.out.println("NO");
			break;
		default:
			System.out.println("Solo opcion 1 y 2");
		
		if(opcion==1) {
			pSint=(this.precioBase+50);
		
		System.out.println("Con sintonizador TDT, su precio es de: " +pSint);
		
	
		}else System.out.println("Sin sintonizador TDT, su precio es de: " + precioBase);
	
		
		} scn.close();
	
	}
	
	

}

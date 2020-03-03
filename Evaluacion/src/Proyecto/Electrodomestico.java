package Proyecto;

public class Electrodomestico {
	
	//ingreso de variables clase electromésticos
	int precioBase=0;
	String color= "";
	char consumoEnergetico= ' ';
	double peso=0;
	
	//constructores clase electrodomésticos

	public Electrodomestico() { //constructor por defecto
		//super();
		this.precioBase = 100;
		this.color = "blanco";
		this.consumoEnergetico = 'F';
		this.peso = 5;
		
	}
	public Electrodomestico(int precioBase, String color, char consumoEnergetico, double peso) {//nstructor con todos los atributos
		//super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
		
	}
	public Electrodomestico(int precioBase, double peso) {// con atributos peso y precio final
		//super();
		this.precioBase = 100;
		this.color = "blanco";
		this.consumoEnergetico = 'F';
		this.peso = 5;
	}
		
	//getters clase electrodomésticos
		
	public int getPrecioBase() {
		return precioBase;
	}
	public String getColor() {
		return color;
	}
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}
	public double getPeso() {
		return peso;
	}
	
	
	//métodos de la clase
	
	/*public void comprobarConsumoEnergetico(char letra) { //comprobación del consumo energético del electrodoméstico
			
		if(consumoEnergetico!='A'||consumoEnergetico!= 'B' ||consumoEnergetico!= 'C' ||consumoEnergetico!= 'D' ||consumoEnergetico!= 'E' ||consumoEnergetico!= 'F') {
			consumoEnergetico='F';
			
	
		}*/
	
	
	public void comprobarColor(String color) { //color del electrodoméstico
		if(color!="blanco" || color!="negro" || color!="rojo" || color!= "azul" || color!="gris") {
			color="blanco";
		}
	
	}
	
	private int calcularPrecio() {
		int aumentoPrecio=0;
		
		this.comprobarConsumoEnergetico(this.consumoEnergetico);
		if(this.peso>=0&& this.peso<=19) {
			aumentoPrecio=10;
		}else if(this.peso>=20 && this.peso<=49) {
			aumentoPrecio=50;
		}else if(this.peso>=50 && this.peso<=79) {
			aumentoPrecio=80;
		}else
			aumentoPrecio=100;	
		
		this.precioBase += aumentoPrecio;
		
		return this.precioBase;
		
		
	}
	
	public void comprobarConsumoEnergetico(char letra) {
		@SuppressWarnings("unused") // ver que significa
		boolean ok=false;
		switch(letra) {
		case 'A':
			ok=true;
			this.precioBase=100;			
			break;
		case 'B':
			ok=true;
			this.precioBase=80;	
			break;
		case 'C':
			ok=true;
			this.precioBase=60;	
			break;
		case 'D':
			ok=true;
			this.precioBase=50;			
			break;
		case 'E':
			ok=true;
			this.precioBase=30;			
			break;
		case 'F':
			ok=true;
			this.precioBase=10;			
			break;
		default:
			System.out.println("Dato inválido");
		
		}
}
		public int precioFinal() {
			return calcularPrecio();
		}
	
	


	}



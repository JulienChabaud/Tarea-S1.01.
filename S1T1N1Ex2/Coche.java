package S1T1N1Ex2;

/*Crea una clase "Coche" con los atributos: marca, modelo y potencia. La marca debe ser estático final, el modelo estático y la potencia final.
Demuestra la diferencia entre los tres. ¿Hay alguno que pueda inicializarse al constructor de la clase?
Añade dos métodos a la clase "Coche". Un método estático llamado frenar() y otro no estático llamado acelerar().
El método acelerar debe mostrar por consola: "El vehículo está acelerando" y el método frenar() debe mostrar: "El vehículo está frenando". 
Demuestra cómo invocar el método estático y el no estático desde el main() de la clase principal.*/

public class Coche {
	private static final String  marca = "Honda";
	private static 		 String  modelo;
	private final 		 int 	 potencia;
	
	//constructor
	public Coche (String marca, String modelo, int potencia) {
		//this.marca = marca;
		Coche.modelo = modelo;
		this.potencia = potencia;
	}
	
	//getter
	public String getMarca() {
		return Coche.marca;
	}
	public String getModelo() {
		return Coche.modelo;
	}
	public int getPotencia() {
		return this.potencia;
	}
	
	//setter
	/*public void setMarca(String marca) {
		this.marca = marca;
	}*/
	public void setModelo(String modelo) {
		Coche.modelo = modelo;
	}
	/*public void setPotencia(int potencia) {
		this.potencia = potencia;
	}*/
	
	//metodo genral
	public static String frenar() {
		return "El vehículo está frenando";
	}
	
	public String acelerar() {
		return "El vehículo está acelerando";
	}

}

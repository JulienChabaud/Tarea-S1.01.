package S1T1N1Ex2;

/*Crea una clase "Coche" con los atributos: marca, modelo y potencia. La marca debe ser estático final, el modelo estático y la potencia final.
Demuestra la diferencia entre los tres. ¿Hay alguno que pueda inicializarse al constructor de la clase?
Añade dos métodos a la clase "Coche". Un método estático llamado frenar() y otro no estático llamado acelerar().
El método acelerar debe mostrar por consola: "El vehículo está acelerando" y el método frenar() debe mostrar: "El vehículo está frenando". 
Demuestra cómo invocar el método estático y el no estático desde el main() de la clase principal.*/

public class S1T1N1Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche coche1 = new Coche("Toyota", "Corola", 125);
		Coche coche2 = new Coche("Honda", "Civic", 110);
		
		System.out.println(coche1.getMarca() + " " + coche1.getModelo() + " " + coche1.getPotencia());
		System.out.println(coche2.getMarca() + " " + coche2.getModelo() + " " + coche2.getPotencia());
		
		System.out.println(coche1.acelerar() + " el vehiculo es " + coche1.getMarca() + " " + coche1.getModelo() + " con una potencia de  " + coche1.getPotencia() + " caballos.");
		System.out.println(coche2.acelerar() + " el vehiculo es " + coche2.getMarca() + " " + coche2.getModelo() + " con una potencia de  " + coche2.getPotencia() + " caballos.");
		
		System.out.println(coche1.frenar() + " el vehiculo es " + coche1.getMarca() + " " + coche1.getModelo() + " con una potencia de  " + coche1.getPotencia() + " caballos.");
		System.out.println(Coche.frenar() + " el vehiculo es " + coche1.getMarca() + " " + coche1.getModelo() + " con una potencia de  " + coche1.getPotencia() + " caballos.");
		
		System.out.println(coche2.frenar() + " el vehiculo es " + coche2.getMarca() + " " + coche2.getModelo() + " con una potencia de  " + coche2.getPotencia() + " caballos.");
		System.out.println(Coche.frenar() + " el vehiculo es " + coche2.getMarca() + " " + coche2.getModelo() + " con una potencia de  " + coche2.getPotencia() + " caballos.");
		

	}

}

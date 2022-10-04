package S1T1N2;
/*Crea una clase llamada "Teléfono" con los atributos marca y modelo, y el método llamar(). Este método debe recibir un String con un número de teléfono.
  El método debe mostrar por consola un mensaje diciendo que se está llamando al número recibido por parámetro.  
  Crea una interfaz llamada "Cámara" con el método fotografiar(), y otra interfaz llamada Reloj con el método alarma().
  Crea una clase llamada "Smartphone" que sea subclase de "Teléfono" y que a su vez implemente las interfaces "Camera" y "Reloj".
  El método fotografiar() debe mostrar por consola: "Se está haciendo una foto" y el método alarma() debe mostrar: "Está sonando la alarma".
  Desde el main() de la aplicación, crea un objeto Smartphone y llama a los métodos anteriores.*/

import java.util.Scanner;

public class S1T1N2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		Smartphone smartphone1 = new Smartphone("ONEPLUSE", "A6003");
		
		System.out.println("La marca de su Smartphone es " + smartphone1.getMarca() + " y el modelo es " + smartphone1.getModelo());
		
		int opcion = 0;
		String resp = "";
		
		do {
            System.out.println("Elija una opcion de la aplicacion \n"
                    + "1. LLAMAR \n"
                    + "2. CAMARA \n"
                    + "3. ALARMA \n"
                    + "0. SALIR.");
                    
            opcion = entrada.nextInt();
                    
                    switch (opcion) {
                    case 1:
                        resp = smartphone1.llamar();
                        break;
                    case 2:
                        resp = smartphone1.fotografiar();
                        break;
                    case 3:
                        resp = smartphone1.alarma();
                        break;
                    case 0:
                        resp = "Adios.";
                        break;
                }
                System.out.println(resp);
            } while (opcion != 0);
                    

	}

}

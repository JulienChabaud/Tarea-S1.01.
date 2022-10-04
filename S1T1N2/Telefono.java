package S1T1N2;

import java.util.Scanner;

public class Telefono {
	
	private String marca;
	private String modelo;
	
	//constructro
	
	public Telefono (String marca, String modelo ) {
		
		this.marca = marca;
		this.modelo = modelo;
	}
	
	//Getter
	
	public String getMarca() {
		return this.marca;
	}
	public String getModelo(){
		return this.modelo;
	}
	
	//Setter
	
	public void setMarca(String marca){
		this.marca = marca;
	}
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	
	//metodo general
	public String llamar(){
		Scanner entrada = new Scanner(System.in);
		String num = "";
		System.out.println("Marcar el numero de telefono que desea llamar. ");
		num = entrada.nextLine();
		return "Está llamando al número " + num;
	}

}

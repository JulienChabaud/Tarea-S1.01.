package S1T1N2;

public class Smartphone extends Telefono implements Camara, Reloj{
	
	
	//constructor
	public Smartphone(String marca, String modelo){
		super (marca, modelo);
	}
	
	//metodos general 
	
	public String fotografiar(){
		return "Se está haciendo una foto";
	}
	
	public String alarma(){
		return "Está sonando la alarma";
	}

}

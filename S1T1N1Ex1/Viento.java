package S1T1N1Ex1;

public class Viento extends Instrumento {
	
	{System.out.println(" se a creado correctamente el instrumento de viento.");}
	
	//metod constructor
	public Viento (String nom, int precio) {
		super(nom, precio);
	}
	//llamar el metodo abstracto de la super clase
	public String tocar() {
		return "Está sonando un instrumento de viento.";
	}

}

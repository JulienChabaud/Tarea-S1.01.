package S1T1N1Ex1;

public class Percusion extends Instrumento {
	{System.out.println(" se a creado correctamente el instrumento de percusion.");}
	
	//metod constructor
			public Percusion (String nom, int precio) {
				super(nom, precio);
			}
			//llamar el metodo abstracto de la super clase
			public String tocar() {
				return "Está sonando un instrumento de percusión.";
			}

}

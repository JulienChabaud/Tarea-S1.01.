package S1T1N1Ex1;

public abstract class Instrumento {
	static {System.out.println("iniciando programa");}
	//atributos
	private String nom;
	private int precio;
	
	//metodo constructor
	public Instrumento (String nom, int precio) {
		this.nom = nom;
		this.precio = precio;
	}
	
	//getter
	public String getNom() {
		return this.nom;
	}
	public int getPrecio() {
		return this.precio;
	}
	
	//setter
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	//metodo abstacto
	public abstract String tocar();

}

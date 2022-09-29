package S1T1N1Ex1;

/*En un grupo de música existen diferentes tipos de instrumentos musicales. Hay instrumentos de viento, cuerda y percusión.

Todos los instrumentos tienen como atributos su nombre y precio. Además, tienen un método llamado tocar(). 
Éste es abstracto en la clase instrumento y, por tanto, debe implementarse en las clases hijas.
 Si se está tocando un instrumento de viento, el método debe mostrar por consola: "Está sonando un instrumento de viento", si se está tocando un instrumento de cuerda:
  "Está sonando un instrumento de cuerda" y si se está tocando un instrumento de percusión: "Está sonando un instrumento de percusión".

El proceso de carga de una clase sólo tiene lugar una vez. 
Demuestra que la carga puede ser provocada por la creación de la primera instancia de esta clase o por el acceso a un miembro estático de ésta. 
Buscar información sobre los blogs de inicialización y blogs estáticos en Java.*/

public class GrupoMusical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Viento viento1 = new Viento("trompeta", 58);
		Cuerda cuerda1 = new Cuerda("Bajo", 96);
		Percusion percusion1 = new Percusion("redoblante", 52);
		Viento viento2 = new Viento("clarinete", 66);
		Cuerda cuerda2 =new Cuerda("piano", 115);
		Percusion percusion2 = new Percusion("granadero", 48);
		
		System.out.println(viento1.tocar() + " Es la " + viento1.getNom() + " con un valor de " + viento1.getPrecio() + " Euros.");
		System.out.println(cuerda1.tocar() + " Es la " + cuerda1.getNom() + " con un valor de " + cuerda1.getPrecio() + " Euros.");
		System.out.println(percusion1.tocar() + " Es la " + percusion1.getNom() + " con un valor de " + percusion1.getPrecio() + " Euros.");
		System.out.println(viento2.tocar() + " Es la " + viento2.getNom() + " con un valor de " + viento2.getPrecio() + " Euros.");
		System.out.println(cuerda2.tocar() + " Es la " + cuerda2.getNom() + " con un valor de " + cuerda2.getPrecio() + " Euros.");
		System.out.println(percusion2.tocar() + " Es la " + percusion2.getNom() + " con un valor de " + percusion2.getPrecio() + " Euros.");
		
		

	}
}

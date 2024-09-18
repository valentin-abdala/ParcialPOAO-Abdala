package LectoresFelices;

public class Libros {
	private String titulo;
	private String autor;
	private int anoLanzamiento;
	private int mesLanzamiento;
	private int diaLanzamiento;
	private boolean disponible;
	private String fechaPrestamo;
	private boolean miembroPlus;
	
	public Libros(String titulo, String autor, int anoLanzamiento, int mesLanzamiento, int diaLanzamiento, boolean disponible, String fechaPrestamo, boolean miembroPlus) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoLanzamiento = anoLanzamiento;
		this.mesLanzamiento = mesLanzamiento;
		this.diaLanzamiento = diaLanzamiento;
		this.disponible = disponible;
		this.fechaPrestamo = fechaPrestamo;
		this.miembroPlus = miembroPlus;
	}
}

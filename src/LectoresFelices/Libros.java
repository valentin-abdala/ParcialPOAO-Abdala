package LectoresFelices;

import java.time.LocalDate;

public class Libros {
	private String titulo;
	private String autor;
	private LocalDate lanzamiento;
	private boolean disponible;
	private LocalDate fechaPrestamo;
	private boolean miembroPlus;
	private String nombrePrestatario;
	private int telefonoPrestatario;
	
	public Libros(String titulo, String autor, LocalDate lanzamiento, boolean disponible, LocalDate fechaPrestamo, boolean miembroPlus, String nombrePrestatario, int telefonoPrestatario) {
		this.titulo = titulo;
		this.autor = autor;
		this.lanzamiento = lanzamiento;
		this.disponible = disponible;
		this.fechaPrestamo = fechaPrestamo;
		this.miembroPlus = miembroPlus;
		this.nombrePrestatario = nombrePrestatario;
		this.telefonoPrestatario = telefonoPrestatario;
	}
	
	public Libros(String titulo, String autor, LocalDate lanzamiento, boolean disponible) {
		this.titulo = titulo;
		this.autor = autor;
		this.lanzamiento = lanzamiento;
		this.disponible = disponible;
		this.fechaPrestamo = null;
		this.miembroPlus = false;
		this.nombrePrestatario = "Sin prestatario";
		this.telefonoPrestatario = 00000000;
	}
}

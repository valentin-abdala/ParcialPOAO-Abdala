package LectoresFelices;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Libros {
	private String titulo;
	private String autor;
	private LocalDate lanzamiento;
	private boolean disponible;
	private LocalDate fechaPrestamo;
	private LocalDate fechaDevolucion;
	private boolean miembroPlus;
	private String nombrePrestatario;
	private int telefonoPrestatario;
	
	public Libros(String titulo, String autor, LocalDate lanzamiento, boolean disponible, LocalDate fechaPrestamo, LocalDate fechaDevolucion, boolean miembroPlus, String nombrePrestatario, int telefonoPrestatario) {
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
		this.fechaDevolucion = null;
		this.miembroPlus = false;
		this.nombrePrestatario = "Sin prestatario";
		this.telefonoPrestatario = 00000000;
	}
	
	public String getNombre() {
		return this.nombrePrestatario;
	}
	
	public void setNombre(String nombre) {
		this.nombrePrestatario = nombre;
	}
	
	public int getTelefono() {
		return this.telefonoPrestatario;
	}
	
	public void setTelefono(int telefono) {
		this.telefonoPrestatario = telefono;
	}
	
	public boolean getMiembroPlus() {
		return this.miembroPlus;
	}
	
	public void setMiembroPlus(boolean miembroPlus) {
		this.miembroPlus = miembroPlus;
	}
	
	public LocalDate getFechaPrestamo() {
		return this.fechaPrestamo;
	}
	
	public void setFechaPrestamo(LocalDate fecha) {
		this.fechaPrestamo = fecha;
	}
	
	public void prestarLibro() {
		String nombre;
		int telefono;
		String miembroPlus;
		if (!this.disponible) {
			if (this.miembroPlus) {
				JOptionPane.showMessageDialog(null, this.titulo + " no se encuentra disponible.\n" + this.nombrePrestatario + " lo tiene desde " + this.fechaPrestamo + " y al ser miembro plus tiene hasta un mes hasta " + this.fechaPrestamo.plusDays(30) + ".");
			} else {
				JOptionPane.showMessageDialog(null, this.titulo + " no se encuentra disponible.\n" + this.nombrePrestatario + " lo tiene desde " + this.fechaPrestamo + " hasta " + this.fechaPrestamo.plusDays(14) + ".");
			}
		} else {
			nombre = JOptionPane.showInputDialog("Ingresa el nombre del prestatario.");
			setNombre(nombre);
			telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el teléfono del prestatario."));
			setTelefono(telefono);
			do {
				miembroPlus = JOptionPane.showInputDialog("¿Es miembro plus?");
			} while (!miembroPlus.equalsIgnoreCase("si") || !miembroPlus.equalsIgnoreCase("no"));
			setFechaPrestamo(LocalDate.now());
			if (miembroPlus.equalsIgnoreCase("si")) {
				setMiembroPlus(true);
			} else if (miembroPlus.equalsIgnoreCase("no")) {
				setMiembroPlus(false);
			}
			
		}
	}
}

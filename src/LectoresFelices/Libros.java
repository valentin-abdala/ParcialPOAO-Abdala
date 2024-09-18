package LectoresFelices;

import java.time.LocalDate;
import java.time.LocalTime;

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
	
	public boolean getDisponible() {
		return this.disponible;
	}
	
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	public LocalDate getFechaPrestamo() {
		return this.fechaPrestamo;
	}
	
	public void setFechaPrestamo(LocalDate fecha) {
		this.fechaPrestamo = fecha;
	}
	
	public LocalDate getFechaDevolucion() {
		return this.fechaDevolucion;
	}
	
	public void setFechaDevolucion(LocalDate fecha) {
		this.fechaDevolucion = fecha;
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
	
	public void prestarLibro() {
		String nombre;
		int telefono;
		int miembroPlus;
		if (!this.disponible) {
			if (this.miembroPlus) {
				JOptionPane.showMessageDialog(null, this.titulo + " no se encuentra disponible.\n" + this.nombrePrestatario + " lo tiene desde " + this.fechaPrestamo + " y al ser miembro plus tiene hasta un mes hasta " + this.fechaPrestamo.plusDays(30) + ".");
			} else {
				JOptionPane.showMessageDialog(null, this.titulo + " no se encuentra disponible.\n" + this.nombrePrestatario + " lo tiene desde " + this.fechaPrestamo + " hasta " + this.fechaPrestamo.plusDays(14) + ".");
			}
		} else {
			setDisponible(false);
			do {
				nombre = JOptionPane.showInputDialog("Ingresa el nombre del prestatario.");
			} while (!validarCadena(nombre));
			setNombre(nombre);
			do {
				telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el teléfono del prestatario."));
			} while (!validarNumero(telefono));
			setTelefono(telefono);
			do {
				miembroPlus = JOptionPane.showConfirmDialog(null, "¿Es miembro plus?");
			} while (miembroPlus == JOptionPane.CANCEL_OPTION);
			setFechaPrestamo(LocalDate.now());
			if (miembroPlus == JOptionPane.YES_OPTION) {
				setMiembroPlus(true);
				setFechaDevolucion(this.fechaPrestamo.plusDays(30));
				JOptionPane.showMessageDialog(null, "Préstamo realizado con éxito.\nLibro: " + this.titulo + "\nPrestatario: " + nombre + "\nTeléfono del prestatario: " + telefono + "\nFecha del préstamo: " + fechaPrestamo + "\nHora del préstamo: " + LocalTime.now() + "\nFecha de devolución: " + this.fechaPrestamo.plusDays(30));
			} else if (miembroPlus == JOptionPane.NO_OPTION) {
				setMiembroPlus(false);
				setFechaDevolucion(this.fechaPrestamo.plusDays(14));
				JOptionPane.showMessageDialog(null, "Préstamo realizado con éxito.\nLibro: " + this.titulo + "\nPrestatario: " + nombre + "\nTeléfono del prestatario: " + telefono + "\nFecha del préstamo: " + fechaPrestamo + "\nHora del préstamo: " + LocalTime.now() + "\nFecha de devolución: " + this.fechaPrestamo.plusDays(14));
			}
		}
	}
	
	public void consultarLibro() {
		if (!this.disponible) {
			JOptionPane.showMessageDialog(null, "Libro: " + this.titulo + "\nAutor: " + this.autor + "\nFecha de lanzamiento: " + lanzamiento + "\nDisponible: Prestado hasta " + fechaDevolucion + "\nPrestatario: " + this.nombrePrestatario + "\nTeléfono: " + this.telefonoPrestatario);
		} else {
			JOptionPane.showMessageDialog(null, "Libro: " + this.titulo + "\nAutor: " + this.autor + "\nFecha de lanzamiento: " + lanzamiento + "\nDisponible: Sí" + "\nPrestatario: " + this.nombrePrestatario + "\nTeléfono: " + this.telefonoPrestatario);
		}
	}
	
	public static boolean validarCadena(String cadena) {
		if (cadena.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}
	
	public static boolean validarNumero(int numero) {
		if (numero < 0) {
			return false;
		} else {
			return true;
		}
	}
}
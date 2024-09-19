package AmigosPeludos;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.JOptionPane;

public class Pacientes {
	private String nombreAnimal;
	private String animal;
	private String raza;
	private int edad;
	private double peso;
	private String sexo;
	private String nombreDueno;
	private int telefono;
	private LocalDate fechaTurno;
	private LocalTime horaTurno;
	
	public Pacientes(String nombreAnimal, String animal, String raza, int edad, double peso, String sexo, String nombreDueno, int telefono, LocalDate fechaTurno, LocalTime horaTurno) {
		this.nombreAnimal = nombreAnimal;
		this.animal = animal;
		this.raza = raza;
		this.edad = edad;
		this.peso = peso;
		this.sexo = sexo;
		this.nombreDueno = nombreDueno;
		this.telefono = telefono;
		this.fechaTurno = fechaTurno;
		this.horaTurno = horaTurno;
	}
	
	public Pacientes(String nombreAnimal, String animal, String raza, int edad, String nombreDueno, int telefono, LocalDate fechaTurno, LocalTime horaTurno) {
		this.nombreAnimal = nombreAnimal;
		this.animal = animal;
		this.raza = raza;
		this.edad = edad;
		this.peso = 0;
		this.sexo = "Sin definir";
		this.nombreDueno = nombreDueno;
		this.telefono = telefono;
		this.fechaTurno = fechaTurno;
		this.horaTurno = horaTurno;
	}
	
	public Pacientes crearTurno() {
		do {
			this.nombreAnimal = JOptionPane.showInputDialog("Ingresa el nombre del paciente.");
		} while (!validarCadena(this.nombreAnimal));
		
		do {
			this.animal = JOptionPane.showInputDialog("Ingresa el tipo de animal del paciente.");
		} while (!validarCadena(this.animal));
		
		do {
			this.raza = JOptionPane.showInputDialog("Ingresa la raza del paciente.");
		} while (!validarCadena(this.raza));
		
		do {
			this.edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del paciente."));
		} while (!validarInt(this.edad));
		
		do {
			this.nombreDueno = JOptionPane.showInputDialog("Ingresa el nombre del dueño.");
		} while (!validarCadena(this.nombreDueno));
		
		do {
			this.telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el teléfono del dueño."));
		} while (!validarInt(this.telefono));
		
		int mes;
		do {
			mes = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes del turno."));
		} while (!validarInt(mes));
		
		int dia;
		do {
			dia = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el día del turno."));
		} while (!validarInt(dia));
		
		int hora;
		do {
			hora = Integer.parseInt(JOptionPane.showInputDialog("Ingresa hora del turno."));
		} while (!validarInt(hora));
		
		int minuto;
		do {
			minuto = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el minuto del turno."));
		} while (!validarInt(minuto));
		
		this.fechaTurno = LocalDate.of(2024, mes, dia);
		this.horaTurno = LocalTime.of(hora, minuto);
		
		Pacientes paciente = new Pacientes(this.nombreAnimal, this.animal, this.raza, this.edad, this.nombreDueno, this.telefono, this.fechaTurno, this.horaTurno);
		
		return paciente;
	}
	
	public static boolean validarCadena(String cadena) {
		if (cadena.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}
	
	public static boolean validarInt(int numero) {
		if (numero < 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public static boolean validarDouble(double numero) {
		if (numero < 0) {
			return false;
		} else {
			return true;
		}
	}
}

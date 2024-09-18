package AmigosPeludos;

import java.time.LocalDate;
import java.time.LocalTime;

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
	private String medicaciones;
	private String vacunas;
	private String alergias;
	private String operaciones;
	
	public Pacientes(String nombreAnimal, String animal, String raza, int edad, double peso, String sexo, String nombreDueno, int telefono, LocalDate fechaTurno, LocalTime horaTurno, String medicaciones, String vacunas, String alergias, String operaciones) {
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
		this.medicaciones = medicaciones;
		this.vacunas = vacunas;
		this.alergias = alergias;
		this.operaciones = operaciones;
	}
}

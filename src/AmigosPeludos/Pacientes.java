package AmigosPeludos;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.JOptionPane;

public class Pacientes {
	private String nombreAnimal;
	private String animal;
	private String raza;
	private int edad;
	private String nombreDueno;
	private int telefono;
	private LocalDate fechaTurno;
	private LocalTime horaTurno;
	private double peso;
	private double temperatura;
	private int contracturas;
	private int observaciones;
	
	public Pacientes(String nombreAnimal, String animal, String raza, int edad, String sexo, String nombreDueno, int telefono, LocalDate fechaTurno, LocalTime horaTurno, double peso, double temperatura, int contracturas, int observaciones) {
		this.nombreAnimal = nombreAnimal;
		this.animal = animal;
		this.raza = raza;
		this.edad = edad;
		this.nombreDueno = nombreDueno;
		this.telefono = telefono;
		this.fechaTurno = fechaTurno;
		this.horaTurno = horaTurno;
		this.peso = peso;
		this.temperatura = temperatura;
		this.contracturas = contracturas;
		this.observaciones = observaciones;
	}
	
	public Pacientes(String nombreAnimal, String animal, String raza, int edad, String nombreDueno, int telefono, LocalDate fechaTurno, LocalTime horaTurno) {
		this.nombreAnimal = nombreAnimal;
		this.animal = animal;
		this.raza = raza;
		this.edad = edad;
		this.peso = 0;
		this.nombreDueno = nombreDueno;
		this.telefono = telefono;
		this.fechaTurno = fechaTurno;
		this.horaTurno = horaTurno;
		this.peso = 0;
		this.temperatura = 0;
		this.contracturas = 0;
		this.observaciones = 0;
	}
	
	public static Pacientes crearTurno() {
		String nombreAnimal, animal, raza, nombreDueno;
		int edad, telefono, mes, dia, hora, minuto;
		
		do {
			nombreAnimal = JOptionPane.showInputDialog("Ingresa el nombre del paciente.");
		} while (!validarCadena(nombreAnimal));
		
		do {
			animal = JOptionPane.showInputDialog("Ingresa el tipo de animal del paciente.");
		} while (!validarCadena(animal));
		
		do {
			raza = JOptionPane.showInputDialog("Ingresa la raza del paciente.");
		} while (!validarCadena(raza));
		
		do {
			edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del paciente."));
		} while (!validarInt(edad));
		
		do {
			nombreDueno = JOptionPane.showInputDialog("Ingresa el nombre del dueño.");
		} while (!validarCadena(nombreDueno));
		
		do {
			telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el teléfono del dueño."));
		} while (!validarInt(telefono));
		
		do {
			mes = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes del turno."));
		} while (!validarInt(mes));
		
		do {
			dia = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el día del turno."));
		} while (!validarInt(dia));
		
		do {
			hora = Integer.parseInt(JOptionPane.showInputDialog("Ingresa hora del turno."));
		} while (!validarInt(hora));
		
		do {
			minuto = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el minuto del turno."));
		} while (!validarInt(minuto));
		
		Pacientes paciente = new Pacientes(nombreAnimal, animal, raza, edad, nombreDueno, telefono, LocalDate.of(2024, mes, dia), LocalTime.of(hora, minuto));
		
		return paciente;
	}
	
	public void empezarTurno() {
		String[] procedimientos = { "Balanza", "Termómetro", "Revisar", "Observar", "Ver informe", "Salir" };
		JOptionPane.showMessageDialog(null, "Nombre: " + this.nombreAnimal + "\nAnimal: " + this.animal + "\nRaza: " + this.raza + "\nEdad: " + this.edad + "\nNombre del dueño: " + this.nombreDueno + "\nTeléfono: " + this.telefono + "\nFecha: " + this.fechaTurno + "\nHora: " + this.horaTurno);
		String informe = "Informe de " + this.nombreAnimal;
		int opcion;
		
		do {
			opcion = JOptionPane.showOptionDialog(null, this.nombreAnimal, "Menú", 0, JOptionPane.DEFAULT_OPTION, null, procedimientos, procedimientos[0]);
			
			switch (opcion) {
			case 0:
				JOptionPane.showMessageDialog(null, "Pesando a " + this.nombreAnimal + "...");
				this.peso = (double)(Math.random() * 13 + 1);
				informe = informe + "\nPESO\n" + "Peso: " + this.peso;
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "Tomando temperatura corporal de " + this.nombreAnimal + "...");
				this.temperatura = (double)(Math.random() * 5 + 36);
				if (this.temperatura > 37) {
					informe = informe + "\nTEMPERATURA\n" + "Temperatura: " + this.temperatura + "\nDebe tomar medicamento cada 8 horas.";
				} else {
					informe = informe + "\nTEMPERATURA\n" + "Temperatura: " + this.temperatura;
				}
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Revisando a " + this.nombreAnimal + "...");
				this.contracturas = (int)(Math.random());
				if (this.contracturas == 0) {
					informe = informe + "\nCONTRACTURAS\n" + "No tiene contracturas.";
				} else {
					informe = informe + "\nCONTRACTURAS\n" + "Tiene contracturas en la espalda. Debe hacer una radiografía.";
				}
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Observando a " + this.nombreAnimal + "...");
				this.observaciones = (int)(Math.random() * 4);
				switch (this.observaciones) {
				case 0:
					informe = informe + "\nOBSERVACIONES\n" + "Parece estar bien.";
					break;
				case 1:
					informe = informe + "\nOBSERVACIONES\n" + "Tiene un problema respiratorio. Debe volver.";
					int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes del próximo turno"));
					int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el día del próximo turno"));
					int hora = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el hora del próximo turno"));
					int minuto = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el minuto del próximo turno"));
					this.fechaTurno = LocalDate.of(2024, mes, dia);
					this.horaTurno = LocalTime.of(hora, minuto);
					informe = informe + "\nPróximo turno: " + this.fechaTurno + " - " + this.horaTurno;
					break;
				case 2:
					informe = informe + "\nOBSERVACIONES\n" + "Tiene un problema cardíaco. Debe ir al cardiólogo.";
					break;
				case 3:
					informe = informe + "\nOBSERVACIONES\n" + "Tiene un problema en los huesos. Debe ir al traumatólogo.";
					break;
				}
				break;
			case 4:
				JOptionPane.showMessageDialog(null, informe);
				break;
			}
		} while (opcion != 5);
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
}
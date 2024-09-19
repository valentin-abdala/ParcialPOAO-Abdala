package AmigosPeludos;

import java.time.LocalDate;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		JOptionPane.showMessageDialog(null, LocalDate.now() + " - Comenzar turno", "Iniciando", JOptionPane.DEFAULT_OPTION, new ImageIcon(main.class.getResource("/img/veterinaria.png")));
		Pacientes paciente1 = Pacientes.crearTurno();
		paciente1.empezarTurno();
		
		Pacientes paciente2 = Pacientes.crearTurno();
		paciente2.empezarTurno();
		
		Pacientes paciente3 = Pacientes.crearTurno();
		paciente3.empezarTurno();
	}
}
package LectoresFelices;

import java.time.LocalDate;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String libroPrestado;
		
		JOptionPane.showMessageDialog(null, "Iniciando administración de Lectores Felices...", "Iniciando", JOptionPane.DEFAULT_OPTION, new ImageIcon(main.class.getResource("/img/libreria.jpg")));
		String[] opciones = { "Prestar libro", "Consultar colección", "Agregar libro", "Salir" };
		
		LocalDate harryPotterLanzamiento = LocalDate.of(1997, 6, 26);
		LocalDate harryPotterPrestamo = LocalDate.of(2024, 9, 12);
		
		String[] coleccion = { "Harry Potter", "El Señor de los Anillos", "Juego de Tronos", "Orgullo y Prejuicio"};
		
		Libros harryPotter = new Libros("Harry Potter", "JK Rowling", harryPotterLanzamiento, true);
		
		int opcion = JOptionPane.showOptionDialog(null, "Bienvenido", "Menu Principal", 0, JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
		switch (opcion) {
		case 0:
			libroPrestado = (String) JOptionPane.showInputDialog(null, "Selecciona el libro.", "Préstamo de libro",
					JOptionPane.PLAIN_MESSAGE, null, coleccion, coleccion[0]);
			
			switch (libroPrestado) {
			case "Harry Potter":
				
				break;
			}
			break;

		}
	}

}

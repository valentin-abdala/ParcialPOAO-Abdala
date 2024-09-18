package LectoresFelices;

import java.time.LocalDate;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String libroPrestado;
		
		JOptionPane.showMessageDialog(null, "Iniciando administración de Lectores Felices...", "Iniciando", JOptionPane.DEFAULT_OPTION, new ImageIcon(main.class.getResource("/img/libreria.jpg")));
		String[] opciones = { "Prestar libro", "Consultar colección", "Salir" };
		
		LocalDate hpLanzamiento = LocalDate.of(1997, 6, 26);
		LocalDate esdlaLanzamiento = LocalDate.of(1954, 7, 29);
		LocalDate jdtLanzamiento = LocalDate.of(1996, 8, 1);
		LocalDate oypLanzamiento = LocalDate.of(1813, 1, 28);
		
		String[] coleccion = { "Harry Potter", "El Señor de los Anillos", "Juego de Tronos", "Orgullo y Prejuicio"};
		
		Libros hp = new Libros("Harry Potter", "JK Rowling", hpLanzamiento, true);
		Libros esdla = new Libros("El Señor de los Anillos", "JRR Tolkien", esdlaLanzamiento, true);
		Libros jdt = new Libros("Juego de Tronos", "George RR Martin", jdtLanzamiento, true);
		Libros oyp = new Libros("Orgullo y Prejuicio", "Jane Austen", oypLanzamiento, true);
		
		int opcion = JOptionPane.showOptionDialog(null, "Bienvenido", "Menu Principal", 0, JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
		do {
			switch (opcion) {
			case 0:
				libroPrestado = (String) JOptionPane.showInputDialog(null, "Selecciona el libro.", "Préstamo de libro",
						JOptionPane.PLAIN_MESSAGE, null, coleccion, coleccion[0]);
				
				switch (libroPrestado) {
				case "Harry Potter":
					hp.prestarLibro();
					break;
				case "El Señor de los Anillos":
					esdla.prestarLibro();
					break;
				case "Juego de Tronos":
					jdt.prestarLibro();
					break;
				case "Orgullo y Prejuicio":
					oyp.prestarLibro();
					break;
				}
				break;
				
			}
			
			opcion = JOptionPane.showOptionDialog(null, "Bienvenido", "Menu Principal", 0, JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
		} while (opcion != 2);
	}

}

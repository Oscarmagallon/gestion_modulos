package gestion_modulos;

import java.util.Scanner;

public class Principal {
	public static void addModulo() {
		for(int i = 0; )
	}
	public static int pintaMenu() {
		Scanner leer = new Scanner(System.in);
		int opc= 0;
		do {
			System.out.println("1- Introduce un nuevo modulo");
			System.out.println("2- Consultar modulos");
			System.out.println("2- Consutar horas cursos");
			System.out.println("4- Salir de la aplicacion");
			System.out.println("Dime una opcion");
			try {
				opc=leer.nextInt();
			} catch (Exception e) {
				opc = 0;
				leer = new Scanner(System.in);
				System.out.println("No puedes escribir ese dato");
			}
			
			
	}while(opc<1 || opc<4);
		return opc;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pintaMenu();
		
		Curso c = new Curso("1 DAW", "Jose Micolau");
		System.out.println(c.toString());
		
		
	}
	

}

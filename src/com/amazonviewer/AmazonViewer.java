package com.amazonviewer;

import java.util.Scanner; 

public class AmazonViewer {

	public static void main(String[] args) {
		
		showMenu();
		
	}

	private static void showMenu() {
		int opcion = 0; 
		int countRows=0;
		Scanner readInput;
		
		readInput = new Scanner(System.in);
		
		System.out.println("¡ BIENVENIDOS A AMAZON VIEWER !");
		System.out.println("");
		System.out.println("Seleccona el número de la opción deseada ");
		System.out.println("1. Movies ");
		System.out.println("2. Series");
		System.out.println("3. Books");
		System.out.println("4. Magazines");
		System.out.println("");
		
		
		do {
			System.out.print(" : ");
			opcion = readInput.nextInt();
			switch(opcion) {
				case 1:
					System.out.println("¡ Lista de Movies !");
					break;
				case 2:
					System.out.println("¡ Lista de Series !");
					break;
				case 3:
					System.out.println("¡ Lista de Books !");
					break;
				case 4:
					System.out.println("¡ Lista de Magazines !");
					break;
				default:
					System.out.println("La opcion deseada no existe! :(");
				break;
			}
		}while(opcion !=0);
	}
}

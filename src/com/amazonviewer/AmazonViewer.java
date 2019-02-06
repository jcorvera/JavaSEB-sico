package com.amazonviewer;

import java.util.Scanner; 
import com.amazonviewer.models.*;

public class AmazonViewer {

	public static void main(String[] args) {
		
		showMenu();
		
	}

	public static void showMenu() {
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
					showMovie();
					break;
				case 2:
					showSerie();
					break;
				case 3:
					showBook();
					break;
				case 4:
					showMagazine();
					break;
				default:
					System.out.println("La opcion deseada no existe! :(");
				break;
			}
		}while(opcion !=0);
	}
	
	public static void showMovie() {
		int exit=0;
		Movie objetoMovie = new Movie();
		
		do {
			System.out.println();
			System.out.println(":: Movies ::");
			System.out.println();
			
		}while(exit != 0);
	}
	
	public static void showBook() {
		int exit=0;
		Book objetoBook = new Book();
		
		do {
			System.out.println();
			System.out.println(":: Books ::");
			System.out.println();
			
		}while(exit != 0);
	}
	
	public static void showChacter() {
		int exit=0;
		Chacter objetoMagazine = new Chacter();
		
		do {
			System.out.println();
			System.out.println(":: Magazines ::");
			System.out.println();
			
		}while(exit != 0);
	}
	
	public static void showMagazine() {
		int exit=0;
		Magazine objetoMovie = new Magazine();
		
		do {
			System.out.println();
			System.out.println(":: Movies ::");
			System.out.println();
			
		}while(exit != 0);
	}
	
	public static void showSerie() {
		int exit=0;
		Serie objetoSerie = new Serie();
		
		do {
			System.out.println();
			System.out.println(":: Series ::");
			System.out.println();
			
		}while(exit != 0);
		
	}
}

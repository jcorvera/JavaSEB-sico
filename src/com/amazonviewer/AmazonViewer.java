package com.amazonviewer;

import java.util.Scanner; 
import com.amazonviewer.models.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Date; 

public class AmazonViewer {
	
	private static Scanner readInput;
	
	private static Scanner scanner() {
		
		return new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		showMenu();
	}

	public static void showMenu() {
		int opcion = 0; 
		int countRows=0;
		
		readInput = scanner();
		
		System.out.println("¡ BIENVENIDOS A AMAZON VIEWER !");
		System.out.println("");
		System.out.println("Seleccona el número de la opción deseada ");
		System.out.println("1. Movies ");
		System.out.println("2. Series");
		System.out.println("3. Books");
		System.out.println("4. Magazines");
		System.out.println("5. Report");
		System.out.println("6. Report Today");
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
				case 5:
					makeReport();
					break;
				case 6:
					makeReport(new Date());
					break;
				default:
					System.out.println("La opcion deseada no existe! :(");
				break;
			}
		}while(opcion !=0);
	}
	
	
	public static void showMovie() {
		int exit=1;
		ArrayList<Movie> movies = Movie.makeMovies();
		do {
			System.out.println();
			System.out.println(":: Movies ::");
			System.out.println();
			
			for(int i=0; i< movies.size(); i++) {
				System.out.println((i+1)+" - "+movies.get(i).getTitle() + " Visto: "+ movies.get(i).isViewed());
			}
			System.out.println("0. Regresar al menu");
			System.out.println();
			System.out.println("¿ Cuál pelicula deseas ver?");
			System.out.println(": ");
			
			readInput = scanner();
			int response = Integer.valueOf(readInput.nextLine());
			
			if(response == 0) {
				showMenu();
			}
			Movie movieSelected = movies.get(response-1);
			movieSelected.setViewed(true);
			Date dateI = movieSelected.startToSee(new Date());
			for(int i=0; i<100000; i++) {
				System.out.println(".....");
			}
			movieSelected.stopToSee(dateI, new Date());
			
			System.out.println("");
			System.out.println("Viste: \n"+ movieSelected);
			System.out.println(" Por: "+ movieSelected.getTimeViewed() +" milisegundos ");
			
			
		}while(exit != 0);
		
		System.out.println("0. Regresar al menu anterior");
	}
	
	public static void showBook() {
		int exit=1;
		LinkedList<Book> books = Book.makeBooks();
		
		do {
			System.out.println();
			System.out.println(":: Books ::");
			System.out.println();
			
			for(int i=0; i< books.size(); i++) {
				System.out.println((i+1)+" - "+books.get(i).getTitle()+" Visto: "+books.get(i).isRead());
			}
			
			System.out.println("0. Regresar al menu");
			System.out.println();
			System.out.println("¿ Cuál libro deseas ver?");
			System.out.println(": ");
			
			readInput = scanner();
			int response = Integer.valueOf(readInput.nextLine());
			
			if(response == 0) {
				showMenu();
			}
			
			Book bookSelected = books.get(response-1);
			bookSelected.setRead(true);
			Date dateI = bookSelected.startToSee(new Date());
			for(int i=0; i<100000; i++) {
				System.out.println(".....");
			}
			bookSelected.stopToSee(dateI, new Date());
			
			System.out.println("");
			System.out.println("Viste: \n"+ bookSelected);
			System.out.println(" Por: "+ bookSelected.getTimeRead() +" milisegundos ");
			
		}while(exit != 0);
	}
	
	public static void showChacter() {
		int exit=0;
		//Chapter objetoMagazine = new Chapter();
		
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
		//Serie objetoSerie = new Serie();
		
		do {
			System.out.println();
			System.out.println(":: Series ::");
			System.out.println();
			
		}while(exit != 0);
		
	}
	
	public static void makeReport() {
	
	}
	
	public static void makeReport(Date date) {
		
	}
}

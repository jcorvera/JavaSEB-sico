package com.amazonviewer.models;

import java.util.LinkedList;
import java.util.Date;
import com.amazonviewer.interfaces.IVisualizable; 

public class Book extends publication implements IVisualizable{

	private String isbn;
	private boolean read;
	private int timeRead;
	
	
	
	public Book(String title, Date editionDate, String editorial, String[] authors) {
		super(title, editionDate, editorial, authors);
		// TODO Auto-generated constructor stub
	}

	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String isRead() {
		if(read == true)
			return "Si";
		else
			return "NO";
	}
	
	public void setRead(boolean read) {
		this.read = read;
	}
	
	public int getTimeRead() {
		return timeRead;
	}
	
	public void setTimeRead(int timeRead) {
		this.timeRead = timeRead;
	}
	
	@Override
	public String toString() {
		
		return "Title: "+getTitle()+
				"\n Edition Date: "+getEditionDate().getTime()+
				"\n Editorial: "+ getEditorial();
	}

	@Override
	public Date startToSee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}

	@Override
	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		if(dateF.getTime() > dateF.getTime())
			setTimeRead((int)((dateF.getTime() + 1) - dateI.getTime()));
		else
			setTimeRead(0);
	}
	
	public static LinkedList<Book> makeBooks(){
		LinkedList<Book> books = new LinkedList();
		String [] author = {"Agusto","Picaso","Confusio"};
		Date date = new Date();
		for(int i=0; i<5; i++) {
			books.add(new Book("English "+(i+1),date,"OCENAO",author));
		}
		return books;
		
	}
	
	
	
	
}

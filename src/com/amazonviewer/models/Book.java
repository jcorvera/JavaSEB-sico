package com.amazonviewer.models;

import java.util.Date;

import com.amazonviewer.interfaces.IVisualizable; 

public class Book extends publication implements IVisualizable{

	private String isbn;
	private boolean read;
	private int timeRead;
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public boolean isRead() {
		return read;
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
	
	public void read() {
			
	}

	@Override
	public Date startToSee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}

	@Override
	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		setTimeRead((dateF.getSeconds() + 1) - dateI.getSeconds());
	}
	
	
	
	
}

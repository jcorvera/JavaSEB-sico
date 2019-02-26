package com.amazonviewer.models;

public class Chapter extends Movie {
	
	private int sessionNumber;

	public Chapter(String title, String creator, String genere, int duration, short year, int sessionNumber) {
		super(title, creator, duration, year);
		this.sessionNumber = sessionNumber;
	}
	

	public int getSessionNumber() {
		return sessionNumber;
	}

	public void setSessionNumber(int sessionNumber) {
		this.sessionNumber = sessionNumber;
	}
		
}

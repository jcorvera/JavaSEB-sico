package com.amazonviewer.models;

public class Serie extends Film {
	

	private Chapter chaters;
	private int sessionQuantity;
	
	public Serie(String title, String creator, int duration,int sessionQuantity) {
		super(title, creator, duration);
		this.sessionQuantity = sessionQuantity;
	}

	public Chapter getChaters() {
		return chaters;
	}

	public void setChaters(Chapter chaters) {
		this.chaters = chaters;
	}

	public int getSessionQuantity() {
		return sessionQuantity;
	}

	public void setSessionQuantity(int sessionQuantity) {
		this.sessionQuantity = sessionQuantity;
	}
	
}

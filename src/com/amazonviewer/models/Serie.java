package com.amazonviewer.models;

import java.util.ArrayList;

public class Serie extends Film {
	

	private ArrayList<Chapter> chaters;
	private int sessionQuantity;
	
	public Serie(String title, String creator, int duration,int sessionQuantity) {
		super(title, creator, duration);
		this.sessionQuantity = sessionQuantity;
	}

	public ArrayList<Chapter> getChaters() {
		return chaters;
	}

	public void setChaters(ArrayList<Chapter> chaters) {
		this.chaters = chaters;
	}

	public int getSessionQuantity() {
		return sessionQuantity;
	}

	public void setSessionQuantity(int sessionQuantity) {
		this.sessionQuantity = sessionQuantity;
	}
	
}

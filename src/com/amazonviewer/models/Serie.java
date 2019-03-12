package com.amazonviewer.models;

import java.util.ArrayList;
import java.util.HashSet;

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
	
	@Override
	public String toString() {
		return "Tittle: "+ getTitle() + 
				"- Visto: "+ isViewed(); 
		
	}
	
	public static HashSet<Serie> makeSeries() {
		HashSet<Serie> series = new HashSet<Serie>();
		for(int i=0; i<5; i++) {
			series.add(new Serie("Msr. Robot"+i,"No se",i,89+1));
		}
		return series;
		
	}
	
}

package com.amazonviewer.models;
import java.util.Date;

import com.amazonviewer.interfaces.IVisualizable;;

public class Movie extends Film implements IVisualizable{
	
	private int timeViewed;
	
	public Movie(String title, String creator, int duration, short year) {
		super(title, creator, duration);
		setYear(year);
	}

	public int getTimeViewed() {
		return timeViewed;
	}

	public void setTimeViewed(int timeViewed) {
		this.timeViewed = timeViewed;
	}
	
	@Override
	public String toString() {
		return "Tittle: "+ getTitle() + 
				"\n Year: "+ getYear()+
				"\n Create: "+ getCreator()+
				"\n Duration: "+ getDuration()	; 
		
	}

	@Override
	public Date startToSee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}

	@Override
	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		 setTimeViewed((dateF.getSeconds() + 1) - dateI.getSeconds());
	}
	
	
}	

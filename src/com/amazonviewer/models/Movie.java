package com.amazonviewer.models;
import java.util.ArrayList;
import java.util.Date;
import java.lang.Object;

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
		return " Tittle: "+ getTitle() + 
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
		if(dateF.getTime() > dateI.getTime()) 
			setTimeViewed((int)(dateF.getTime()-dateI.getTime()));	
		else
			setTimeViewed(0);
		
	}
	
	@Override
	public boolean equals(Object o) {
		Movie movie = (Movie) o;
		if(title == movie.title)
			return true;
		else
			return false;
	}
	
	public static ArrayList<Movie> makeMovies(){
		ArrayList<Movie> movies = new ArrayList();
		for(int i=0; i<5; i++) {
			movies.add(new Movie("Movie "+(i+1),"genero 1"+i,120,(short)2018));
		}
		return movies;
		
	}
}	

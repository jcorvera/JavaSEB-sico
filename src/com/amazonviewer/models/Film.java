package com.amazonviewer.models;

public class Film {
	
	protected String title;
	protected String creator;
	protected int duration;
	protected short year;
	protected boolean viewed;
	
	public Film(String title, String creator, int duration) {
		this.title = title;
		this.creator = creator;
		this.duration = duration;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getCreator() {
		return creator;
	}
	
	public void setCreator(String creator) {
		this.creator = creator;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public short getYear() {
		return year;
	}
	
	public void setYear(short year) {
		this.year = year;
	}
	
	public boolean isViewed() {
		return viewed;
	}
	
	public void setViewed(boolean viewed) {
		this.viewed = viewed;
	}
	
}

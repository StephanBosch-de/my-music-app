package com.stbo.myprojects.mymusicapp;

import lombok.Data;

@Data
public class MusicPiece {
	
	// Defining the attributes 
	double length;
	String title;
	String artist;
	
	// Building a constructor
	
	public MusicPiece(double length, String title, String artist) {
		this.length = length;
		this.title = title;
		this.artist = artist; 
	}
	
	

}

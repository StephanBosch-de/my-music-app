package com.stbo.myprojects.mymusicapp;

import java.util.ArrayList;
import java.util.List;

public class MusicPieceDatabase {
	
	// Building a new list to save the entries
	
	List<MusicPiece> MusicPieceList; 
	
	// Constructor to generate a new MusicPieceDatabase 
	
	public MusicPieceDatabase() {
		MusicPieceList = new ArrayList<MusicPiece>();
	}
	
	public void addMusicPiece(MusicPiece addPiece) {
		MusicPieceList.add(addPiece);
	}
	
	
	

}

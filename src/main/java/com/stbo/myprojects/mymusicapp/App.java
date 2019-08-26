package com.stbo.myprojects.mymusicapp;

public class App {
	public static void main(String[] args) {
		
		
		MusicPieceDatabase myPlaylist = new MusicPieceDatabase();
		
		myPlaylist.addMusicPiece(new MusicPiece(3.50, "Ueber den Wolken","Reinhard May"));
		myPlaylist.addMusicPiece(new MusicPiece(4.20, "Lemon Tree", "Fool's Garden"));
		
		myPlaylist.printMusicPieceDatabase();

		
	}
}

package com.stbo.myprojects.mymusicapp;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

	@Test
	public void MusicPieceConstructorTest() {
		// Testing the Constructor of the Class MusicPiece
		MusicPiece newPiece = new MusicPiece(1.55, "TestSong", "TestArtist");
		assertEquals(newPiece, new MusicPiece(1.55, "TestSong", "TestArtist"));
	}

	@Test
	public void addMusicPieceToListTest() {
		// Testing if elements are added to the List
		MusicPieceDatabase testDatabase = new MusicPieceDatabase();
		testDatabase.addMusicPiece(new MusicPiece(3.20, "Lemon Tree", "Fool's Garden"));
		testDatabase.addMusicPiece(new MusicPiece(5.20, "Torn", "Natalie Imbruglia"));

		MusicPiece entry0 = new MusicPiece(3.20, "Lemon Tree", "Fool's Garden");
		MusicPiece entry1 = new MusicPiece(5.20, "Torn", "Natalie Imbruglia");

		assertEquals(entry0, testDatabase.MusicPieceList.get(0), "Test if values of entry0 equal with values of list element 0");
		assertEquals(entry1, testDatabase.MusicPieceList.get(1), "Test if values of entry1 equal with values of list element 1");

	}

}

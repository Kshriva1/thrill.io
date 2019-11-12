package com.kshriva1.thrillio.entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.kshriva1.thrillio.constants.MovieGenre;
import com.kshriva1.thrillio.managers.BookmarkManager;

class MovieTest {

	@Test
	void testIsKidFriendlyEligible() {
		//Test1 - Movie genre is Horror -- return false
		Bookmark movie = BookmarkManager.getInstance().createMovie(3000,"Citizen Kane","",	1941,	new String[] {"Orson Welles","Joseph Cotten"},	new String[] {"Orson Welles"}, MovieGenre.HORROR, 8.5);
		Boolean isKidFriendlyEligible = movie.isKidFriendlyEligible();
		assertFalse(isKidFriendlyEligible,"If movie genre is Horror the method must return false");
		
		//Test2 - Movie genre is Thrillers --- return false
		movie = BookmarkManager.getInstance().createMovie(3000,"Citizen Kane","",	1941,	new String[] {"Orson Welles","Joseph Cotten"},	new String[] {"Orson Welles"}, MovieGenre.THRILLERS, 8.5);
		isKidFriendlyEligible = movie.isKidFriendlyEligible();
		assertFalse(isKidFriendlyEligible,"If movie genre is Thrillers the method must return false");
	}

}

package com.kshriva1.thrillio.entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.kshriva1.thrillio.constants.BookGenre;
import com.kshriva1.thrillio.managers.BookmarkManager;

class BookTest {

	@Test
	void testIsKidFriendlyEligible() {
		//Test1 - Self help returns false
				Bookmark book = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications", new String[] {"Henry David Thoreau"}, BookGenre.SELF_HELP, 4.3);
				Boolean isKidFriendlyEligible = book.isKidFriendlyEligible();
				assertFalse(isKidFriendlyEligible,"if bookgenre is self help then it should return false");
				
				  //Test2 - Philosophy returns false
				book = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications", new String[] {"Henry David Thoreau"}, BookGenre.PHILOSOPHY, 4.3);
				isKidFriendlyEligible= book.isKidFriendlyEligible();
				assertFalse(isKidFriendlyEligible,"if bookgenre is philosophy then it should return false");
	}

}

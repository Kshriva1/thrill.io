package com.kshriva1.thrillio.entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.kshriva1.thrillio.managers.BookmarkManager;

class WebLinkTest {

	@Test
	void testIsKidFriendlyEligible() {
		// Test 1 - porn in url -- false
		Bookmark webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger, Part 2",
				"http://www.javaworld.com/article/2072759/core-java/taming-porn--part-2.html",
				"http://www.javaworld.com");
		Boolean isKidFriendlyEligible = webLink.isKidFriendlyEligible();
		assertFalse(isKidFriendlyEligible, "For porn in url, isKidFriendlyEligible() must return false");

		// Test 2 - porn in title -- false
		webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming porn, Part 2",
				"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
				"http://www.javaworld.com");
		 isKidFriendlyEligible = webLink.isKidFriendlyEligible();
		assertFalse(isKidFriendlyEligible, "For porn in title, isKidFriendlyEligible() must return false");
		

		// Test 3 - adult in host -- false
		
		webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming tiger, Part 2",
				"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
				"http://www.adult.com");
		 isKidFriendlyEligible = webLink.isKidFriendlyEligible();
		assertFalse(isKidFriendlyEligible, "For adult in host, isKidFriendlyEligible() must return false");

		// Test 4 - adult in url, but not in host -- true
		
		webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming tiger, Part 2",
				"http://www.javaworld.com/article/2072759/core-java/taming-adult--part-2.html",
				"http://www.javaworld.com");
		 isKidFriendlyEligible = webLink.isKidFriendlyEligible();
		assertTrue(isKidFriendlyEligible, "For adult in url but not host, isKidFriendlyEligible() must return true");

		// Test 5 - adult only in title -- true
		
		webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming adult, Part 2",
				"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
				"http://www.javaworld.com");
		 isKidFriendlyEligible = webLink.isKidFriendlyEligible();
		assertTrue(isKidFriendlyEligible, "For adult only in title, isKidFriendlyEligible() must return true");
	}

}

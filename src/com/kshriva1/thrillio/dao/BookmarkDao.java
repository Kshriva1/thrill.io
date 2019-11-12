package com.kshriva1.thrillio.dao;

import java.util.List;

import com.kshriva1.thrillio.DataStore;
import com.kshriva1.thrillio.entities.Bookmark;
import com.kshriva1.thrillio.entities.UserBookmark;

public class BookmarkDao {
	
	public List<List<Bookmark>> getBookmarks(){
		return DataStore.getBookmarks();
	}

	public void saveUserBookmark(UserBookmark userBookmark) {
		DataStore.add(userBookmark);
		
	}

}

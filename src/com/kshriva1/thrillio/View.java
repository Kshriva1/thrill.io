package com.kshriva1.thrillio;

import java.util.List;

import com.kshriva1.thrillio.constants.KidFriendlyStatus;
import com.kshriva1.thrillio.constants.UserType;
import com.kshriva1.thrillio.controllers.BookmarkController;
import com.kshriva1.thrillio.entities.Bookmark;
import com.kshriva1.thrillio.entities.User;
import com.kshriva1.thrillio.partner.Shareable;

public class View {

	public static void browse(User user, List<List<Bookmark>> bookmarks) {

		System.out.println("\n" + user.getEmail() + " is browsing items...");
		int bookmarkCount = 0;

		for (List<Bookmark> bookmarklist : bookmarks) {
			for (Bookmark bookmark : bookmarklist) {
				// Bookmarking!!
		
					boolean isBookmarked = getBookmarkDecision(bookmark);
					if (isBookmarked) {
						bookmarkCount++;
						BookmarkController.getInstance().saveUserBookmark(user, bookmark);

						System.out.println("New Item Bookmarked -> " + bookmark);
					
				}

				// Mark as Kid-Friendly
				if (user.getUserType().equals(UserType.EDITOR) || user.getUserType().equals(UserType.CHIEF_EDITOR)) {
					if (bookmark.isKidFriendlyEligible()
							&& bookmark.getKidFriendlyStatus().equals(KidFriendlyStatus.UNKNOWN)) {
						KidFriendlyStatus kidFriendlyStatus = getKidFriendlyStatusDecision(bookmark);
						if (!kidFriendlyStatus.equals(KidFriendlyStatus.UNKNOWN)) {
							BookmarkController.getInstance().setKidFriendlyStatus(user, kidFriendlyStatus, bookmark);

						}
					}
					if (bookmark.getKidFriendlyStatus().equals(KidFriendlyStatus.APPROVED)
							&& bookmark instanceof Shareable) {
                         boolean isShared = getShareDecision(bookmark);
                         if(isShared) {
                        	 BookmarkController.getInstance().share(user,bookmark);
                         }
					}
				}

			}
		}

	}
    // TODO: Take input from the console
	private static boolean getShareDecision(Bookmark bookmark) {
		return Math.random() < 0.5 ? true : false;
	}

	private static KidFriendlyStatus getKidFriendlyStatusDecision(Bookmark bookmark) {
		return Math.random() < 0.4 ? KidFriendlyStatus.APPROVED
				: (Math.random() >= 0.4 && Math.random() < 0.8) ? KidFriendlyStatus.REJECTED
						: KidFriendlyStatus.UNKNOWN;
	}

	private static boolean getBookmarkDecision(Bookmark bookmark) {
		return Math.random() < 0.5 ? true : false;

	}

}

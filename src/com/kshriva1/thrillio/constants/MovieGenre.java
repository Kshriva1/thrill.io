package com.kshriva1.thrillio.constants;

public enum MovieGenre{
	

		CLASSICS("Classics"),
		DRAMA("Drama"),
		SCIFI_AND_FANTASY("Sci-Fi&Fantasy"),
		COMEDY("Comedy"),
		CHILDREN_AND_FAMILY("Children&Family"),
		ACTION_AND_ADVENTURE("Action&Adventure"),
		THRILLERS("Thrillers"),
		MUSIC_AND_MUSICALS("Music&Musicals"),
		TELEVISION("Television"),
		HORROR("Horror"),
		SPECIAL_INTEREST("SpecialInterest"),
		INDEPENDENT("Independent"),
		SPORTS_AND_FITNESS("Sports&Fitness"),
		ANIME_AND_ANIMATION("Anime&Animation"),
		GAY_AND_LESBIAN("Gay&Lesbian"),
		CLASSIC_MOVIE_MUSICALS("ClassicMovieMusicals"),
		FAITH_AND_SPIRITUALITY("Faith&Spirituality"),
		FOREIGN_DRAMAS("ForeignDramas"),
		FOREGIN_ACTION_AND_ADVENTURE("ForeignAction&Adventure"),
		FOREGIN_THRILLERS("ForeignThrillers"),
		TV_SHOWS("TVShows"),
		DRAMAS("Dramas"),
		ROMANTIC_MOVIES("RomanticMovies"),
		COMEDIES("Comedies"),
		DOCUMENTARIES("Documentaries"),
		FOREIGN_MOVIES("ForeignMovies");
		
		private MovieGenre(String name){
			this.name = name;
		}
		
		public String name;

		public String getName() {
			return name;
		}


}

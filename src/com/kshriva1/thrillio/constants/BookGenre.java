package com.kshriva1.thrillio.constants;

public enum BookGenre{
	
	ART("Art"),
	BIOGRAPHY("Biography"),
	CHILDREN("Children"),
	FICTION("Fiction"),
	HISTORY("History"),
	MYSTERY("Mystery"),
	PHILOSOPHY("Philosophy"),
	RELIGION("Religion"),
	ROMANCE("Romance"),
	SELF_HELP("Selfhelp"),
	TECHNICAL("Technical");

	private BookGenre(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	private String name;

}

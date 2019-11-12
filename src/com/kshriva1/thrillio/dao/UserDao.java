package com.kshriva1.thrillio.dao;

import java.util.List;

import com.kshriva1.thrillio.DataStore;
import com.kshriva1.thrillio.entities.User;

public class UserDao {
	
	public List<User> getUsers() {
		return DataStore.getUsers();
	}

}

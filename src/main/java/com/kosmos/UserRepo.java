package com.kosmos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserE, String> {
	
	UserE findByUserName(String userID);

}

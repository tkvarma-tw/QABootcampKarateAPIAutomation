package Basics;

import com.intuit.karate.junit5.Karate;

public class ListUsersRunner {
	@Karate.Test
	Karate runTestsOfListUsers() {
		return Karate.run("listAllUsers.feature").relativeTo(this.getClass());
	}
}

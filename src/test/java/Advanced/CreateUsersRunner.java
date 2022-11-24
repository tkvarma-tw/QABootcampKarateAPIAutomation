package Advanced;

import com.intuit.karate.junit5.Karate;

public class CreateUsersRunner {
	@Karate.Test
	Karate runTestsOfCreateUsers() {
		return Karate.run("CreateUsers.feature").relativeTo(this.getClass());
	}
}

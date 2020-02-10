package com.tyss.junit;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;

public class MyFriendsTest {

	static MyFriends m = null;


	@BeforeAll
	public static void afterAll() {
		m = new MyFriends();
	}

	@RepeatedTest(5) // to repeat the test 
	public void getNameTest(RepetitionInfo info) {
		int repCount = info.getCurrentRepetition();
		String name = m.getName();
		if (repCount <=4) {
			assertNotNull(name);
		} else {
			assertNull(name);
		}
	}
}

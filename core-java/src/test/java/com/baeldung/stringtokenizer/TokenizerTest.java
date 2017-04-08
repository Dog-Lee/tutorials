package com.baeldung.stringtokenizer;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TokenizerTest {

	private final Application application = new Application();
	private final List<String> expectedTokensForString = Arrays.asList("Welcome", "to", "baeldung.com");
	private final List<String> expectedTokensForFile = Arrays.asList("1", "IND", "India", "2", "MY", "Malaysia", "3", "AU", "Australia");

	@Test
	public void givenString_thenGetListOfString() {
		String str = "Welcome,to,baeldung.com";
		List<String> actualTokens = application.getTokens(str);
		assertEquals(expectedTokensForString, actualTokens);
	}

	@Test
	public void givenFile_thenGetListOfString() {
		List<String> actualTokens = application.getTokensFromFile("data.csv", "|");
		assertEquals(expectedTokensForFile, actualTokens);
	}

}
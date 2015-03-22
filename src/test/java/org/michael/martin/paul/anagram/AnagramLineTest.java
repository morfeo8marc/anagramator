package org.michael.martin.paul.anagram;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Map;

import org.junit.Test;
import org.michael.martin.paul.anagram.AnagramLine;

public class AnagramLineTest {

	@Test
	public void helloWord() {
		AnagramLine al;
		al = new AnagramLine("Hello WOrld,xxYyX");
		Map<String, Long> ocurrencies = al.getOcurrencies();
		assertThat("h should appear 1 time", ocurrencies.get("h"), is(1l));
		assertThat("2 should appear 1 time", ocurrencies.get("e"), is(1l));
		assertThat("3 should appear 2 times", ocurrencies.get("l"), is(3l));
		assertThat("o should appear 2 times", ocurrencies.get("o"), is(2l));
		assertThat("w should appear 1 times", ocurrencies.get("w"), is(1l));
		assertThat("r should appear 1 times", ocurrencies.get("r"), is(1l));
		assertThat("d should appear 1 times", ocurrencies.get("d"), is(1l));
		assertThat("x should appear 3 times", ocurrencies.get("x"), is(3l));
		assertThat("y should appear 2 times", ocurrencies.get("y"), is(2l));
	}

}

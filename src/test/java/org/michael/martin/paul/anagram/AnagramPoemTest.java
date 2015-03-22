package org.michael.martin.paul.anagram;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;

import org.junit.Test;
public class AnagramPoemTest {

	
	@Test
	public void SimpleAnagramPoem() {
		String apStr = "abc\n"+
				  "bca\n"+
				  "cab?\n"+
				  "\n" +
				  "abc\n"+
				  "bca\n"+
				  "cab?\n"+
				  "\n"+
				  "abc\n"+
				  "bca\n"+
				  "cab?\n";

		AnagramPoem ap = new AnagramPoem(new ByteArrayInputStream(apStr.getBytes()));
		assertTrue(ap.isValid());
	}
	
	
	@Test
	public void SimpleIncorretAnagramPoem() {
		String apStr = "abc\n"+
				  "bca\n"+
				  "cab?\n"+
				  "\n" +
				  "abc\n"+
				  "bcx\n"+
				  "cab?\n"+
				  "\n"+
				  "abc\n"+
				  "bca\n"+
				  "cab?\n";

		AnagramPoem ap = new AnagramPoem(new ByteArrayInputStream(apStr.getBytes()));
		assertFalse(ap.isValid());
	}

}

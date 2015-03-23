package org.michael.martin.paul.anagram;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AnagramVerse {
	private String verse;
	private List<AnagramLine> lines;
	
	public AnagramVerse(String verse) {
		super();
		this.verse = verse;
		lines = new LinkedList<AnagramLine>();
		InputStream ist = new ByteArrayInputStream(verse.getBytes());
		try(Scanner s = new Scanner(ist).useDelimiter("\n")){
			while (s.hasNext()){
			
			String line = s.next();
			lines.add(new AnagramLine(line));
			
			}
		}
	}

	public String getVerse() {
		return verse;
	}

	public void setVerse(String verse) {
		this.verse = verse;
	}

	public List<AnagramLine> getLines() {
		return lines;
	}

	public void setLines(List<AnagramLine> lines) {
		this.lines = lines;
	}
	
	public Map<String, Long> getOcurrencies() {
		Map<String, Long> collect = new HashMap<String, Long>();
		
		lines.stream().forEach(l->{
			l.getOcurrencies().forEach((k, c) ->{
				collect.put(k, collect.getOrDefault(k, 0l)+c);
			});
		});
	
		return collect;
	}
	
}

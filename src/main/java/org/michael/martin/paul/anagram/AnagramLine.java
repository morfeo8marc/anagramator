package org.michael.martin.paul.anagram;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import javax.xml.transform.stream.StreamSource;
public class AnagramLine {
	private String line;
	private Map<String, Long> ocurrencies;
	
	public AnagramLine(String line) {
		this.line = line;
		this.ocurrencies = getLetterOcurrencies(this.line);
	}


	private Map<String, Long> getLetterOcurrencies(String line) {

		Map<String, Long> collect = line.chars().mapToObj(c -> String.valueOf((char)c).toLowerCase())
												.filter(s -> s.matches("\\w+"))
												.collect(groupingBy(identity(), counting()));
		return collect;
	}


	public String getLine() {
		return line;
	}


	public void setLine(String line) {
		this.line = line;
	}


	public Map<String, Long> getOcurrencies() {
		return ocurrencies;
	}


	public void setOcurrencies(Map<String, Long> ocurrencies) {
		this.ocurrencies = ocurrencies;
	}
	
	
	
	
}
	
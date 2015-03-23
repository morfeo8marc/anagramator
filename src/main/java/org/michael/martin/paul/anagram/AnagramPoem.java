package org.michael.martin.paul.anagram;

import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * {@link http://en.wikipedia.org/wiki/Anagrammatic_poem}
 * An empty poem is not an anagram poem
 * @author morfeo8marc <github.com/morfeo8marc>
 * @pattern Composite
 */
public class AnagramPoem {

	private List<AnagramVerse> poem;
		
	/**
	 * 
	 * @param ist The stream from where the AnagramPoem will be constrcuted
	 */
	public AnagramPoem(InputStream ist){
		poem = new LinkedList<AnagramVerse>();
		try(Scanner s = new Scanner(ist).useDelimiter("\n\n")){
			while (s.hasNext()){
			
			String line = s.next();
			poem.add(new AnagramVerse(line));
			
			}
		}
	}
	
	public boolean isValid(){
		boolean isAValidAngramPoem = false;
		if ( ! poem.isEmpty()){
			// If its not empty we can assume it is true, because if not the && will short cut the result
			isAValidAngramPoem = true;
			Map<String, Long> ocurrencies = poem.get(0).getOcurrencies();
			
			// Check if it is an anagram poem by verse
			for (AnagramVerse anagramVerse : poem) {
				Map<String, Long> actOcurrencies = anagramVerse.getOcurrencies();
				isAValidAngramPoem = isAValidAngramPoem && ocurrencies.equals(actOcurrencies);
				if(!isAValidAngramPoem){
					break;
				}
			}
			if (isAValidAngramPoem){
				return isAValidAngramPoem;
			}else{
				isAValidAngramPoem = true;
				// Check if it is an anagram poem by  line
				for (AnagramVerse anagramVerse : poem) {
					for (AnagramLine line :anagramVerse.getLines()){
						Map<String, Long> actOcurrencies = line.getOcurrencies();
						isAValidAngramPoem = isAValidAngramPoem && ocurrencies.equals(actOcurrencies);
						if (! isAValidAngramPoem){
							return isAValidAngramPoem;
						}
					}
					
				}
			}
			return isAValidAngramPoem;
		}else{
			return isAValidAngramPoem;
		}

	}
}

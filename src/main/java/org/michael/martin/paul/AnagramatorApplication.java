package org.michael.martin.paul;

import java.io.ByteArrayInputStream;

import org.michael.martin.paul.anagram.AnagramPoem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnagramatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnagramatorApplication.class, args);
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
        System.out.println(apStr);
		AnagramPoem ap = new AnagramPoem(new ByteArrayInputStream(apStr.getBytes()));
		System.out.println(ap.isValid());
    }
}

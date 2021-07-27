import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

public class ParseTextApp {

	public static void main(String[] args) {

	public static void CountWords(String filename, Map<String, Integer> words) throws FileNotFoundException {
		Scanner file = new Scanner(new File(filename));
		while (file.hasNext()) {
			String word = file.next();
			Integer count = words.get(word);

			if (count != null) {
				count++;
			} else {
				count = 1;
			}
			words.put(word, count);
		}
		file.close();
	}

	
		Map<String, Integer> words = new Hashmap<String, Integer>();
		CountWords("parse.txt", words);
		System.out.println(words);
	}
}

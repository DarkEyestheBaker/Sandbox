import java.util.*;
import java.io.*;

public class ParseTextAndCountApp {

		public static void main(String[] args) throws FileNotFoundException  {

			// Use hashmap to store the words
			
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			
			// Scanner to read the txt
		
				Scanner txtFile = new Scanner(new File("transcript.txt"));
				while (txtFile.hasNext()) {
					String word = txtFile.next();
			
					if (map.containsKey(word)) {
						int count=map.get(word) +1;
						map.put(word, count);
					} else {
						map.put(word, 1);
					}
				} 
				txtFile.close();
				
				for (Map.Entry<String, Integer> entry : map.entrySet()) {
					System.out.println(entry);
				}
			}

			}
			


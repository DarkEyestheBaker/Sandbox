import java.util.*;
import java.io.*;

public class ParseTextAndCountApp {

		public static void main(String[] args) throws FileNotFoundException {

			HashMap<String, Integer> map = new HashMap<String, Integer>();
			
				Scanner txtfile = new Scanner(new File("C:\\repos-08-2020\\sandbox\\TextToParse.txt"));
				while (txtfile.hasNext()) {
					
					String word = txtfile.next();
					Integer count = map.get(word);

					if (count != null) {
						count++;
					} else {
						count = 1;
					}
				}
				txtfile.close();
				for (Map.Entry<String, Integer> entry : map.entrySet()) {
					System.out.println(entry);
				}
			}

			}
			


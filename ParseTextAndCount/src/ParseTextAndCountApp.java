import java.util.*;
import java.io.*;

public class ParseTextAndCountApp {

		
			public void CountWords(String filename, Map< String, Integer> words) throws FileNotFoundException
			{
			Scanner file=new Scanner (new File(filename));
			while(file.hasNext()){
			String word=file.next();
			Integer count=words.get(word);
			if(count!=null)
			count++;
			else
			count=1;
			words.put(word,count);
			}
			file.close();
			}
			public static void main(String[] args)
			{
			Map<String,Integer> words=new HashMap<String, Integer>();
			CountWords("transcript.txt",words);
			System.out.println(words);
			}
			}
			


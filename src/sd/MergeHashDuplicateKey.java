package sd;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MergeHashDuplicateKey {
	
	public static void main(String args[])
	{
		HashMap<String,Integer> firstHashmap=new HashMap<>();
		HashMap<String,Integer> secondHashmap=new HashMap<>();
		HashMap<String,Integer> mergedHashmap=new HashMap<>();
		
		firstHashmap.put("a", 2);
		firstHashmap.put("b", 3);
		firstHashmap.put("c", 4);
		firstHashmap.put("d", 1);
		
		secondHashmap.put("a", 2);
		secondHashmap.put("e", 3);
		secondHashmap.put("s", 4);
		secondHashmap.put("d", 1);
		
		mergedHashmap.putAll(firstHashmap);
		
		for(String key:secondHashmap.keySet())
		{
			if(mergedHashmap.containsKey(secondHashmap.get(key)))
			{
				mergedHashmap.put(key, secondHashmap.get(key)+mergedHashmap.get(key));
			}
			else
			{
				mergedHashmap.put(key, secondHashmap.get(key));
			}
		}
		Iterator itMerge=mergedHashmap.entrySet().iterator();

		while(itMerge.hasNext())
		{
			Map.Entry map=(Map.Entry)itMerge.next();
			System.out.println("Key "+map.getKey()+" Value "+map.getValue());	
		}
		
		
	}

}

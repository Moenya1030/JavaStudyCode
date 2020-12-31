package lab9;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Lab9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> hsMap = new HashMap<>();
		hsMap.put("1", "abs");
		hsMap.put("2", "bbs");
		hsMap.put("3", "cbs");
		hsMap.put("4", "dbs");
		hsMap.put("5", "ebs");
		hsMap.put("6", "aas");
		hsMap.put("7", "bbs");
		hsMap.put("8", "ccs");
		hsMap.put("9", "dds");
		hsMap.put("0", "ees");	
		Set <String> set1 = hsMap.keySet();
		Iterator<String> it1 = set1.iterator();
		System.out.println("set1集合的元素为：");
		while(it1.hasNext())
		{
			System.out.print(it1.next() + " ");
		}
		Collection<String> coll1 = hsMap.values();
		it1 = coll1.iterator();
		System.out.println();
		System.out.println("values中的元素为：");
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		
		
		Map<String, String> trMap = new TreeMap<>();
		trMap.put("1", "abs");
		trMap.put("2", "bbs");
		trMap.put("3", "cbs");
		trMap.put("4", "dbs");
		trMap.put("5", "ebs");
		trMap.put("6", "aas");
		trMap.put("7", "bbs");
		trMap.put("8", "ccs");
		trMap.put("9", "dds");
		trMap.put("0", "ees");
		Set <String> set2 = hsMap.keySet();
		Iterator<String> it2 = set2.iterator();
		System.out.println("set2集合的元素为：");
		System.out.println();
		while(it2.hasNext())
		{
			System.out.print(it2.next() + " ");
		}
		Collection<String> coll2 = hsMap.values();
		it2 = coll2.iterator();
		System.out.println("values中的元素为：");
		while(it2.hasNext())
		{
			System.out.println(it2.next());
		}
		
	}

}

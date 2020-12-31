package lab9;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Lab9_3_1_treeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> trMap = new TreeMap<>();
		Emp empaa = new Emp("aa", "apple");
		Emp empbb = new Emp("bb", "banana");
		Emp empcc = new Emp("cc", "car");
		Emp empdd = new Emp("dd", "dog");
		Emp empee = new Emp("ee", "emp");
		Emp empff = new Emp("ff", "frog");
		Emp empgg = new Emp("gg", "get");
		Emp emphh = new Emp("hh", "hash");
		Emp empii = new Emp("ii", "ink");
		Emp empjj = new Emp("jj", "jinx");
		trMap.put(empaa.getNum(), empaa.getWord());
		trMap.put(empbb.getNum(), empbb.getWord());
		trMap.put(empcc.getNum(), empcc.getWord());
		trMap.put(empdd.getNum(), empdd.getWord());
		trMap.put(empii.getNum(), empii.getWord());
		trMap.put(empff.getNum(), empff.getWord());
		trMap.put(empgg.getNum(), empgg.getWord());
		trMap.put(emphh.getNum(), emphh.getWord());
		trMap.put(empjj.getNum(), empjj.getWord());
		trMap.put(empee.getNum(), empee.getWord());
		
		Set<String> setbb = trMap.keySet();
		Iterator<String> itbb = setbb.iterator();
		System.out.println("treemap实现的map集合，升序： ");
		while(itbb.hasNext())
		{
			String strbb = (String) itbb.next();
			String namebb = (String) trMap.get(strbb);
			System.out.print(strbb + " " + namebb);
			System.out.println();
		}
		
		HashMap<String, String> hsMap = new HashMap<>();
		hsMap.putAll(trMap);
		Iterator<String> iter = hsMap.keySet().iterator();
		System.out.println("hashmap实现的treemap集合, 无序：");
		while(iter.hasNext())
		{
			String strbbb = (String) iter.next();
			String namebbb = (String) hsMap.get(strbbb);
			System.out.print(strbbb + " " + namebbb);
			System.out.println();
		}
		
	}
}

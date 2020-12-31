package lab9;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Lab9_3_1_hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> hsMap = new HashMap<>();
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
		hsMap.put(empii.getNum(), empii.getWord());
		hsMap.put(empff.getNum(), empff.getWord());
		hsMap.put(empgg.getNum(), empgg.getWord());
		hsMap.put(emphh.getNum(), emphh.getWord());
		hsMap.put(empjj.getNum(), empjj.getWord());
		hsMap.put(empaa.getNum(), empaa.getWord());
		hsMap.put(empbb.getNum(), empbb.getWord());
		hsMap.put(empcc.getNum(), empcc.getWord());
		hsMap.put(empdd.getNum(), empdd.getWord());
		hsMap.put(empee.getNum(), empee.getWord());
		
		Set<String> setbb = hsMap.keySet();
		Iterator<String> itbb = setbb.iterator();
		System.out.println("hashmap实现的map集合，无序： ");
		while(itbb.hasNext())
		{
			String strbb = (String) itbb.next();
			String namebb = (String) hsMap.get(strbb);
			System.out.print(strbb + " " + namebb);
			System.out.println();
		}
		
		TreeMap<String, String> trMap = new TreeMap<>();
		trMap.putAll(hsMap);
		Iterator<String> iter = trMap.keySet().iterator();
		System.out.println("treemap实现的hashmap集合, 键对象升序：");
		while(iter.hasNext())
		{
			String strbbb = (String) iter.next();
			String namebbb = (String) trMap.get(strbbb);
			System.out.print(strbbb + " " + namebbb);
			System.out.println();
		}
	}
}

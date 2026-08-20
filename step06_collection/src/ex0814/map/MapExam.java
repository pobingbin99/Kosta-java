package ex0814.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapExam {
	Map<String, Integer> hashMap = new HashMap<>();
	Map<String, Integer> treeMap = new TreeMap<>();
	
	public MapExam() {
		// HashMap
		hashMap.put("희정", 10);
		hashMap.put("미미", 20);
		hashMap.put("동혁", 10);
		hashMap.put("가현", 30);
		hashMap.put("미미", 30);
		
		System.out.println(hashMap.size());
		System.out.println(hashMap);
		
		Set<String> keys = hashMap.keySet();
		System.out.println(keys);
		
		for (String key : keys) {
			System.out.printf("%s ", key);
		} System.out.println();
		
		Set<Entry<String, Integer>> entries = hashMap.entrySet();
		for (Entry<String, Integer> e : entries) {
			System.out.printf("key: %s, value: %s\n", e.getKey(), e.getValue());
		}
		
		System.out.println(hashMap.remove("희정"));
		System.out.println(hashMap.remove("희정"));
		
		// TreeMap
		treeMap.put("희정", 10);
		treeMap.put("미미", 20);
		treeMap.put("동혁", 10);
		treeMap.put("가현", 30);
		treeMap.put("미미", 30);
		
		System.out.println(treeMap.size());
		System.out.println(treeMap);
		
		keys = treeMap.keySet();
		System.out.println(keys);
	}
	
	public static void main(String[] args) {
		new MapExam();
	}
}
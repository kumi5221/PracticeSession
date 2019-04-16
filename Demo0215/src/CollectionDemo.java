import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		al.add("Hello");
		al.add("World");
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		for (String s : al) {
			System.out.println(s);
		}
		
		printCollection(al);
		
		List<Integer> ll = new LinkedList<>();
		ll.add(42); // automatically wrap as Integer objects
		ll.add(37); // "auto-boxing"
		
		printCollection(ll);
		
		Set<Integer> hs = new HashSet<>();
		hs.add(314);
		hs.add(159);
		hs.add(265);
		hs.add(358);
		hs.add(939);
		
		printCollection(hs);
		
		Set<Integer> ts = new TreeSet<>();
		ts.add(314);
		ts.add(159);
		ts.add(265);
		ts.add(358);
		ts.add(939);
		
		printCollection(ts);
		
		Map<String, Integer> hm = new HashMap<>();
		hm.put("George", 21);
		hm.put("Susanna", 19);
		hm.put("Alice", 13);
		
//		System.out.println("George's age is " + hm.get("George"));
		for (String key : hm.keySet()) {
			System.out.println(key + "'s age is " + hm.get(key));
		}
	}

	private static <T> void printCollection(Collection<T> set) {
		for (T t : set) {
			System.out.print(t + " ");
		}
		System.out.println();
	}
}

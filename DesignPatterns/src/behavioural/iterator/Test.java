package behavioural.iterator;

//Define how to run elements consistently regardless of the data structure itself
//Iterator Design Pattern
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Map<String, Integer> map = new HashMap<String, Integer>();
		int value;
		for (int i = 0; i < 10; i++) {
			value = (int) (Math.random() * 1000);
			list.add(value);
			map.put("" + (char) ('A' + i), value);
		}

		Iterator i1 = list.iterator();
		Iterator i2 = map.values().iterator();
		Iterator i3 = map.keySet().iterator();

		while (i1.hasNext()) {
			System.out.println("List: " + i1.next());
			System.out.println("Map values: " + i2.next());
			System.out.println("Map keys: " + i3.next());
		}
	}
}
package te;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMap  {

	public static void main(String[] args) {

		Map<Integer, Integer> h = new HashMap<>(Map.of(1, 40, 2, 10, 3, 30));
		System.out.println(h);

//		List<Map.Entry<Integer,Integer>> map = new ArrayList<>(h.entrySet());
//		
//		map.sort(Map.Entry.comparingByValue());
//		
//		for(Map.Entry a : map) {
//			
//		System.out.println(a.getKey() + " "+ a.getValue());
//			
//		}
 		
		List<Integer> list = h.entrySet().stream().map(value -> value.getValue()).collect(Collectors.toList());
		Collections.sort(list);
		System.out.println(list);
	}
}

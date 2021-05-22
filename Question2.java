package Question2;

import java.util.HashMap;
import java.util.Map.Entry;

public class Question2 {

	public static void main(String[] args) {
		// for testing String
		String s = "This is is a cat";
		String arr[] = s.split(" ");
		HashMap<String, Integer> counts = new HashMap<>();
		for (String str : arr) {
			int count = 1;
			if (counts.containsKey(str) == true) {
				count += counts.get(str);
			}

			counts.put(str, count);
		}

		for (Entry<String, Integer> entry : counts.entrySet()) {
			System.out.println(String.format("Word %s repeated %d times", entry.getKey(), entry.getValue()));
		}
	}

}

package strings;

import java.util.HashMap;

public class MaxOccChar {
	public static void main(String[] args) {
		String str = "Mangesh Balkawade";
		HashMap<Character, Integer> map = new HashMap<>();
		int icnt = 0;
		char c='\0';
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);

			} else
				map.put(str.charAt(i), 1);
			if (map.get(str.charAt(i)) > icnt)
			{
				icnt = map.get(str.charAt(i));
				c=str.charAt(i);
			}

		}
		System.out.println("Character with max frequesncy is "+c+" "+icnt);
	}
}

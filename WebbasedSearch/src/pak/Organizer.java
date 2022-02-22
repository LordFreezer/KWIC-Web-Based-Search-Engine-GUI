package pak;

/**
 * @author Stephen Key
 */
import java.util.ArrayList;

public class Organizer {
	public Organizer() {
	}

	/**
	 * EFFECTS: Sorts an ArrayList into alphabetical order based on a certain order
	 * (a<A<b<B<…<y<Y<z<Z)
	 * 
	 * @param list The original ArrayList of Strings
	 * @return list sorted in alphabetical order
	 */
	public static ArrayList<String> Sort(ArrayList<String> list) {
		String temp;
		int pos;
		for (int g = 0; g < list.size(); g++) {
			temp = list.get(g);
			pos = g;
			for (int h = g + 1; h < list.size(); h++) {
				if (Compare(list.get(h), temp)) {
					temp = list.get(h);
					pos = h;
				}
			}
			list.add(g, temp);
			list.remove(pos + 1);
		}
		return list;
	}

	/**
	 * EFFECTS: Determines if one string is alphabetically less than the other
	 * 
	 * @param s1 The first string to compare
	 * @param s2 The other string to compare
	 * @return true if s1 is less than or equal to s2, false if it is not
	 */
	private static boolean Compare(String s1, String s2) {
		int min = Math.min(s1.length(), s2.length());
		char ref[] = { ' ', 'a', 'A', 'b', 'B', 'c', 'C', 'd', 'D', 'e', 'E', 'f', 'F', 'g', 'G', 'h', 'H', 'i', 'I',
				'j', 'J', 'k', 'K', 'l', 'L', 'm', 'M', 'n', 'N', 'o', 'O', 'p', 'P', 'q', 'Q', 'r', 'R', 's', 'S', 't',
				'T', 'u', 'U', 'v', 'V', 'w', 'W', 'x', 'X', 'y', 'Y', 'z', 'Z' };
		int i1 = 0, i2 = 0;
		for (int g = 0; g < min; g++) {
			// Find the index of the character from the first string
			for (int h = 0; h < 53; h++) {
				if (ref[h] == s1.charAt(g)) {
					i1 = h;
					break;
				}
				// throw new Exception("Character is not a letter or space.");
			}
			// Find the index of the character from the second string
			for (int h = 0; h < 52; h++) {
				if (ref[h] == s2.charAt(g)) {
					i2 = h;
					break;
				}
				// throw new Exception("Character is not a letter or space.");
			}
			// Compare the two indexes
			if (i1 > i2)
				return false;
			else if (i1 < i2)
				return true;
		}
		return s1.length() <= s2.length();
	}

}

package pak;

import java.util.ArrayList;

public class Shifter {
	/*
	 * EFFECTS: Takes an ArrayList of ArrayLists and shifts each word over one
	 * position. Each outer list holds a line of text from the JTextArea and each
	 * inner list individual words.
	 * 
	 * @param list of lists in exact order the user provided.
	 * 
	 * @return list of permutations of each line.
	 */
	public static ArrayList<String> circShift(ArrayList<ArrayList<String>> list) {
		ArrayList<String> shiftedList = new ArrayList<String>();
		// Iterate line by line.
		for (int i = 0; i < list.size(); i++) {
			ArrayList<String> t_list = list.get(i);
			// Iterate word by word.
			for (int j = 0; j < t_list.size(); j++) {
				// Remove the first word.
				String temp = t_list.get(0);
				for (int k = 0; k < t_list.size() - 1; k++) {
					// Shift elements to left.
					t_list.set(k, t_list.get(k + 1));
				}
				// Append first word at the end of the line.
				t_list.set(t_list.size() - 1, temp);
				// Create a single string with words in a line.
				temp = "";
				for (int k = 0; k < t_list.size(); k++) {
					temp += t_list.get(k) + " ";
				}
				shiftedList.add(temp); // Add to shifted list.
			}
			// Repeat shifting for each word in line.
		}
		return shiftedList;
	}

}

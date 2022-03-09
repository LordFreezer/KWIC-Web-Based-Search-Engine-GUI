package pak;

/*
 * @author Chad Marshall
 */
import java.util.ArrayList;

public class Shifter {
	/*
	 * EFFECTS: Takes an ArrayList of ArrayLists and shifts each word over one
	 * position. Each outer list holds a line of text from the JTextArea and each
	 * inner list individual words.
	 * 
	 * @param list of lists in exact order the user provided.
	 * 
	 * @return list of shifts of each line.
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
				System.out.println(temp);
			}
			// Repeat shifting for each word in line.
		}
		return shiftedList;
	}
	/*
	 * EFFECTS: Takes an ArrayList of Strings and converts it to ArrayList of ArrayList
	 * 
	 * @param list in exact order the user provided.
	 * 
	 * @return list sorted shifts.
	 */
	public static ArrayList<String> parse(ArrayList<String> list) {
		ArrayList<ArrayList<String>> shiftedList = new ArrayList<ArrayList<String>>();
		// Splits a single line by the whitespace, making an array of words.
		for (int i = 0; i < list.size(); i++) {
			String[] colWords = list.get(i).split(" ");
			ArrayList<String> t = new ArrayList<String>();
			// Convert array to list.
			for (int j = 0; j < colWords.length; j++) {
				t.add(colWords[j]);
			}
			shiftedList.add(t);// Add the list to the list of lists.
		}
		return circShift(shiftedList);
	}

}

package pak;

import java.util.ArrayList;

public class Shifter {

	public static ArrayList<String> circShift(ArrayList<ArrayList<String>> list) {
//		for (int i = 0; i < wor.size(); i++) {
//			String temp = wor.get(0);
//			for (int j = 0; j < wor.size() - 1; j++) {
//				wor.set(j, wor.get(j + 1));
//			}
//			wor.set(wor.size() - 1, temp);		
//			for (int j = 0; j < wor.size(); j++) {
//				System.out.print(wor.get(j) + " ");
//			}
//			System.out.println("\n");
//		}

		ArrayList<String> shiftedList = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			ArrayList<String> t_list = list.get(i);

			for (int j = 0; j < t_list.size(); j++) {
				String temp = t_list.get(0);
				for (int k = 0; k < t_list.size() - 1; k++) {
					t_list.set(k, t_list.get(k + 1));
				}
				t_list.set(t_list.size() - 1, temp);
				temp = "";
				for (int k = 0; k < t_list.size(); k++) {
					temp += t_list.get(k) + " ";
				}
				shiftedList.add(temp);
			}
			// System.out.println(shiftedList.get(i));
		}

		return shiftedList;
	}

}
